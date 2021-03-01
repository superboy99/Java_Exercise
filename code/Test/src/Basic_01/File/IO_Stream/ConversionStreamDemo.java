package Basic_01.File.IO_Stream;

/*
    字符流中的编码：
        OutputStreamWriter: 从字符流到字节流
        读取字符流，使用指定的编码将其解码为字节

        InputStreamReader:从字节流到字符流
        读取字节，使用指定的编码将其编码为字符流

 */

import java.io.*;

public class ConversionStreamDemo {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Volumes/data/Java/FileTest/osw.txt"),"GBK");
        osw.write("中国");
        osw.close();


        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Volumes/data/Java/FileTest/osw.txt"),"GBK");

        int ch;
        while ((ch=isr.read()) != -1){
            System.out.println((char) ch);
       }

        isr.close();
    }
}
