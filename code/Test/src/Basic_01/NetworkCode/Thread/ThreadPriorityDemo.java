package Basic_01.NetworkCode.Thread;

/*
    线程优先级
 */

class ThreadPriority extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + ":" + i);
        }
    }
}

public class ThreadPriorityDemo {
    public static void main(String[] args) {
        ThreadPriority tp1 = new ThreadPriority();
        ThreadPriority tp2 = new ThreadPriority();
        ThreadPriority tp3 = new ThreadPriority();

        tp1.setName("高铁");
        tp2.setName("飞机");
        tp3.setName("汽车");

        //public final int getPriority():返回此线程的优先级
        System.out.println(tp1.getPriority());
        System.out.println(tp2.getPriority());
        System.out.println(tp3.getPriority());

        //public final void setPriority(int newPriority)更改此线程的优先级
        System.out.println(Thread.MAX_PRIORITY);
        System.out.println(Thread.MIN_PRIORITY);
        System.out.println(Thread.NORM_PRIORITY);

        //设置正确的优先级
        tp1.setPriority(5);
        tp2.setPriority(Thread.MAX_PRIORITY);
        tp3.setPriority(1);

        tp1.start();
        tp2.start();
        tp3.start();
    }
}
