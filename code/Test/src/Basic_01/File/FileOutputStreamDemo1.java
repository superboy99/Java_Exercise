package Basic_01.File;

/*
    使用字节输出刘写数据的步骤
        创建字节输出流对象（调用系统功能创建文件，创建字节输出流对象，让字节输出流对象指向文件）
        调用字节输出流对象的写数据方法
        释放资源（关闭此文件输出流并释放与此相关联的任何系统资源
 */

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException  {
        //创建字节输出流对象
        //FileOutputStream(String name):创建文件输出流以指定的名称写入文件
//        FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileTest/fos.txt");
        FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileTest/fos.txt");
        /*
            此过程做了三件事：
                a:调用系统功能创建了文件
                b:创建了字节流输出对象
                c:让字节流输出对象指向创建好的文件
         */

        //将指定为字节写入此文件输出流
        fos.write(97);
        fos.write(48);
        fos.write(65);
        fos.write(32);

        //最后释放资源
        fos.close();
    }
}