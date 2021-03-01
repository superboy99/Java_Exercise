package Study.L_Dx;

//定义类
class Student2 {
    //成员变量
    String name;
    private int age;

    //private关键字 需要使用set方法设置成员变量值，使用get方法获取成员变量的值
    public void setAge(int a) {
      //  age = a;
        if(a<0 || a>120) {
            System.out.println("你的输入有误");
        }else {
            age = a;
        }
    }

    public int getAge() {
        return age;
    }

    //成员方法
    public void study(){
        System.out.println("好好学习，天天向上");
    }

    public void doHomework(){
        System.out.println("kali学得好，局子进得早");
    }
}

public class Private_Test {
    public static void main(String[] args) {
        //创建对象
        Student s = new Student();

        //使用成员变量
        s.name = "Super Boy";
        s.age = 122;
        System.out.println(s.name + ":" + s.age);

        //使用成员方法
//        s.study();
//        s.doHomework();
    }
}
