package Basic_01.NetworkCode.Thread;
/*
    setDaemon 将此线程标记为守护线程，当运行的线程是守护线程时，Java虚拟机将退出
 */

class ThreadDaemon extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println(getName()+":"+i);
        }
    }
}

public class ThreadDaemonDemo {
    public static void main(String[] args) {
        ThreadDaemon td1 = new ThreadDaemon();
        ThreadDaemon td2 = new ThreadDaemon();

        td1.setName("王丑鬼");
        td2.setName("superboy");

        //设置主线程为刘女士
        Thread.currentThread().setName("刘女士");

        //设置为守护进程   当运行到setDaemon时，Java虚拟机将退出
        td1.setDaemon(true);
        td2.setDaemon(true);

        td1.start();
        td2.start();

        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }
}
