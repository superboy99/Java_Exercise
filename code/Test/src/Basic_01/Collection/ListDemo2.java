package Basic_01.Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Student3 {
    private String name;
    private int age;

    public Student3() {

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

    public Student3(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ListDemo2 {
    public static void main(String[] args) {
        //创建List集合
        List<Student3> list = new ArrayList<Student3>();

        Student3 s1 = new Student3("王丑鬼1", 1);
        Student3 s2 = new Student3("王丑鬼2", 2);
        Student3 s3 = new Student3("王丑鬼3", 3);
        Student3 s4 = new Student3("王丑鬼4", 4);

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        //Iterator迭代器
        Iterator<Student3> it = list.iterator();
        while (it.hasNext()) {
            Student3 s = it.next();
            System.out.println(s.getName() + "," + s.getAge());
        }

        System.out.println("-------------------------------");

        //普通for循环
        for(int i=0;i<list.size();i++){
            Student3 s = list.get(i);
            System.out.println(s.getName()+","+s.getAge());
        }

        System.out.println("-------------------------------");

        //增强for循环
        for(Student3 s : list){
            System.out.println(s.getName()+","+s.getAge());
        }
    }
}
