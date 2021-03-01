package Study.L_Dx.Extends_Test;

class Student10 {
    public int age = 20;
}

public class Demo10 {
    public static void main(String[] args) {
        final int age = 20;
        System.out.println(age);

        final Student10 s = new Student10();
        s.age=100;
        System.out.println(age);
    }
}
