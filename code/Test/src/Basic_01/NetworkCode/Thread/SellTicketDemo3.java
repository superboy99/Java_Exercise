package Basic_01.NetworkCode.Thread;

/*
    同步方法解决数据安全问题:
    同步方法： 将synchronized关键字加到方法上

 */

class SellTicket3 implements Runnable {
    private static int ticketes = 1;

    private static synchronized void SellTicket() { //将synchronized关键字加到方法上。
        if (ticketes <= 100) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + "正在售出第" + ticketes + "张票");
            ticketes++;
        }
    }

    @Override
    public void run() {
        while (true) {
            SellTicket();
        }
    }

}

public class SellTicketDemo3 {
    public static void main(String[] args) {
        SellTicket3 st = new SellTicket3();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
