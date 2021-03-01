package Basic_01.Collection;

/*
    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

class Student {
    private String name;
    private int age;

    public Student() {

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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class CollectionDemo2 {
    public static void main(String[] args) {
        Collection<Student> c = new ArrayList<Student>();

        Student s1 = new Student("王丑鬼1", 1);
        Student s2 = new Student("王丑鬼2", 2);
        Student s3 = new Student("王丑鬼3", 3);

        c.add(s1);
        c.add(s2);
        c.add(s3);

        Iterator<Student> it = c.iterator();
        while (it.hasNext()) {
            Student s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
