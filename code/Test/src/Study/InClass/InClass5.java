package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/12 1:19 下午
 *
 * 成员内部类
 * 格式：外部类名.内部类名=外部对象.内部对象；
 *
 *
 */

class Out2{
    private int A = 10;
    public class Inner2{
        public void show(){
            System.out.println(A); //内部类直接访问外部类
        }
    }
    public void method() { //外部类访问内部类 需要创建对象
        Inner2 i = new Inner2();
        i.show();
    }
}

public class InClass5 {
    public static void main(String[] args) {
        Out2.Inner2 oi = new Out2().new Inner2();
        oi.show();

//        Out2 o = new Out2();
//        o.method();
    }
}
