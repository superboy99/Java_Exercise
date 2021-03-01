//package Study.L_Dx.Extends_Test;
//
//import com.sun.xml.internal.ws.api.ha.StickyFeature;
//
//class Teacher {
//    private String name;
//    private int age;
//    public  Teacher() {
//    }
//    public Teacher(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name=name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age = age;
//    }
//    public void Teach() {
//        System.out.println("用心成就每一个学生");
//    }
//}
//
//class Student {
//    private String name;
//    private int age;
//    public Student() {
//    }
//    public Student(String name,int age) {
//        this.name=name;
//        this.age=age;
//    }
//    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//         this.name=name;
//    }
//    public int getAge() {
//        return age;
//    }
//    public void setAge(int age) {
//        this.age=age;
//    }
//    public void Study() {
//        System.out.println("好好学习，天天向上");
//    }
//}
//
//public class Test1 {
//    public static void main(String[] args) {
//        Teacher t1 = new Teacher();
//        t1.setName("SuperBoy");
//        t1.setAge(22);
//        System.out.println(t1.getName() + "," + t1.getAge());
//        t1.Teach();
//
//        System.out.print("\n");
//
//        Teacher t2 = new Teacher("王丑鬼",21);
//        System.out.println(t2.getName() + "," + t2.getAge());
//        t2.Teach();
//
//    }
//}
