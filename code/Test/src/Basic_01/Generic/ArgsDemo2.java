package Basic_01.Generic;

/*
    可变参数的使用：

    Arrays工具类中有一个静态方法:
        public static List asList(T... a):返回由指定数组支持的固定大小的列表
        返回的集合不能做增删操作，可以做修改操作

    List接口中有一个静态方法:
        public static List of(E... elements):返回包含任意数量元素的不可变列表
        返回的集合不能做增删改操作

    Set接口中有一个静态方法:
        public static Set of(E... elements) :返回一个包含任意数量元素的不可变集合
        在给元素的时候，不能给重复的元素
        返回的集合不能做增删操作，没有修改的方法
 */

public class ArgsDemo2 {

}
