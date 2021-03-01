package Basic_01.Collection;

/*
    成绩排序

    用TreeSet集合存储多个学生信息(姓名，语文成绩，数学成绩)，并遍历该集合
    要求:按照总分从高到低出现
 */

import java.util.Comparator;
import java.util.TreeSet;

class Student9 {
    private String name;
    private int chinese;
    private int math;

    public Student9() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChinese() {
        return chinese;
    }

    public void setChinese(int chinese) {
        this.chinese = chinese;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getSum(){
        return this.chinese + this.math;
    }

    public Student9(String name, int chinese, int math) {
        this.name = name;
        this.chinese = chinese;
        this.math = math;
    }


}

public class TreeSetDemo4 {
    public static void main(String[] args) {

        //创建StreeSet集合对象，通过比较器进行排序
        TreeSet<Student9> ts = new TreeSet<Student9>(new Comparator<Student9>() {
            @Override
            public int compare(Student9 s1, Student9 s2) {

                //主要条件
                int num = s2.getSum() - s1.getSum();

                //次要条件
                int num2 = num == 0 ? s1.getChinese() - s2.getChinese() : num;

                int num3 = num == 0 ? s1.getName().compareTo(s2.getName()) : num;
                return num3;
            }
        });

        Student9 s1 = new Student9("王丑鬼1", 98, 100);
        Student9 s2 = new Student9("王丑鬼2", 95, 95);
        Student9 s3 = new Student9("王丑鬼3", 98, 93);
        Student9 s4 = new Student9("王丑鬼4", 100, 97);
        Student9 s5 = new Student9("王丑鬼5", 98, 98);

        ts.add(s1);
        ts.add(s2);
        ts.add(s3);
        ts.add(s4);
        ts.add(s5);

        for (Student9 s : ts) {
            System.out.println(s.getName() + "," + s.getChinese() + "," + s.getMath());
        }
    }
}
