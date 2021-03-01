package Study.L_Dx;

//创建类
class Student {
    //成员变量
    String name;
    int age;

    //成员方法
    public  void study() {
        System.out.println("好好学习，天天向上");
    }

    public void doHomework() {
        System.out.println("kali学得好，局子进得早");
    }

}

//创建对象及使用对象
public class StudentDemo {
    public static void main(String[] args) {
        //创建对象
        Student1 s = new Student1();
        s.name = "Super Boy";
        s.age = 22;

        System.out.println(s.name + "," + s.age);
        s.study();
        s.doHomework();
    }
}
