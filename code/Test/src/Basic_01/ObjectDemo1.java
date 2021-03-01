package Basic_01;

class Student1 extends Object{
    private String name;
    private int age;

    public Student1(){}

    public Student1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Studen{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class ObjectDemo1 {
    public static void main(String[] args) {
        Student1 s = new Student1();
        s.setName("王丑鬼");
        s.setAge(22);
        System.out.println(s);
        System.out.println(s.toString());
    }
}
