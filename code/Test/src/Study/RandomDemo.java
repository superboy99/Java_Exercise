/*
6.Random
    1.Random的作用和使用步骤
        作用：用于产生一个随机数
        步骤：① 导包 import java.util.Random
             ② 创建对象 Random r = new Random();
             ③ 获取随机数 int number = r.nextInt(10); //获取数据的范围：[0,10] 包括0，不包括10

 */

/*
//输出一个随机数
package Study;
// ① 导入Random包
import java.util.Random;
// import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        //② 创建对象
        Random r = new Random();
        // Scanner sc = new Scanner();

        //③ 获取随机数
        int number = r.nextInt(10);
        // int number = sc.nextInt(System.in);
        System.out.println("number:" + number);
    }
}


//Random和Random输出10个随机数
package Study;
import java.util.Enumeration;
import java.util.Random;

public class RandomDemo {
   public static void main(String[] args) {
       Random r = new Random();

       for (int i = 1; i < 10;i++) {
           int number = r.nextInt(10);
           System.out.println("number:" + number);
       }

       //获取一个1-100之间的随机数
       int x = r.nextInt(100) + 1;
       System.out.println("number: " + x);
   }
}
*/

/*
需求：程序自动生成一个1-100之间的数字，使用程序实现猜出这个数字是多少？
    当猜到错的时候根据不同情况规程对应的提升
    1.比真实大，提示你猜的数据大了
    2.比真实小，提升你猜的数据小了
    3.和真实一样，提示恭喜你猜中了
 */

package Study;

import java.util.Random;
import java.util.Scanner;

public class RandomDemo {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100) + 1;

        while (true) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter a number:");
            int x = input.nextInt();

            if (x < number) {
                System.out.println("你猜的数据 小 了，请重新输入:");
            } else if (x > number) {
                System.out.println("你猜的数据 大 了，请重新输入:");
            } else if (x == number) {
                System.out.println("恭喜你猜对了!!!");
                break;
            }
        }
    }

}

