package Study.DuoTai;

/*
    同一个对象，在不同时刻表现出来的不同形态。

举例：猫
	我们可以说猫是猫：猫cat = new 猫();
	我们也可以说猫是动物：动物animal = new 猫();
	这里在不同的时刻表现出来了不同的形态，就是多态。

多台的前提和体现
	1. 有继承/实现关系
	2. 有方法重写
	3. 有父类引用指向子类对象

 */

class Animal{
    public void eat() {
        System.out.println("动物要吃东西");
    }
}

//1。继承与/Animal类
class Cat extends Animal {
    //2。对父类方法的重写
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

public class DuoTai1 {
    public static void main(String[] args) {
        //3。由父类引向子类对象
        Animal a = new Cat();
        a.eat();
    }
}
