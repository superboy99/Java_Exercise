package Study.L_Dx.Extends_Test;

public class Demo4 {
    public static void main(String[] args) {
        Zi4 z = new Zi4();

        Zi4 z2 = new Zi4(20);
    }

    public static class Fu4 {
    //    public Fu4() {
    //        System.out.println("Fu4中无参构造方法被调用");
    //    }
        public Fu4() {

        }
        public  Fu4(int age) {
            System.out.println("Fu4中代参构造方法被调用");
        }
    }

    public static class Zi4 extends Fu4 {
        public Zi4() {
    //        super(20);
    //        super(); //默认被省略
            System.out.println("Zi4中无参构造方法被调用");
        }

        public Zi4(int age) {
    //        super(30);
    //        super(); //默认被省略
            System.out.println("Zi4中带参构造方法被调用 ");
        }
    }
}
