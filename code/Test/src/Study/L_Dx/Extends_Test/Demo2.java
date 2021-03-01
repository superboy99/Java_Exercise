package Study.L_Dx.Extends_Test;
/*
    测试类
 */

class Fu2 {
    //创建类成员
    public int age = 22;
    }

class Zi2 extends Fu2 {  //表示Zi2 继承 Fu2
    //类成员
    public int height = 175;

    //成员方法
    public void show() {
        System.out.println("age: " + age);  //由于继承Fu2，所以可以使用Fu2的内容
        System.out.println("height: " + height);
    }
}

public class Demo2 {
    public static void main(String[] args) {
        //创建对象
        Zi2 z = new Zi2();
        z.show();
    }
}
