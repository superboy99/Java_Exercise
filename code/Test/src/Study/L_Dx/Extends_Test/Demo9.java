package Study.L_Dx.Extends_Test;

class Fu8 {
    public void show1() {
        System.out.println("public");
    }

    void show2() {
        System.out.println("默认");
    }

    protected void show3() {
        System.out.println("protected");
    }

    private void show4() {
        System.out.println("private");
    }

    public static void main(String[] args) {
        Fu8 f = new Fu8();
        f.show1();
        f.show2();
        f.show3();
        f.show4();
    }
}

class Zi8 extends Fu8 {
    public static void main(String[] args) {
        Zi8 z = new Zi8();
        z.show1();
        z.show2();
        z.show3();
//        z.show4(); //private只能在本类中使用
    }
}


public class Demo9 {
}
