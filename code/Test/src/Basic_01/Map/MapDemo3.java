package Basic_01.Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
    Map集合的获取功能
    V get(Object key):根据键获取

    Set keySet() :获取所有键的集合

    Collection values() : 获取所有值的集合

    
 */
public class MapDemo3 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        //添加元素
        map.put("张无忌", "赵敏");
        map.put("郭静", "芙蓉");
        map.put("杨过", "小龙女");

        //V get(Object key)根据键获取值
        System.out.println(map.get("张无忌"));
        System.out.println(map.get("郭静"));
        System.out.println(map.get("杨过"));

        System.out.println("--------------------");

        //获取所有键的集合
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(key);
        }

        System.out.println("--------------------");

        //Colection<V> value():获取所有值的集合
        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }
}
