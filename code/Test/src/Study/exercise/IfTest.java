package Study.exercise;
import java.util.Scanner;
//要求：数学星期数，显示今天要显示的活动
//1：跑步
//2：游泳
//3：慢走
//4：单车
//5：拳击
//6：爬山
//7：吃饭
public class IfTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天星期几？：");
        int week = sc.nextInt();

        if (week < 1 || week > 7) {
            System.out.println("你的输入有误，请重新输入");
        } else if (week == 1) {
            System.out.println("今天跑步");
        } else if (week == 2) {
            System.out.println("今天游泳");
        } else if (week == 3) {
            System.out.println("今天慢走");
        } else if (week == 4) {
            System.out.println("今天骑单车");
        } else if (week == 5) {
            System.out.println("今天练习拳击");
        } else if (week == 6) {
            System.out.println("今天爬山");
        } else {
            System.out.println("今天吃饭吧");
        }
    }
}