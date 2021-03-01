package Basic_01.Collection;

/*
    TreeSet集合概述
    元素有序，可以按照一定的规则进行排序，具体排序方式取决于构造方法
        TreeSet():根据其元素的自然排序进行排序
        TreeSet(Comparator comparator) :根据指定的比较器进行排序

    没有带索引的方法，所以不能使用普通for循环遍历
    由于是Set集合，所以不包含重复元素的集合
 */

import java.util.TreeSet;

public class TreeSetDemo1 {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("hello");
        ts.add("world");
        ts.add("java");

        for (String s : ts) {
            System.out.println(s);
        }
    }
}
