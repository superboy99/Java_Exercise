package Basic_01.Generic;

/*
    范型接口
    格式：修饰符 interface 接口名<类型>{  }
 */

//接口
interface Generic3<T> {
    void show(T t);
}

//接口实现类
class Generic3Impl<T> implements Generic3<T> {
    @Override
    public void show(T t) {
        System.out.println(t);
    }
}

//测试类
public class GenericDemo3 {
    public static void main(String[] args) {
        Generic3<String> g1 = new Generic3Impl<String>();
        g1.show("王丑鬼");

        Generic3<Integer> g2 = new Generic3Impl<Integer>();
        g2.show(22);
    }
}
