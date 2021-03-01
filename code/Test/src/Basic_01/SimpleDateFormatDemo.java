package Basic_01;

/*
    SimpleDateFormat类的常用方法
    格式化(从Date到String)
        public final String format(Date date):将日期格式化成日期/时间字符串

    解析(从String到Date)
    public Date parse(String source):从给定字符串的开始解析文本以生成日期
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        //格式化：从Date到String
        Date d1 = new Date();

        //无参构造
//        SimpleDateFormat sdf = new SimpleDateFormat();


        //带参
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String s1 = sdf.format(d1);
        System.out.println(s1);


        System.out.println("--------------------------");


        //解析：从String到Date
        String d2 = "2021-05-22 21:58:40";
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date s2 = sdf2.parse(d2);
        System.out.println(s2);
    }
}
