package Basic_01.Generic;

/*
    可变参数：
    格式：修饰符 返回值类型 方法名(数据类型... 数据) {  }
    这里的变量表示一个数组
    一个方法包含多个参数，可变参数要放在最后
 */


public class ArgsDemo1 {
//    public static int sum(int a, int b) {
//        return a + b;
//    }
//
//    public static int sum(int a, int b, int c) {
//        return a + b + c;
//    }
//
//    public static int sum(int a, int b, int c, int d) {
//        return a + b + c + d;
//    }

    public static int sum(int... a){
        int sum = 0;
        for(int i : a){
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));
    }
}
