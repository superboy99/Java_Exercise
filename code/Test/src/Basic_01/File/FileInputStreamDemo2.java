package Basic_01.File;

/*
    字节流读数据（一次读一个字节数组数据）
    public int read(byte[] b)：从输入流最多读取b.length个字节的数据

    1. 创建字节输入流对象
    2. 调用字节输入流对象的读数方法
    3. 释放资源
 */

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo2 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Volumes/data/Java/FileTest/fos2.txt");

        byte[] bys = new byte[1024];  //1024及其整数倍
        int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len)); //new String()将字符数组转化为字符串
        }
        fis.close();
    }
}
