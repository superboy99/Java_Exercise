package Study.L_Dx.Extends_Test;
class Fu5 {
    public void show() {
        System.out.println("Fu5中show()方法被调用");
    }
}

class Zi5 extends Fu5 {
    public void method() {
        System.out.println("Zi5中method方法被调用");
    }
    public void show() { //可以直接使用父类中的方法
        super.show();    // 调用父类中的方法
        System.out.println("Zi5中show()方法被调用");
    }
}
public class Demo5 {
    public static void main(String[] args) {
        Zi5 z = new Zi5();
        z.method();
        z.show();
    }
}
