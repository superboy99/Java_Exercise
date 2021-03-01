package Basic_01.Generic;

/*
    范型类
    格式：修饰符 class Generic<T>{  }
 */

class Generic1<T>{
    private T t;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}

public class GenericDemo1 {
    public static void main(String[] args) {
        Generic1<String> g1 = new Generic1<String>();
        g1.setT("王丑鬼");
        System.out.println(g1.getT());

        Generic1<Integer> g2 = new Generic1<Integer>();
        g2.setT(22);
        System.out.println(g2.getT());

        Generic1<Boolean> g3 = new Generic1<Boolean>();
        g3.setT(true);
        System.out.println(g3.getT());
    }
}
