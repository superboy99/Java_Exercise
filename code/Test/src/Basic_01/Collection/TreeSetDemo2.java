package Basic_01.Collection;
/*
    自然排序Comparable的使用

    存储学生对象并遍历，创建TreeSet集合使用无参构造方法
    要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */

import java.util.TreeSet;

class Student6 implements Comparable<Student6> {
    private String name;
    private int age;

    public Student6() {

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

    public Student6(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student6 s) { //重写compareble接口中的comparTo方法
//        return -1;//倒序
//        return 0;
//        return 1;//升序

        //按照年龄升序
        int num = this.age - s.age;

        //年龄相同时，按姓名的字母顺序排
        int num2 = num == 0 ? this.name.compareTo(s.name) : num;
        return num2;
    }
}


public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet<Student6> ts = new TreeSet<Student6>();
        Student6 s1 = new Student6("ptc", 20);
        Student6 s2 = new Student6("sy", 19);
        Student6 s3 = new Student6("pjc", 23);
        Student6 s4 = new Student6("fxy", 22);
        Student6 s5 = new Student6("sk", 22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student6 s : ts) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
