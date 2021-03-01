package Study.JiCheng;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/10 2:59 下午
 */
class Fu{
    public void show(){
        System.out.println("Fu类中show方法被调用");
    }
}

class Zi extends Fu{
    public void method(){
        System.out.println("Zi类中method方法被调用");
    }
    public void show(){
        super.show();
        System.out.println("Zi类中show方法被调用");
    }
}

public class JiCheng1 {
    public static void main(String[] args) {
        Zi z = new Zi();
        z.method();
        z.show();
    }
}
