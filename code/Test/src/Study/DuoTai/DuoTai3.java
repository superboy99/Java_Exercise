package Study.DuoTai;

/*
    多态的好处和弊端：
	好处：提高了程序的扩展性
		具体体现：定义方法的时候，使用父类型作为参数，将来在使用的时候，使用具体的子类型参与操作

	弊端：不能使用子类特有的功能（方法）

 */

class Animal3{
    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Cat3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}

class Dog3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

}

class Pig3 extends Animal3 {
    @Override
    public void eat() {
        System.out.println("猪吃白菜");
    }
}


class AnimalOperator{
//    public void uerAnimal(Cat3 c) { //Cat3 c = new Cat3();
//        c.eat();
//
//    }
//    public void userAnimal(Dog3 d) { //Dog3 d = new Dog3();
//        d.eat();
//    }
    public void usrAnimal(Animal3 a) { //Animal3 a = new Animal3();
        a.eat();
    }
}

public class DuoTai3 {
    public static void main(String[] args) {
        AnimalOperator ao = new AnimalOperator();
        Cat3 c = new Cat3();

        ao.usrAnimal(c);

        Dog3 d = new Dog3();
        ao.usrAnimal(d);

        Pig3 p = new Pig3();
        ao.usrAnimal(p);

    }
}
