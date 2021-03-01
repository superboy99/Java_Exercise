package Basic_01.Map;

/*
    HashMap集合练习之键是String值是Student
    案例需求
        创建一个HashMap集合，键是学号(String)，值是学生对象(Student)。存储三个键值对元素，并遍历
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

/*
    创建一个HashMap集合，键是学号（String），值是学生对象（Student），储存3个键值对元素，并遍历

 */

public class HashMapDemo1 {
    public static void main(String[] args) {
        HashMap<String,Student> hm = new HashMap<String,Student>();

        //创建学生类对象
        Student s1 = new Student("王丑鬼1",11);
        Student s2 = new Student("王丑鬼2",13);
        Student s3 = new Student("王丑鬼3",15);

        //将学生类添加到hm集合
        hm.put("iteima001",s1);
        hm.put("iteima002",s2);
        hm.put("iteima003",s3);

        //方式1：键找值
        Set<String> keySet = hm.keySet();
        for (String key : keySet){
            Student value = hm.get(key);
            System.out.println(key+","+value.getName()+","+value.getAge());
        }

        System.out.println("------------------------");

        //方式2：键值对对象找键和值
        Set<Map.Entry<String,Student>> entrySet = hm.entrySet();
        for (Map.Entry<String ,Student> me:entrySet){
            String key = me.getKey();
            Student value = me.getValue();
            System.out.println(key+","+value.getName()+","+value.getAge());
        }
    }
}
