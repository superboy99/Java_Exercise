package Study.DuoTai;

/*
    1.2 多态中成员访问特点
	1. 成员变量：变异看左边（父类），执行看左边（父类）
	2. 成员方法：编译看左边（父类），子类看右边（子类）

	为什么成员变量和成员方法的访问不一样？
	因为成员方法有重写，而成员变量没有


 */
class Animal2 {
    public int age = 40;
    public void eat(){
        System.out.println("动物吃东西");
    }
}

class Cat2 extends Animal2 {
    public int age = 20;
    public int weight = 20;

    @Override
    public void eat() {
        System.out.println("猫吃鱼" + "子类中的成员方法");
    }

    public void PlayGame() {
        System.out.println("猫捉迷藏");
    }
}

public class DuoTai2 {
    public static void main(String[] args) {
        //成员变量：编译看左边 执行看左边
        //成员方法：编译看左边 执行看右边
        Animal2 a = new Cat2();
        System.out.println(a.age + "      访问的父类中的成员变量");     //引用的是父类中的成员变量
//        System.out.printf(a.weight); //不能访问子类中父类未存在的成员变量
        a.eat();                         //访问的是子类中重写后的的成员方法
//        a.PlayGame();                  //访问的是
    }
}
