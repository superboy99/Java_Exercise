package Basic_01.Map;

/*
    遍历Map集合2：

    获取所有键值对对象集合：
        Set<Map.Entry<String,String>> entrySet():获取所有键值对象的集合

    遍历键值对象集合，获取每一个键值对对象
        用增强for循环实现，得到每一个Map.Entry

    根据键值对对象获取键和值
        getKey()得到键
        getValue()得到值

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo5 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("张无忌", "赵敏");
        map.put("郭静", "芙蓉");
        map.put("杨过", "小龙女");

        //获取所有键值对对象集合
        Set<Map.Entry<String, String>> entryset = map.entrySet();

        //增强for循环获取键值对对象集合的每一个键值对
        for (Map.Entry<String, String> me : entryset) {

            //getKey()获取key
            String key = me.getKey();

            //getValue()获取value
            String value = me.getValue();

            System.out.println(key + "," + value);
        }
    }
}
