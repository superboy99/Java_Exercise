package Basic_01.NetworkCode.Thread;

/*
    实现多线程方式一：继承Thread类
        创建一个MyThread类继承Thread类
        在MyThread类中，重写run()方法
        创建MyThread类对象
        启动线程
 */

class MyThread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }
    }
}

public class MyThreadDemo1 {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        MyThread1 my2 = new MyThread1();

//        my1.run();
//        my2.run();

        my1.start();
        my2.start();
    }
}
