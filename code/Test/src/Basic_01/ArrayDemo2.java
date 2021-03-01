package Basic_01;

public class ArrayDemo2 {
    public static void main(String[] args) {
        int[] arr_befor = {1, 23, 324, 231, 432, 24, 123, 54, 64};
        int[] arr_later = {};
        System.out.println("排序前：" + arr_befor);
        for (int x = 0; x < arr_befor.length - 1; x++) {
            for (int i = 0; i < arr_befor.length - 1 - x; i++) {
                if (arr_befor[i] < arr_befor[i + 1]) {
                    int temp = arr_befor[i];
                    arr_befor[i] = arr_befor[i + 1];
                    arr_befor[i+1] = temp;
                }
            }
        }
    }
}
