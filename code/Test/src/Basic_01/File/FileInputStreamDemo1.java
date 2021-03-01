package Basic_01.File;

/*
    字节流读取数据（一次读一个字节数据）
    1. 创建字节流输入对象
    2. 调用字节输入流对象的读数据方法
    3. 释放资源
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //创建字节流输入对象
        FileInputStream fis = new FileInputStream("/Volumes/data/Java/FileTest/fos.txt");

        //调用字节输入六对象的读数据方法
        //字节流在读取数据时，如果文件里没有数据里，返回值 -1
        int by;
        while ((by = fis.read()) != -1) {
            System.out.println(by + ": " + (char) by);
        }

        //关闭资源
        fis.close();
    }
}
