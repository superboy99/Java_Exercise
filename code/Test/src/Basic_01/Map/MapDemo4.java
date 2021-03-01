package Basic_01.Map;

/*
    Map集合的遍历：

    获取所有键的集合，用keySet()方法
    遍历键的集合，获取每一个键，用增强for循环实现
    根据键去找值，用get(Object key)方法实现
    //添加元素

 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        //创建Map集合
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭静", "芙蓉");
        map.put("杨过", "小龙女");

        //获取map集合中的所有键的集合
        Set<String> keySet = map.keySet();

        //遍历jian集合中的每一个键
        for (String key : keySet) {

            //通过get(Object key)方法获取key集合中，每个key所对应的value
            String value = map.get(key);
            System.out.println(key + "," + value);
        }
    }
}
