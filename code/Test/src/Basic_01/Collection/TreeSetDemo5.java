package Basic_01.Collection;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
    不重复的随机数案例
    获取10个1-20之间的随机数，要求随机数不能重复，并在控制台输出
 */
public class TreeSetDemo5 {
    public static void main(String[] args) {

        //创建set集合
        Set<Integer> set = new TreeSet<Integer>();

        //创建随机数对象
        Random r = new Random();

        //判断集合的长度是否小于10
        while (set.size()<10){
            //产生一个随机数添加到集合
            int number = r.nextInt(20) + 1;
            set.add(number);
        }

        //遍历集合
        for(Integer i : set){
            System.out.println(i);
        }
    }
}
