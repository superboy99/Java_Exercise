package Study;
// 3 do...while循环语句
// 3.1 do...while 循环语句格式
/*
    基本格式：
        do {
            循环体语句；
        } while （条件判断语句）;

     完整格式：
        初始化语句;
        do {
            循环体语句;
            条件控制语句；
        } while （条件判断语句);

     执行流程：
        ① 执行初始化语句
        ② 执行循环体语句
        ③ 执行条件控制语句
        ④ 执行条件判断语句，看其结果是true话说false
            如果是false，循环结束
            如果是true，继续执行
        ⑤ 回到②继续

//案例：输出5次 hello world
public class WhileTest {
    public static void main(String[] args) {
        //for循环
        for (int i =1;i <= 5;i++) {
            System.out.println("Hello World");
        }

    System.out.println("\n");

        //while 循环
        int i = 1;
        while (i <= 5) {
            System.out.println("Hello World");
            i ++;
        }

    System.out.println("\n");

        //do...while循环
        int a = 1;
        do {
            System.out.println("Hello World");
            a = a + 1;
        } while (a <= 5 );
    }
}
*/

/*
三种循环的区别
for循环和while循环先判断条件是否成立，然后决定是否执行循环体（先判断后执行）
do...while循环先执行一次循环体，然后判断条件是否成立，是否继续执行循环体（先执行后判断）

for和while的区别：
条件控制语句所控制的自增变量，因为归属for循环的预防结构中，在for循环结束后，就不能再次被访问控制了
条件控制语句所控制的自增变量，对于while循环体来说不归属其语法结构中，在while循环结束后，该变量还是可以继续使用

死循环格式：
for(;;) {}
while(true) {}
do{} while(true);

while的死循环格式是最常用的
命令提示符窗口中Ctrl+C可以结束死循环


public class WhileTest {
    public static void main(String[] args) {
        //for循环
        for (int f = 1;f <= 5;f++) {    //f 是属于for循环体的。
            System.out.println("Hello World");
        }

    System.out.println("\n");

        //while循环
        int w = 1;
        while (w <= 5) {
            System.out.println("Hello World");
            w ++;
        }
        System.out.println(w);

    System.out.println("\n");

        //do...while循环
        int d = 1;
        do {
            System.out.println("Hello World");
            d ++;
        } while (d <= 5);
        System.out.println(d);
    }
}

*/

/*
////==============================================//
// 4.跳转控制语句
    continue 用在循环中，基于条件控制，跳过某次循环体内容的执行，继续下一次的执行

    break 用在循环中，基于条件控制，终止循环体内容的执行，也就是说结束当前的整个循环

 */
/*
public class WhileTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                //continue; //跳过某次循环体内容的执行，也就是说，遇到满足条件的就跳过。
                break;  //终止循环体内容的执行，直接停止。
            }
            System.out.println(i);
        }
    }
}
*/

/*
    5.循环嵌套：
    语句结构：
        顺序语句：以分号结尾，表示一句话的结束
        分支语句：一对大括号表示if的整体结构，整体描述一个完整的if语句
                一堆大括号表示switch的整体结构，整体描述一个完整的switch语句
        循环语句：一对大括号表示for的整体结构，整体秒是一个完整的for语句
                一对大括号表示while的整体结构，整体描述一个完整的while语句
                do...while以分号结尾，整体描述一个完整的do...while语句

       任何语句对外都可以看成一句话，一句代码
       分支语句中包含分支语句称为分支嵌套
       循环语句包含的循环语句称为循环嵌套

 */

/*
循环嵌套：
    循环语句中包含循环语句

需求：
    在控制台输出一天的小时和分钟
    分钟和小时的范围
        分钟：0 <= minute < 60
        小时：0 <= hour < 24


public class WhileTest {
    public static void main(String[] args) {
        for(int minute = 0; minute < 4; minute++) {
            System.out.println("0时" + minute + "分");
        }
        System.out.println("--------");

        for(int minute = 0; minute < 4; minute++) {
            System.out.println("1时" + minute + "分");
        }
        System.out.println("------------");

        for(int minute = 0; minute < 4; minute++) {
            System.out.println("2时" + minute + "分");
        }
        System.out.println("-----------");
    }
}
*/

/*
6.Random
    1.Random的作用和使用步骤
        作用：用于产生一个随机数
        步骤：① 导包 import java.util.Random
             ② 创建对象 Random r = new Random();
             ③ 获取随机数 int number = r.nextInt(10); //获取数据的范围：[0,10] 包括0，不包括10

 */
//① 导包
import java.util.Random;

public class WhileTest {
    public static void main(String[] args) {
        //② 创建对象
        Random r = new Random();

        //③ 获取随机数
        int number = r.nextInt(10);
        System.out.println("number:" + number);
    }
}