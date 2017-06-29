package pareseData;


import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by 王洋 on 2017/6/22.
 * email:1440214507@qq.com
 * version:1.0
 * 成都嘉承兴业科技有限公司版权所有
 * des:注解管理转换类 注意！！内部类请一定使用public  还有，目标与parse对象一定要在一个包类，为了方便判断使用
 *     //如果获取到注解以 method:info .....之类的开头，代表去执行方法的get+被注解的属性名，使用此方式可以解决非常难嵌套
 */
public class DataChangeManager {
    private volatile static DataChangeManager dataChangeManager = null;
    //目标类的包名
    private String targetPackage;

    public static DataChangeManager getInstance() {
        if (dataChangeManager == null) {
            dataChangeManager = new DataChangeManager();
        }
        return dataChangeManager;
    }

    //映射网络目标集合
    private Map<String, Map<String, Field>> targetReflectsMaps = new HashMap<>();
    //网络解析的目标集合
    private Map<String, Map<String, String[]>> parseReflectsMaps = new HashMap<>();

    //初始化传入目标对象，需要被转换的对象
    private void addTarget(Class<?> clazz) {
        targetPackage = clazz.getPackage().getName();
        if (targetReflectsMaps.get(clazz.getName()) == null) {

            Field[] declaredFields = clazz.getDeclaredFields();
            Map<String, Field> clazzMaps = new HashMap<>();
            for (Field declaredField : declaredFields) {
                TargetKey targetKey = declaredField.getAnnotation(TargetKey.class);
                if (targetKey == null) {
                    continue;
                }
                declaredField.setAccessible(true);
                String key = targetKey.value();
                //初始化 target中的注解value 重复会覆盖
                clazzMaps.put(key, declaredField);
            }
            if (clazzMaps.size() > 0) {
                targetReflectsMaps.put(clazz.getName(), clazzMaps);
            }
        }
    }

    //添加网络解析对象
    private void addParse(Class<?> clazz) {
        if (parseReflectsMaps.get(clazz.getName()) == null) {
            Field[] declaredFields = clazz.getDeclaredFields();
            Map<String, String[]> fieldMap = new HashMap<>();
            for (Field declaredField : declaredFields) {
                ParseKey parseKey = declaredField.getAnnotation(ParseKey.class);
                //展示只支持List 和 ArrayList
                if (parseKey == null || parseKey.value().length == 0) {
                    if (isParse(declaredField)) {
                        //如果在同一个包，证明是自定义的，需要解析
                        addParse(declaredField.getType());
                    }
                    continue;
                }
                String[] keys = parseKey.value();
                fieldMap.put(declaredField.getName(), keys);

            }
            if (fieldMap.size() > 0) {
                parseReflectsMaps.put(clazz.getName(), fieldMap);
            }
        }
    }

    private boolean isParse(Field declaredField) {
        try {
            Class<?> type = declaredField.getType();
            Package aPackage = type.getPackage();
            String name = aPackage.getName();
            return targetPackage.equals(name);
        } catch (Exception e) {
            return false;
        }
    }

    private boolean isArrayList(Field declaredField) {
        return declaredField.getType().getSimpleName().equals("List") ||
                declaredField.getType().getSimpleName().equals("ArrayList");
    }

    /**
     * 开始解析
     *
     * @param target   被转换的目标
     * @param parseObj 网络数据
     */
    public <T> List<T> parseData(Class<T> target, List parseObj) {
        if (parseObj == null || parseObj.size() == 0) return null;
        Class<?> parseClass = parseObj.get(0).getClass();
        addTarget(target);
        addParse(parseClass);
        List<T> datas = new ArrayList<>();
        for (Object o : parseObj) {
            T targetOBj = null;
            try {
                targetOBj = target.newInstance();
                T t = setData(targetOBj, o);
                if (t != null) {
                    datas.add(t);
                }
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
        return datas;

    }

    private <T> T setData(T target, Object parse) {
        if (parse!=null) {
            //进行数据添加
            Field[] declaredFields = parse.getClass().getDeclaredFields();
            Map<String, Field> targetMap = targetReflectsMaps.get(target.getClass().getName());
            Map<String, String[]> parseMap = parseReflectsMaps.get(parse.getClass().getName());
            //if (parseMap==null)return null;
            try {

                for (Field fields : declaredFields) {
                    fields.setAccessible(true);
                    if (parseMap.containsKey(fields.getName())) {

                        for (String key : parseMap.get(fields.getName())) {
                            boolean isGetValueByMethod=false;
                            //如果获取到注解以 method:info .....之类的开头，代表去执行方法的get+被注解的属性名，使用此方式可以解决非常难嵌套
                            if (key.startsWith("method:")){
                               key=key.split(":")[1];
                               isGetValueByMethod=true;
                            }
                            Field field = targetMap.get(key);
                            if (field==null){
                                continue;
                            }
                            //这里格式定死  无论什么属性，一定要以 getName  get+注解值的第一个大写
                            if (isGetValueByMethod){
                                try {
                                    String name = fields.getName();
                                    String methodName = "get"+name.substring(0,1).toUpperCase()+name.substring(1);
                                    Method method = parse.getClass().getMethod(methodName);
                                    Object invokeValue = method.invoke(parse);
                                    field.set(target,invokeValue);
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }

                                continue;
                            }

                            String targetName = field.getType().getSimpleName();
                            String parseName = fields.getType().getSimpleName();
                            if (targetName.equals(parseName)) {//类型相同才设置
                                field.set(target, fields.get(parse));
                            }else{
                                Object o=getTargetValue(targetName,fields.get(parse));
                                if (o!=null){
                                    field.set(target,o);
                                }
                            }
                        }
                    } else if (isParse(fields)) {
                        Object o = fields.get(parse);
                        if (o==null || parseReflectsMaps.get(o.getClass().getName())==null){
                            continue;
                        }
                        setData(target, fields.get(parse));
                    }
                }
                return target;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
    //转换成目标类型
    private Object getTargetValue(String targetName, Object object) {
        Object obj=null;

        try {
            if (targetName.equals("int")){
                if (object instanceof String){
                    obj = Integer.parseInt(String.valueOf(object));
                }

            }else if (targetName.equals("String")){
                obj=String.valueOf(object);
            }else if (targetName.equals("long")){
                if (object instanceof String){
                    obj=Long.parseLong((String) object);
                }
            }else if(targetName.equals("Integer")){
                obj=Integer.valueOf(String.valueOf(object));
            }else if (targetName.equals("Long")){
                obj=Long.valueOf(String.valueOf(object));
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return obj;
    }

    /**
     * 解析Gson解析后的类
     * @param target
     * @param obj
     * @param <T>
     * @return
     */
    public <T> List<T>  parseGsonType(Class<T> target,Object obj){
        if (obj==null)return null;
        Field[] declaredFields = obj.getClass().getDeclaredFields();
        List<T> datas=null;
        for (Field declaredField : declaredFields) {
            declaredField.setAccessible(true);
            ResultCode resultCode = declaredField.getAnnotation(ResultCode.class);
            if (resultCode!=null){
                String successCode = resultCode.value();
                try {
                    Object o = declaredField.get(obj);
                    if (!successCode.equals(String.valueOf(o))){//如果解析结果返回为不成功就为空
                        return null;
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            DataLocation dataLocation = declaredField.getAnnotation(DataLocation.class);
            if (dataLocation==null){
                continue;
            }
            try {

                datas= (List<T>) declaredField.get(obj);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }

        }
        return parseData(target,datas);

    }


}
