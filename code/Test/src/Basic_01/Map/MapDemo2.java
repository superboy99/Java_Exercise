package Basic_01.Map;

/*
    Map集合常用方法：

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

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("张无忌","赵敏");
        map.put("郭静","芙蓉");
        map.put("杨过","小龙女");

        System.out.println(map.size());
        System.out.println(map.isEmpty());

        System.out.println(map.containsKey("郭静"));

        System.out.println(map.containsValue("小龙女"));

    }
}
