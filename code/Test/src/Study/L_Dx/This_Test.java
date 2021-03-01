package Study.L_Dx;

class Student3 {
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int a) {
        age = a;
    }
    public int getAge() {
        return age;
    }

    public void show() {
        System.out.println(name + ":" + age);
    }
}
public class This_Test {
    public static void main(String[] args) {
        //创建对象
        Student3 s = new Student3();
        //使用成员变量
        s.setName("Super Boy");
        s.setAge(22);

        //使用成员方法
        s.show();
    }
}
