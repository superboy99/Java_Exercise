package Basic_01.File.IO_Buffer;

/*
    字节缓冲流：
        BufferOutputStream
         BufferInputStream

    构造方法：
        BufferOutputStream(OutputStream out)
        BufferInputStream(InputStream in)
 */

import java.io.*;

public class BufferStreamDemo1 {
    public static void main(String[] args) throws IOException {
        //字节缓冲输出流：BufferedOutputStream (OutputStream out)
        //FileOutputStream fos = new FileOutputStream("/Volumes/data/Java/FileText/bos1.txt");
        //BufferedOutputStream bos = new BufferedOutputStream(fos);

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Volumes/data/Java/FileTest/bos1.txt"));
        bos.write("hello\r".getBytes());
        bos.write("world\r".getBytes());

        bos.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Volumes/data/Java/FileTest/bos1.txt"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            System.out.print(new String(bys, 0, len));
        }

        bis.close();
    }
}
