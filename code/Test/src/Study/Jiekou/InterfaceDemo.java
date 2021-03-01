package Study.Jiekou;

interface Inter {
    public int num = 10; //等价于 int num = 10;
    public  final int num2 = 20;  //等价于 int num2 = 20;
    public static final int num3 = 30;  //等价于 int num3 = 30;

    public abstract void method();
}

//class InterImpl implements Inter { //等价于下面
class InterImpl extends Object implements Inter {
    public InterImpl() {
        super();
    }

    @Override
    public void method() {
        System.out.println("method方法被调用");
    }
}


public class InterfaceDemo {
    public static void main(String[] args) {
        Inter i = new InterImpl();
//        i.num = 20;  //接口中的变量默认被 final 修饰
        System.out.println(i.num);
//        i.num2 = 40; //接口中的变量默认被 final 修饰
        System.out.println(i.num2);
        System.out.println(Inter.num);  //通过接口名直接访问
        System.out.println(i.num3);
    }
}
