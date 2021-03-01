package Study;

public class FangFa {

    public static void max(int number1, int number2) {
        if (number1 > number2)
            System.out.println("Max number is: " + number1);
        else
            System.out.println("Max number is: " + number2);
    }

    public static boolean isEverNumber(int a) {
        if (a % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        max(10, 20);

        //调用方法1：方法名（参数）
        //isEverNumber(15);

        //调用方法2：数据类型 变量名 = 方法名（参数）

        boolean flag = isEverNumber(15);
        System.out.println(flag);
        }
    }