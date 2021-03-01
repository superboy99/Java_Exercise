package Study.L_Dx;

/*
类的定义：
    定义步骤：
    定义类
        编写类的成员变量
        编写类的成员方法

    手机类
        类名：手机（phone）

    成员变量
        品牌（brand）
        价格（price）

    成员方法
        打电话（call）
        发短信（sendMessage）
 */

//类名
public class Phone {
    //成员变量
    String brand;
    int price;

    //成员方法
    public void call() {
        System.out.println("打电话");
    }

    public void sendMessage() {
        System.out.println("发短信");
    }
}
