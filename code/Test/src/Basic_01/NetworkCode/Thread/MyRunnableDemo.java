package Basic_01.NetworkCode.Thread;

/*
    实现多线程的方式二：实现Runnable接口
 */

class MyRunnable implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}

public class MyRunnableDemo {
    public static void main(String[] args) {
        MyRunnable mr = new MyRunnable();

        //Thread(runnable target)
        //创建Thread类的对象，把MyRunnable作为构造方法的参数
//        Thread t1 = new Thread(mr);
//        Thread t2 = new Thread(mr);

        //Thread (runnable target, String name)
        //设置线程名称
        Thread t1 = new Thread(mr,"superboy");
        Thread t2 = new Thread(mr,"王丑鬼");

        t1.start();
        t2.start();
    }
}
