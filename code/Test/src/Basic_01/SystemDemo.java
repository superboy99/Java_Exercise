package Basic_01;

public class SystemDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("共耗时：" + (end - start) + "毫秒");
    }
}
