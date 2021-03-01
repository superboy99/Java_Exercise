package Basic_01.NetworkCode.Thread;

/*
    同步代码块解决数据安全问题

    synchronized(任意对象) {
        多条语句操作共享数据的代码
    }
 */

class SellTicket2 implements Runnable {
    private int tickets = 1;
    private Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (tickets <= 100) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + "正在售出第" + tickets + "张票");
                    tickets++;
                }
            }
        }
    }
}

public class SellTicketDemo2 {
    public static void main(String[] args) {
        SellTicket2 st = new SellTicket2();

        Thread t1 = new Thread(st, "窗口1");
        Thread t2 = new Thread(st, "窗口2");
        Thread t3 = new Thread(st, "窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
