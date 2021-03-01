package Study.L_Dx.Extends_Test;
/*
    手机类
 */
class Phone {
    public void call(String name) {
        System.out.println("给 " + name + " 打电话");
    }
}
/*
    新手机类
 */
class NewPhone extends Phone{
    @Override
    public void call(String name) {
        System.out.println("开启视频通话功能");
        super.call("王丑鬼");  //直接使用父类中的功能
    }
}
public class Demo6 {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.call("Super boy");
        System.out.println("---------------------");
        NewPhone np = new NewPhone();
        np.call("王丑鬼");
    }
}
