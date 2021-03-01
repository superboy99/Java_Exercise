package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/12 1:34 下午
 *
 * 局部内部类
 *
 * 位置：是在方法中定义的类
 * 方式：
 *  1 局部内部类，外接无法直接使用，需要在方法内部创建对象并使用
 *  2 该类可以直接访问外部类的成员，也可以访问方法内部局部变量
 *
 */

class Outer3{
    private int A = 10;

    public void method(){
        int B = 20;
        class Inner3 { // 该类在方法中
            public void show(){
                System.out.println(A);
                System.out.println(B);
            }
        }
        Inner3 i = new Inner3();
        i.show();
    }
}
public class InClass6 {
    public static void main(String[] args) {
        Outer3 o = new Outer3();
        o.method();
    }
}
