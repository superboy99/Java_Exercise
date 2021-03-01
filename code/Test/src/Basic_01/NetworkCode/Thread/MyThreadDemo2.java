package Basic_01.NetworkCode.Thread;

/*
    设置线程名称: setName(String name)
 */

class MyThread2 extends Thread {
    public MyThread2() {}
    public MyThread2(String name) {
        super(name);
    }

    @Override
    public void run(){
        for (int i = 0; i < 100; i++){
            System.out.println(getName()+":"+i);
        }
    }
}

public class MyThreadDemo2 {
    public static void main(String[] args) {
        MyThread2 my1 = new MyThread2();
        MyThread2 my2 = new MyThread2();

        //void setName(String name)设置线程名称
        my1.setName("高铁1");
        my2.setName("飞机1");

        MyThread2 my3 = new MyThread2("高铁2");
        MyThread2 my4 = new MyThread2("飞机2");

        my1.start();
        my2.start();
        my3.start();
        my4.start();

        System.out.println(Thread.currentThread().getName());
    }
}
