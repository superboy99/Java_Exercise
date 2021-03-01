package Basic_01.File.IO_Stream;

/*
    复制Java文件改进版：InputStreamReader子类 FileReader

        根据数据源创建字符流输入对象
        根据目的地创建字符流输出对象
        读取字符流，写入字符流
        释放资源
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyJavaDemo2 {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("/Volumes/data/Work_Station/java/code/Test/src/Basic_01/File/IO_Stream/ConversionStreamDemo.java");
        FileWriter fw = new FileWriter("/Users/boysuper/Downloads/Copy2.java");

        char[] chs = new char[1024];
        int len;
        while ((len=fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }

        fw.close();
        fr.close();
    }
}
