package Study.L_Dx.Extends_Test;

class Fu7 {
    private void show() {
        System.out.println("Fu7类中show()方法被调用");
    }

    public void method() {
        System.out.println("Fu7类中method方法被调用");
    }
}

class Zi7 extends Fu7 {
    private void show() {
        System.out.println("Zi7类中的show方法被调用");
    }
}
public class Demo7 {
}
