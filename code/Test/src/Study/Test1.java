package Study;
/*
    从键盘输入一个数判断是奇数还是偶数
    ① 导入键盘录入功能所需要的包
        import java.util.Scanner;

    ② 创建对象
        Scanner input = new Scanner(System.in);

    ③ 接受数据
        int number = sc.nextInt();

    if...else结构
        if () {
        } else {
        }
 */
/*
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double a = input.nextDouble();
        if (a % 2 == 0) {
            System.out.println("This number is 偶数");
        } else {
            System.out.println("This number is 奇数");
        }
    }
}
*/


/* 2.3 if语句格式3
    格式：
    if (关系表达式1）{
        语句体1；
    } else if (关系表达式2) {
        语句体2；
    }
    ....
    else {
        语句体n + 1;
    }
 */


/*
// 2 if语句
// 案例：考试奖励
import java.util.Scanner;
public class Test1 {
   public static void main(String[] args) {
           Scanner input = new Scanner(System.in);
           System.out.println("请输入分数: ");
           double score = input.nextDouble();

           if (score>=95 && score<=100) {
                   System.out.print("山地自行车一辆");
           } else if(score >= 90 && score <= 94) {
                   System.out.println("游乐园一次");
           } else if(score >= 80 && score <= 89) {
                   System.out.print("变形金刚玩具一个");
           } else {
                   System.out.println("揍一顿");
           }
   }
        }
*/



// 3 switch语句
/*
    格式：
    switch(表达式) {
        case 值1：
                    语句体1；
                    break；
        case 值2：
                    语句体2；
                    break；
        ...
        default:
                    语句体n+1;
                    [break;]
        }

表达式：取值byte、short、char、JDK5以后是枚举，JDK7以后是String。
case:后面跟的是要和表达式进行比较
break：表示中段，结束的意思，用来结束switch语句。
default：表示所有情况都不匹配的时候，就执行该处内容，和if语句的else相似。
 */
/*
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("请输入一个星期数（1-7）: ");
        int week = input.nextInt();

        switch(week) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
        }
        System.out.println("结束");
    }
}
*/

/*
//案例：春夏秋冬
//一年12个月，输入一个月份 说明是那个季节。
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份: ");
        int month = input.nextInt();
        switch (month) {
            case 1:      //修改后代码。
            case 2:
            case 12:
                System.out.println("冬季");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("春季");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("夏季");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("秋季");
                break;
            default:
                System.out.println("你输入的月份有误!!!! ");


                /* 原始代码:
            case 1:
                if (month >= 1 && month <= 3);
                System.out.println("春季");
                break;

            case 2:
                if (month >= 3 && month <= 6);
                System.out.println("夏季");
                break;

            case 3:
                if (month >= 6 && month <= 9);
                System.out.println("秋季");
                break;

            case 4:
                if (month >= 9 &&  month <= 12);
                System.out.println("冬季");
                break;
        }
    }
}
*/




//=====================================================//
//for循环语句
// 1.1  循环结构
// 1.2 for循环语句格式
/*
格式：
for (初始化语句；条件判断语句；条件控制语句) {
    循环体语句；
    }
执行流程：
① 执行参数语句
② 执行条件判断语句，看其结构是true还是false
    如果是false，循环结束
    如果是ture，继续执行
③ 执行循环体语句
④ 执行条件控制语句
⑤ 回到②继续
 */

/*
//案例:输出5次hello world
public class Test1 {
    public static void main(String[] args) {
        //  (初始化语句；条件判断语句；条件控制语句)
        for (int i = 1;i <= 5;i++) {
            System.out.println("Hello world!");
        }
    }
}
*/

/*
// 案例：求和  1-5之间的数据和。
public class Test1 {
    public static void main(String[] args) {
        int s = 0;
        for (int i = 1; i <= 5; i++) {
            s = s + i;
        }
        System.out.println("1-5之间的数据和是: " + s);
    }
}

*/

/*
// 案例：偶数求和
public class Test1 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1;i <= 100;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("1-100的偶数和是：" + sum);
    }
}

 */


/*
//案例：水仙花数
//① 一个三位数
//② 个位 十位 百位的数字立方和等于原数
//④ 371 个位数 371 % 10 = 1
//⑤ 371 十位数 371 / 10 % 10 = 7
//⑥ 371 百位数 371 / 100 = 3
//⑦ 任意数字的指定位数的数字如何求？
//  先使用整除操作将要求出的数字移动到个位上，在使用取余操作取出最后一位上的值

//案例：输出所有的水仙花数

public class Test1 {
    public static void main(String[] args) {
       for (int i = 100;i <= 999;i++){
           int a = i % 10;  //个位数
           int b = i / 10 % 10; //十位数
           int c = i / 100; //百位数
           if (a * a * a + b * b * b + c * c * c == i) {    //判断三个数的立方和是否等于原数
               System.out.println(i);
           }
       }
    }
}
*/


/*
2.1 while循环语句
while循环语句格式
    基本格式：
        while （条件判断语句） {
            循环体语句；
        }

    完整格式：
        初始化语句；
        while （条件判断语句） {
            循环体语句；
            条件控制语句；
        }

    执行流程：
        ① 执行初始化语句
        ② 执行条件判断语句，看其结果是true还是false
            如果是false，循环结束
            如果是true，继续执行
        ③ 执行循环体语句
        ④ 执行条件控制语句
        ⑤ 回到②


 */

/*
//案例：输出5次 hello world
public class Test1 {
    public static void main(String[] args) {
        //采用for循环
        for (int i = 1;i <= 5;i++) {
            System.out.println("Hello World");
        }

        System.out.println("\n");

        //采用while循环
        int i = 1;  //初始语句
        while (i <= 5) {    //while 循环
            System.out.println("Hello World");
            i += 1;
        }
    }
}
 */


//案例：珠穆朗玛峰
//高8844.43米=8844430毫米，一张足够大的纸，厚0.1毫米，需要折多少次才有一样高
public class Test1 {
    public static void main(String[] args) {
        int account = 0;
        int zf = 8844430;
        double paper = 0.1;

        while (paper <= zf) {
            paper = 2 * paper;
            account  += 1;
        }
        System.out.println("需要折叠" + account + "次");
    }
}



