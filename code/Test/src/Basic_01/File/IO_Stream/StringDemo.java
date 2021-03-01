package Basic_01.File.IO_Stream;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //定义一个字符串
        String s = "中国";

        //编码
        byte[] bys1 = s.getBytes();
        byte[] bys2 = s.getBytes("UTF-8");
        byte[] bys3 = s.getBytes("GBK");

        System.out.println("---------编码---------");
        System.out.println(Arrays.toString(bys1));
        System.out.println(Arrays.toString(bys2));
        System.out.println(Arrays.toString(bys3));

        System.out.println(" ");

        //解码
        String ss1 = new String(bys1);
        String ss2 = new String(bys2,"UTF-8");
        String ss3 = new String(bys1,"GBK");

        System.out.println("---------解码---------");
        System.out.println(ss1);
        System.out.println(ss2);
        System.out.println(ss3);

    }
}
