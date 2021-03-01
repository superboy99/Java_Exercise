package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/12 1:56 下午
 *
 * 匿名内部类
 * 匿名内部类的前提
 *  存在一个类或者接口，可以是抽象类
 *
 * 格式：de
 *  new 类名或者接口名(){
 *      重写方法
 *  };
 *
 *  本质：匿名内部类是一个继承类该类或者实现类该接口的子类匿名对象
 *
 */

interface Inter4{
    void method();
}

public class InClass7 {
    public static void main(String[] args) {
        new Inter4() {
            @Override
            public void method() {
                System.out.println("匿名内部类");
            }
//        };
        }.method();//调用方法
    }
}
