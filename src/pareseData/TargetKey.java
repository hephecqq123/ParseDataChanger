package pareseData;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by 王洋 on 2017/6/22.
 * email:1440214507@qq.com
 * version:1.0
 * 成都嘉承兴业科技有限公司版权所有
 * des:需要转换的key名称
 * 这个注解于需要被转换的对象->目标
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface TargetKey {
    String value();
}
