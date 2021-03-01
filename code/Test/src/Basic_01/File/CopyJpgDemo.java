package Basic_01.File;

/*
    字节流复制图片：

    根据数据源创建数据流输入对象
    根据目的地创建数据流输出对象
    读出数据，复制图片（一次读取一个字节数组，一次写入一个字节数组）
    释放资源

 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyJpgDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("/Users/boysuper/Downloads/sweet.jpg");
        FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileTest/sweet2.jpg");

        byte[] bys = new byte[1024];
        int len;
        while ((len = fis.read(bys)) != -1){
            fos.write(bys,0,len);
        }
        fos.close();
        fis.close();
    }
}
