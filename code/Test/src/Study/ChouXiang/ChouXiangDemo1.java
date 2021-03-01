package Study.ChouXiang;



abstract class Animal1 {  //抽象类在创建的时候 必须要加abstract关键字
    public abstract void eat(); //抽象类中创建抽象方法时，要加abstract关键字，但是不含有方法体

    public void sleep() {  //抽象类中可以创建非抽象方法
        System.out.println("睡觉");

    }
}

class Cat1 extends Animal1 {
    @Override
    public void eat() { //重写抽象类中的抽象方法
        System.out.println("猫吃鱼");
    }
}


public class ChouXiangDemo1 {
    public static void main(String[] args) {
        Animal1 a = new Cat1();  //按照多态的方式进行创建对象
        a.eat();
        a.sleep();
    }
}
