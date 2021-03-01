package Basic_01.NetworkCode.Thread;

/*
    join 等待这个线程死亡
 */

class ThreadJoin extends Thread{
    @Override
    public  void run(){
        for (int i = 0; i < 100; i++){
            System.out.println(getName()+":"+i);
        }
    }
}

public class ThreadJoinDemo {
    public static void main(String[] args) {
        ThreadJoin tj1 = new ThreadJoin();
        ThreadJoin tj2 = new ThreadJoin();
        ThreadJoin tj3 = new ThreadJoin();

        tj1.setName("王丑鬼");
        tj2.setName("瘤子");
        tj3.setName("superboy");

        tj1.start();
        try {
            tj1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        tj2.start();
        tj3.start();
    }
}
