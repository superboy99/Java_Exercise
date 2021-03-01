package Basic_01;

/*
有一个字符串""91 27 46 38 50" 通过编程输出结果为"27 38 46 50 91"
 */

import java.util.Arrays;

public class IntegerTest {
    public static void main(String[] args) {

        //1: 定义一个字符串
        String s = "91 27 46 38 50";

        //定义一个String数组，将字符串中的元素放入数组中
        String[] strArray = s.split(" ");

        //定一个int数组，将String数组中的元素放入int数组中
        int[] arr = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            arr[i] = Integer.parseInt(strArray[i]);//Integer静态方法中的parseInt将String转化为int
        }

        //对int数组进行排序
        Arrays.sort(arr);

        //将排序后的int数组中的元素进行拼接得到一个字符串，
        StringBuilder sb = new StringBuilder();
        for (int x = 0; x < arr.length; x++) {
            if (x == arr.length - 1) { //判断是否是最后一个元素
                sb.append(arr[x]);
            } else {
                sb.append(arr[x]).append(" ");
            }
        }
        String result = sb.toString();
        System.out.println("result: " + result);
    }
}
