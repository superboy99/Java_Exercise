package Basic_01.Map;

/*
    统计字符串中每个字符出现的次数

    案例需求
    键盘录入一个字符串，要求统计字符串中每个字符串出现的次数。
    举例:键盘录入“aababcabcdabcde” 在控制台输出:“a(5)b(4)c(3)d(2)e(1)”
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class HashMapTestDemo {
    public static void main(String[] args) {

        //键盘输入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串: ");
        String line = sc.nextLine();

       //创建HashMap集合 键是Character 值是Integer
        HashMap<Character,Integer> hm = new HashMap<Character,Integer>();

        //遍历字符串
        for (int i = 0;i<line.length();i++){
            char key = line.charAt(i); //charAt()返回指定索引处的元素

            //拿到的每一个字符作为键到HashMap中去找对应的值，看其返回值
            Integer value = hm.get(key);

            if (value == null){
                hm.put(key,1);
            }else {
                value++;
                hm.put(key,value);
            }
        }

        //遍历HashMap集合，得到的键和值，按要求进行拼接
        StringBuilder sb = new StringBuilder();

        Set<Character> keySet = hm.keySet();
        for(Character key : keySet){
            Integer value = hm.get(key);
            sb.append(key).append("(").append(value).append(")");
        }

        String result = sb.toString();
        System.out.println(result);
    }
}
