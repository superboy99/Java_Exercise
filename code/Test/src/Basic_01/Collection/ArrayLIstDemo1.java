package Basic_01.Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student4 {
    private String name;
    private int age;

    public Student4() {

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

    public Student4(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ArrayLIstDemo1 {
    public static void main(String[] args) {
        ArrayList<Student4> array = new ArrayList<Student4>();

        Student4 s1 = new Student4("王丑鬼1", 1);
        Student4 s2 = new Student4("王丑鬼2", 2);
        Student4 s3 = new Student4("王丑鬼3", 3);
        Student4 s4 = new Student4("王丑鬼4", 4);

        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);

        //Iterator 迭代器法
        Iterator<Student4> it = array.iterator();
        while (it.hasNext()) {
            Student4 s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }
        System.out.println("---------------------------------");

        //普通for
        for (int i = 0; i < array.size(); i++) {
            Student4 s = array.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
        System.out.println("---------------------------------");

        //增强for
        for (Student4 s : array) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
