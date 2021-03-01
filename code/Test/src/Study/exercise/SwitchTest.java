package Study.exercise;
import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchTest {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("今天星期几？：");
        int week = sc.nextInt();
        switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("拳击");
                break;
            case 5:
                System.out.println("骑车");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("吃饭");
                break;
        }
    }
}
