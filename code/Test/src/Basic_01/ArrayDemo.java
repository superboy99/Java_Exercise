package Basic_01;

/*
冒泡排序：
    一种排序方式，要对进行排序的数据中相邻的数据进行两两比较，将较大的数据放在后面，一次对所以的数据进行操作，直至所以的数据都按要求完成排序
    如果有n个数据进行排序，总共需要比较n-1次
    每次比较完毕，下一次比较就会少一个数据参与
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {24, 69, 80, 57, 13};
        System.out.println("排序前：" + arraytoString(arr));

        // 进行 n-1 次比较
        for (int x = 0; x < arr.length - 1; x++) {

            //-1 为了避免索引越界；-x 是为了调高比较率
            for (int i = 0; i < arr.length - 1 - x; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        System.out.println("排序后：" + arraytoString(arr));
    }

    //把数组中的元素按照指定的规则组成一个字符串：[元素1，元素2，。。。]
    public static String arraytoString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                sb.append(arr[i]);
            } else {
                sb.append(arr[i]).append(",");
            }
        }
        sb.append("]");
        String s = sb.toString();
        return s;
    }
}