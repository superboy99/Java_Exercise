package Basic_01;

public class IntegerDemo {
    public static void main(String[] args) {
        //int转化为String
        int number = 100;

        //方式一：直接在数字后面加一个空字符串
        String s1 = number + "";
        System.out.println(s1);

        //方式二：通过String类静态的方法valueOf()
        String s2 = String.valueOf(number);
        System.out.println(s2);

        System.out.println("----------------------");

//---------------------------------------------------------------

        //String 转化为int
        String s = "100";

        //方式一：先将字符串转化为Integer ,再调用valueOf()方法
        Integer i = Integer.valueOf(s);
        int x = i.intValue();
        System.out.println(x);

        //方式二：通过String静态方法parslent转换
        int y = Integer.parseInt(s);
        System.out.println(y);

    }
}
