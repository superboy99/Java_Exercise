package Basic_01;

/*
    定义一个日期工具类DateUtil，包含两个方法
    1 把日期转化为指定的字符串
    2 把字符串转化为指定格式的日期

    定义一个测试类DateDemo 测试日期工具类方法
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

class DateUtil {
    private DateUtil(){

    }

    /*
        把日期转化为指定格式的字符串
        返回值类型：String
        参数：Date date, String format
     */

    public static String dateToString(Date date, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(date);
        return s;
    }

//-----------------------------------------------------------------//

    /*
        把字符串转化为指定格式日期
        返回值类型：Date
        参数：String s, String format
     */
    public static Date stringToDate(String s, String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(s);
        return d;
    }
}

//测试类
public class DateDemo3 {
    public static void main(String[] args) throws ParseException {

        //将日期转化为指定格式的字符串
        String s = "2021-1-24 10:20:02";
        Date d = DateUtil.stringToDate(s, "yyyy-MM-dd HH:mm:ss");
        System.out.println(d);

        System.out.println("----------------------------");

        //将字符串转化为指定格式日期
        Date dd = new Date();

        String s1 = DateUtil.dateToString(d, "yyyy年MM月dd日 HH:mm:ss");
        System.out.println(s1);

        String s2 = DateUtil.dateToString(d,"yyyy年MM月dd日");
        System.out.println(s2);

        String s3 = DateUtil.dateToString(d,"HH:mm:ss");
        System.out.println(s3);
    }
}