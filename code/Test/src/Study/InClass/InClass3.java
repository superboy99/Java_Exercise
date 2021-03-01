package Study.InClass;


/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/11 11:04 下午
 *
 * 接口名作为形参和返回值
 *
 * 方法的形参是接口名，需要的是该接口的实现类对象
 * 方法的返回值值是接口名，需要的是该接口的实现类对象
 */

interface Jumpping{
    void jump();
}

class Dog implements Jumpping{
    @Override
    public void jump(){
        System.out.println("狗跳高");
    }
}

class JumppingOperator {
    public void useJumpping(Jumpping j){
        j.jump();
    }
    public Jumpping getJumpping(){
        Jumpping j = new Dog();
        return j;
    }
}

public class InClass3 {
    public static void main(String[] args) {
        JumppingOperator jo = new JumppingOperator();
        Jumpping j = new Dog();
        jo.useJumpping(j);

        Jumpping j2 = jo.getJumpping();
        j2.jump();
    }
}
