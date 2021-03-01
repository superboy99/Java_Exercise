package Basic_01;

class Student2 {
    private String name;
    private int age;

    public Student2(){

    }

    public Student2(String name,int age){
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student2)) return false;
        Student2 student2 = (Student2) o;
        return getAge() == student2.getAge() && getName().equals(student2.getName());
    }

    @Override
    public int hashCode() {
        return 0;
    }
}

public class Object2Demo {
    public static void main(String[] args) {
        Student2 s2 = new Student2();
        s2.setName("王丑鬼");
        s2.setAge(22);

        Student2 s3 = new Student2();
        s3.setName("王丑鬼");
        s3.setAge(22);

        System.out.println(s2.equals(s3));
    }
}
