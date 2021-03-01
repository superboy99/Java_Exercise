package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/12 3:12 下午
 *
 * 匿名内部类在开发中的使用
 *  当发现某个方法需要，接口或者抽象类的子类对象
 *  我们可以传送一个匿名内部类过去，来简化传统代码
 *
 */

interface  Jumpping4 {
    void jump();
}

class Cat5 implements Jumpping4{
    @Override
    public void jump(){
        System.out.println("Cat5可以跳高");
    }
}

class Dog2 implements Jumpping4{
    @Override
    public void jump(){
        System.out.println("Dog可以跳高");
    }
}

class JumppingOperator4{
    public void method(Jumpping4 j){
        j.jump();
    }
}

public class InClass8 {
    public static void main(String[] args) {
        JumppingOperator4 jo = new JumppingOperator4();
        Jumpping4 j = new Cat5();
        jo.method(j);

        Jumpping4 j2 = new Dog2();
        jo.method(j2);
        System.out.println("------------");

        //匿名内部列的俄简化
        jo.method(new Jumpping4() {
            @Override
            public void jump() {
                System.out.println("狗跳高");
            }
        });
    }
}
