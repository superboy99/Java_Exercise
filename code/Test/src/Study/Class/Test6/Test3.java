package Study.Class.Test6;

class Rectangle {
    public int l;
    public int w;
    public int s;

    public void s() {
        s = l * w;
        System.out.println("矩形面积：" + s);
    }
}

class Cuboid extends Rectangle{
    public int h;
    public int v;

    public void v() {
        v = l * w * h;
        System.out.println("长方体体积：" + v );
    }
}

public class Test3 {
    public static void main(String[] args) {
        Rectangle r= new Rectangle();
        r.l=10;
        r.w=30;
        r.s();

        Cuboid c = new Cuboid();
        c.l=10;
        c.w=30;
        c.h=40;
        c.v();
    }
}
