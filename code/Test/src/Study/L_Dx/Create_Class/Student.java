package Study.L_Dx.Create_Class;

/*
学生类
    构造方法：
        作用：创建对象
        功能：完成对象数据的初始化
    格式：
        修饰符 类名（参数）{

        }
    修饰符一般用public
 */

//创建类
public class Student {
    //成员变量
    private String name;
    private int age;

    //构造方法
    public Student() {
        System.out.println("无参构造方法");
    }

    //成员方法
    public void show() {
        System.out.println(name + "，" + age);
    }

    public void setName(String name) {
        this.name = name;
    }
}
