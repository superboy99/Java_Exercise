package Study.ChouXiang;

abstract class Animal2{

    private int age = 20;
    private final String city = "北京"; //final修饰，这是一个常量，不可改变

    public Animal2() {}

    public Animal2(int age) {
        this.age = age;
    }

    public void show() {
        age = 40;
        System.out.println(age);
        System.out.println(city);
    }

    public abstract void eat();
}

class Cat2 extends Animal2{
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class ChouXiangDemo2 {
    public static void main(String[] args) {
        Animal2 a = new Cat2();
        a.show();
        a.eat();
    }
}
