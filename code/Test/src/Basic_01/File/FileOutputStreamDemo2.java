package Basic_01.File;

/*
    字节流写数据的三种方式

    构造方法：
        FileOutputStream (String name):创建文件输出流以指定的名称写入文件
        FileOutputStream (File file):创建文件输出流以写入由指定的File对象表示的文件

 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileTest/fos2.txt");

        //void write(int b) 将指定的字节写入此文件输出流 一次写一个字节数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
        fos.write(100);
        fos.write(101);
        fos.write("\r".getBytes());

        //void write(byte[] b):将b.length字节从指定 的字节数组写入此文件输出流
        byte[] bys = "fghijk".getBytes();
        fos.write(bys);
        fos.write("\r".getBytes());

        //void write(byte[] b, int off,  int len)：将len字节从指定的字节数组开始，从偏移量off开始写入此文件输出流
        fos.write(bys,2,4);

        fos.close();
    }
}
