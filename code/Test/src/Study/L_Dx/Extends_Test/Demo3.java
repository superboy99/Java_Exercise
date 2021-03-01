package Study.L_Dx.Extends_Test;

/*
    测试类
 */

class Fu3 {
    public int age = 40;
    }

class Zi3 extends Fu3 {
    public int age = 20;
    public void show() {
        int age = 30;

        //默认使用构造方法中的变量
        System.out.println(age + "\n");

        //如果需要使用成员变量age
        System.out.println(this.age + "\n");

        //如果需要使用父类成员中的变量
        System.out.println(super.age + "\n");
    }
}

public class Demo3 {
    public static void main(String[] args) {
        Zi3 z = new Zi3();
        z.show();
    }
}
