package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/11 9:46 下午
 *
 * 类名作为形参和返回值
 *
 * 方法的形参是类名，其实需要的是该类的对象
 * 实际传送的是该对象的【地址值】
 *
 * 类名作为方法的返回值，其实需要的是该类的对象
 * 传送的是该对象的【地址值】
 */

class Cat1{
    public void eat(){
        System.out.println("猫吃鱼");
    }
}

class CatOperator{
    public void useCat(Cat1 c){ //Cat c = new Cat();创建了一个Cat的对象 能调用一个方法
        c.eat();
    }
    public Cat1 getCat(){
        Cat1 c = new Cat1();
        return c; //c是cat类型的一个对象
    }
}
public class InClass1 {
    public static void main(String[] args) {
        CatOperator co = new CatOperator();
        Cat1 c = new Cat1();
        co.useCat(c);//需要一个对象

        Cat1 c2 = co.getCat();
        c2.eat();

    }
}
