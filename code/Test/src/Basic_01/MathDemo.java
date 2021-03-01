package Basic_01;

/**
 * @author superboy
 * @version 1.0
 * @date 2021/1/13 5:53 下午
 */
public class MathDemo {
    public static void main(String[] args) {
//        public static int abs (int a); //返回绝对值
        System.out.println(Math.abs(-100));
        System.out.println(Math.abs(100));
        System.out.println("--------------------");

//        public static  double ceil(int a); //返回大于或等于参数的最小double值等于一个整数
        System.out.println(Math.ceil(12.34));
        System.out.println(Math.ceil(12.56));
        System.out.println("--------------------");

//        public static double floor (int a); //返回小于或等于参数的最小double值，等于一个整数
        System.out.println(Math.floor(12.34));
        System.out.println(Math.floor(12.56));
        System.out.println("--------------------");

//        public static int round (int a); //四舍五入返回一个最接近a的整数
        System.out.println(Math.round(12.34));
        System.out.println(Math.round(12.56));
        System.out.println("--------------------");

//        public static double pow (double a,double b); //返回一个a的b次幂
        System.out.println(Math.pow(2,3));
        System.out.println(Math.pow(3,2));
        System.out.println("--------------------");

//        public static double random(); //返回一个随机数[0.0,1.0)
        System.out.println(Math.random()); //[0.0,1.0)
        System.out.println((int)(Math.random() * 10)); //[1.0,10.0)
        System.out.println((int)(Math.random() * 100)); //[10.0,100.0)
    }
}
