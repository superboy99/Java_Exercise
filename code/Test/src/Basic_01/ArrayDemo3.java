package Basic_01;

import java.util.Arrays;

public class ArrayDemo3 {
    public static void main(String[] args) {
        int[] arr3 = {24, 69, 80, 57, 13};
        System.out.println("排序前：" + Arrays.toString(arr3));
        Arrays.sort(arr3);
        System.out.println("排序后：" + Arrays.toString(arr3));
    }
}
