package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/11 10:16 下午
 *
 * 抽象类作为形参和返回值
 *
 * 方法的形参是抽象类名，其实需要的是该抽象类的子类对象
 * 方法的返回值是抽象累吗，其实需要的是该抽象类的子类对象
 */

abstract class Animal2{
    public abstract void eat();
}

//抽象类Animal2的子类
class Cat2 extends Animal2{
    @Override
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

//animal2类的操作类
class AnimalOperator2{
    public void useAnimal(Animal2 a){
        a.eat();
    }

    public Animal2 getAnimal2(){
        Animal2 a = new Cat2();
        return a;
    }
}


public class InClass2 {
    public static void main(String[] args) {
        AnimalOperator2 ao2 = new AnimalOperator2();
        Animal2 a = new Cat2();
        ao2.useAnimal(a);

        Animal2 a2 = ao2.getAnimal2();
        a2.eat();
    }
}
