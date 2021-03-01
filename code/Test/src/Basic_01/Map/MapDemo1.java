package Basic_01.Map;

/*
    Map集合概述
    interface Map<k,V> K:键的类型 V：值的类型

    V put(K key,V value)                 添加元素
    V remove(Object key)                 根据键删除键值对元素
    void clear()                         移除所有的键值对元素
    boolean containsKey(Object key)      判断集合是否包含指定的键
    boolean containsValue(Object value)  判断集合是否包含指定的值
    boolean isEmpty()                    判断集合是否为空
    int size()                           集合的长度，也就是集合中键值对的个数
 */

import java.util.HashMap;
import java.util.Map;

public class MapDemo1 {
    public static void main(String[] args) {
        //创建集合对象
        Map<String, String> map = new HashMap<String, String>();
        map.put("itheima","王丑鬼1"); //put 添加元素
        map.put("itheima","王丑鬼2");
        map.put("itheima","王丑鬼3");

        System.out.println(map);
    }
}
