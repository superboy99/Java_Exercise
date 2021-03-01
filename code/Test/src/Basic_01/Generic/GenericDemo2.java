package Basic_01.Generic;

/*
    范型方法
    格式：修饰符 <类型> 返回值类型 方法名（类型 变量名）{  }
 */

class Generic2{
    public <T> void show(T t){
        System.out.println(t);
    }
}

public class GenericDemo2 {
    public static void main(String[] args) {
        Generic2 g = new Generic2();
        g.show("王丑鬼");
        g.show(22);
        g.show(false);
        g.show(5.5);
    }
}
