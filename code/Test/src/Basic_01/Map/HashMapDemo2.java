package Basic_01.Map;

/*
    键是Student 值是String
 */

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;
        Student2 student2 = (Student2) o;
        return getAge() == student2.getAge() && Objects.equals(getName(), student2.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

public class HashMapDemo2 {
    public static void main(String[] args) {
        HashMap<Student2, String> hm = new HashMap<Student2, String>();

        Student2 s1 = new Student2("王丑鬼1", 30);
        Student2 s2 = new Student2("王丑鬼2", 32);
        Student2 s3 = new Student2("王丑鬼3", 36);
        Student2 s4 = new Student2("王丑鬼4", 33);

        hm.put(s1, "渝北");
        hm.put(s2, "江北");
        hm.put(s3, "北碚");
        hm.put(s4, "大学城");

        Set<Student2> keySet = hm.keySet();
        for (Student2 key : keySet) {
            String value = hm.get(key);
            System.out.println(key.getName() + "," + key.getAge() + "," + value);
        }
    }
}
