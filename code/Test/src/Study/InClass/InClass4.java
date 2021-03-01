package Study.InClass;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/12 10:36 上午
 *
 * 内部类的访问特点
 *  内部类可以直接访问外部类的成员，包括私有
 *  外部类要访问内部类的成员，必须创建对象
 *
 */
public class InClass4 {
    private int A = 10;
    public class Inner1{
        public void show(){
            System.out.println(A);
        }
    }

    public void method(){
        Inner1 i = new Inner1();
        i.show();
    }

}
