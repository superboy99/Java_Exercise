package Study.Jiekou;
/*
    接口的特点：
	1. 接口用关键字interface修饰
		Public interface 接口名 { }
	2. 类实现接口用implements表示
		Public class 类名 implements 接口名 { }
	3. 接口不能实例化
		参照多态的方式，通过实现类对象实例化，这叫接口多态。
		多态的形式：具体类多态，抽象类多态，接口多态。
		多态的前提：有继承或者实现关系；有方法重写；有父（类/接口）引用指向（子/实现）类对象
	4. 接口的实现类
		要么重写接口中的所有抽象方法
		要么是抽象类
 */


//创建一个接口
interface JumpPing{
    public abstract void jump();
}

abstract class Animal{
    private String name;
    private int age;

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

    public static void eat(){

    }
}

//创建一个类 实现 接口
class Cat1 implements JumpPing{
    @Override
    public void jump() {
        System.out.println("猫可以跳高了");
    }
}



interface Humen{
    public abstract void eat();
    public abstract void run();
    public abstract void swimming();
    public abstract void play();
}

class Sport implements Humen{
    @Override
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void run(){
        System.out.println("人可以跑步");
    }
    public void swimming(){
        System.out.println("人可以游泳");
    }
    public void play(){
        System.out.println("人可以打球");
    }
}


/*
    测试类
 */
public class JumpPingDemo {
    public static void main(String[] args) {
        JumpPing j = new Cat1();
        j.jump();
        Humen h = new Sport();
        h.eat();
        h.run();
        h.play();
        h.swimming();
    }
}
