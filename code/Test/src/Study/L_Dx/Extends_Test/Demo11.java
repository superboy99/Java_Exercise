package Study.L_Dx.Extends_Test;

class Student11 {
    public String name;
    public int age;
    public static String university;

    public void show() {
        System.out.println(name + " ;" + age + " ;" + university);
    }
}

public class Demo11 {
    public static void main(String[] args) {
        Student11.university = "cqy"; //通过类名访问
        Student11 s1 = new Student11();
        s1.name="SuperBoy";
        s1.age=22;
        s1.show();

        Student11 s2 = new Student11();
        s2.name="王丑鬼";
        s2.age=21;
        s2.show();
    }
}
