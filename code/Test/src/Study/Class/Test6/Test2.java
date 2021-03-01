//package Study.Class.Test6;
//
//import com.sun.xml.internal.ws.api.ha.StickyFeature;
//
//class Birds {
//    public int wing = 2;
//    public int foot = 2;
//
//    public void fly() {
//        System.out.println("鸟都有" + wing + "只翅膀");
//    }
//
//    public void run() {
//        System.out.println("鸟都有" + foot + "条腿");
//    }
//}
//
//class Sparrow extends Birds{
//    public int age;
//    public int wight;
//
//    public void show1(){
//        System.out.println("Sparrow的年龄：" + age + ", 重量:" + wight);
//    }
//}
//
//class Ostrich extends Birds {
//    public int height;
//    public int speed;
//
//    public void show2() {
//        System.out.println("Ostrich的身高：" + height + ", 速度：" + speed);
//    }
//}
//
//class Eagle extends Birds{
//    public String food;
//    public int fly_height;
//
//    public void show3() {
//        System.out.println("Eagle捕食：" + food + ", 飞翔高度：" + fly_height);
//    }
//}
//
//public class Test2 {
//    public static void main(String[] args) {
//      Sparrow s = new Sparrow();
//      s.fly();
//      s.run();
//      s.age = 2;
//      s.wight = 2;
//      s.show1();
//
//        System.out.println();
//
//     Ostrich o = new Ostrich();
//     o.fly();
//     o.run();
//     o.height = 1000;
//     o.speed = 200;
//     o.show2();
//
//        System.out.println();
//
//     Eagle e = new Eagle();
//     e.fly();
//     e.run();
//     e.food = "肉类";
//     e.fly_height = 1000;
//     e.show3();
//    }
//}
