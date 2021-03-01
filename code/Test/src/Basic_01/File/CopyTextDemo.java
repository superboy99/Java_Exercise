package Basic_01.File;

/*
    字节流复制到文本文件：
    把文件中的内容读取到字节流，再将字节流写入到另一个文件中

 */

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyTextDemo {
    public static void main(String[] args) throws IOException {
        //创建字节流输入对象
        FileInputStream fis = new FileInputStream("/Volumes/data/Java/FileTest/CopyTextDemo1.txt");

        //创建字节流输出对象
        FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileTest/CopyTextDemo1.txt");

        int by;
        while ((by=fis.read()) != -1){
            fos.write(by);
        }

        fos.close();
        fis.close();

    }

}
