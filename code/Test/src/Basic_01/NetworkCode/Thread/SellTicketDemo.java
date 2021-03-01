package Basic_01.NetworkCode.Thread;

/*
    案例需求：
        某电影院目前正在上映国产大片，共有100张票，而它有3个窗口卖票，请设计一个程序模拟该电影院卖票

    实现步骤：
        定义一个类SellTicket实现Runnable接口，里面定义一个成员变量:private int tickets = 100;
        在SellTicket类中重写run()方法实现卖票，代码步骤如下
        判断票数大于0，就卖票，并告知是哪个窗口卖的
        卖了票之后，总票数要减1
        票没有了，也可能有人来问，所以这里用死循环让卖票的动作一直执行
        定义一个测试类SellTicketDemo，里面有main方法，代码步骤如下
        创建SellTicket类的对象 创建三个Thread类的对象，把SellTicket对象作为构造方法的参数，并给出对应的窗口名称
        启动线程
    代码实现：
 */

class SellTicket implements Runnable {
    private int tickets = 1;

    @Override
    public void run() {
        while (true) {
            if (tickets <= 100) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + tickets + "张票");
                tickets++;
            }
        }
    }
}

public class SellTicketDemo {
    public static void main(String[] args) {
        SellTicket st = new SellTicket();

        Thread t1 = new Thread(st,"窗口1");
        Thread t2 = new Thread(st,"窗口2");
        Thread t3 = new Thread(st,"窗口3");

        t1.start();
        t2.start();
        t3.start();
    }
}
