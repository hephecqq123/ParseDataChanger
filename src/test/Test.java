package test;


import pareseData.DataChangeManager;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by 王洋 on 2017/6/22.
 * email:1440214507@qq.com
 * version:1.0
 * 成都嘉承兴业科技有限公司版权所有
 * des:
 */
public class Test {
    public static void main(String[] agrs) {
      T t =new T("你奶奶的");
      List<T> list =new ArrayList<>();
      list.add(t);
        List<Room> rooms = DataChangeManager.getInstance().parseData(Room.class, list);
        for (Room room : rooms) {
            room.toString();
        }
    }
}