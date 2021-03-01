package Basic_01.Collection;

/*
    创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student2 {
    private String name;
    private int age;

    public Student2() {

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

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

//测试类
public class ListDemo {
    public static void main(String[] args) {
        //创建list集合
        List<Student2> list = new ArrayList<Student2>();

        //创建学生对象
        Student2 s1 = new Student2("王丑鬼1", 1);
        Student2 s2 = new Student2("王丑鬼2", 2);
        Student2 s3 = new Student2("王丑鬼3", 3);

        //把学生添加到集合
        list.add(s1);
        list.add(s2);
        list.add(s3);

        //迭代器方式
        Iterator<Student2> it = list.iterator();
        while (it.hasNext()) {
            Student2 s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("----------------------------------");


        //for循环方式
        for(int i=0;i<list.size();i++){ //size()获取Array数组的储存的个数。
            Student2 s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
