package Basic_01.Collection;

/*
    比较器排序Comparator的使用

    存储学生对象并遍历，创建TreeSet集合使用带参构造方法
    要求:按照年龄从小到大排序，年龄相同时，按照姓名的字母顺序排序
 */

import java.util.Comparator;
import java.util.TreeSet;

class Student8 {
    private String name;
    private int age;

    public Student8() {

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

    public Student8(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class TreeSetDemo3 {
    public static void main(String[] args) {
        //创建集合对象
        TreeSet<Student8> ts = new TreeSet<Student8>(new Comparator<Student8>() {
            @Override
            public int compare(Student8 s1, Student8 s2) {
                int num = s1.getAge() - s2.getAge();
                int num2 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num2;
            }
        });

        //创建学生对象
        Student8 s1 = new Student8("ptc",21);
        Student8 s2 = new Student8("sy",20);
        Student8 s3 = new Student8("pjc",23);
        Student8 s4 = new Student8("fxy",22);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);

        for(Student8 s : ts){
            System.out.println(s.getName()+"," + s.getAge());
        }
    }
}
