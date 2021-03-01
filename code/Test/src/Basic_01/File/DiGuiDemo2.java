package Basic_01.File;

/*
    递归求阶乘
    用递归求5的阶乘，并把结果在控制台输出
 */

public class DiGuiDemo2 {
    public static int jc(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * jc(n - 1);
        }
    }

    public static void main(String[] args) {
        int result = jc(5);
        System.out.println("5的阶乘结果是：" + result);
    }
}
