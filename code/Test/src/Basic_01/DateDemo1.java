package Basic_01;

/*
    date类
 */

import java.util.Date;

public class DateDemo1 {
    public static void main(String[] args) {
        //public Date() 返回现在时间
        Date d1 = new Date();
        System.out.println(d1);
        System.out.println("----------------------------");

        //-----------------------------------------

        //public Date(long date) 返回1970年的时间
        long date = 1000 * 60 * 60;
        Date d2 = new Date(date);
        System.out.println(d2);
    }
}
