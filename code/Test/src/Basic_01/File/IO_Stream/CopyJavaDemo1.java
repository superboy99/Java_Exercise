package Basic_01.File.IO_Stream;

/*
    字符流复制到Java文件：
        根据数据创建数据输入对象
        根据目的地创建数据输出对象
        读写数据，复制文件
        释放资源
 */

import java.io.*;

public class CopyJavaDemo1 {
    public static void main(String[] args) throws IOException {
        //根据数据创建数据输入对象
        InputStreamReader isr = new InputStreamReader(new FileInputStream("/Volumes/data/Work_Station/java/code/Test/src/Basic_01/File/IO_Stream/ConversionStreamDemo.java"));

        //根据目的地创建数据输出对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("/Users/boysuper/Downloads/Copy.java"));

        char[] ch = new char[1024];
        int len;
        while ((len=isr.read(ch)) !=-1){
            osw.write(ch,0,len);
        }
        osw.close();
        isr.close();
    }
}
