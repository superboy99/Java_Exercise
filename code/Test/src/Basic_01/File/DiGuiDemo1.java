package Basic_01.File;

/*
    递归：
    以编程的角度来看，递归指的是方法定义中调用方法本身的现象
    把一个复杂的问题层层转化为一个与原问题相似的规模较小的问题来求解
    递归策略只需少量的程序就可描述出解题过程所需要的多次重复计算

    不死神兔问题，求第20个月兔子的对数
    每个月的兔子对数：1，1，2，3，5，8，。。。
 */

public class DiGuiDemo1 {
    public static void main(String[] args) {
        int[] array = new int[20];

        array[0] = 1;
        array[1] = 1;

        for (int i = 2; i < array.length; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }

        System.out.println(array[19]);
        System.out.println(f(20));
    }

    public static int f(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }else {
            return f(n-1)+f(n-2);
        }
    }
}
