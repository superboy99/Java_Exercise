package Basic_01.Collection;

import java.util.HashSet;
import java.util.Objects;

class Student5 {
    private String name;
    private int age;

    public Student5() {

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

    public Student5(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student5)) return false;
        Student5 student5 = (Student5) o;
        return getAge() == student5.getAge() && Objects.equals(getName(), student5.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }
}

public class HashSetDemo1 {
    public static void main(String[] args) {
        HashSet<Student5> hs = new HashSet<Student5>();

        Student5 s1 = new Student5("王丑鬼1", 1);
        Student5 s2 = new Student5("王丑鬼2", 2);
        Student5 s3 = new Student5("王丑鬼3", 3);
        Student5 s4 = new Student5("王丑鬼4", 4);

        Student5 s5 = new Student5("王丑鬼4", 4);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);
        hs.add(s4);

        hs.add(s5);

        for (Student5 s : hs) {
            System.out.println(s.getName() + "," + s.getAge());
        }
    }
}
