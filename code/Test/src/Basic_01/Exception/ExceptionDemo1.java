package Basic_01.Exception;

public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("开始");
        method();
        System.out.println("结束");
    }

    public static void method() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[3]);
            System.out.println("这里能够访问吗");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("arr[3]不存在");
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
    }
}
