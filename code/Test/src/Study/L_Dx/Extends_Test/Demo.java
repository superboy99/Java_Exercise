package Study.L_Dx.Extends_Test;

/*
    测试类
 */
class Fu {
    public void show() {
        System.out.println("show方法被调用");
    }
}

class Zi extends Fu {
    public void method() {
        System.out.println("Zi类中method方法被调用");
    }
}

public class Demo {
    public static void main(String[] args) {
        Fu f = new Fu();
        f.show();

        Zi z = new Zi();
        z.method();
        z.show();
    }
}
