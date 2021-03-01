package Basic_01.File.IO_Buffer;

/*
    字节流复制视频：
        根据数据源创建字节流输入对象
        根据目的地创建字节流输出对象
        读写数据，复制图片（一次读一个字节数组，一次写入一个字节数组）
        释放资源


 */

import java.io.*;

public class CopyMp4Demo {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("/Users/boysuper/Downloads/140.mp4"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("/Volumes/data/Java/FileTest/140.mp4"));

        byte[] bys = new byte[1024];
        int len;
        while ((len = bis.read(bys)) != -1) {
            bos.write(bys, 0, len);
        }
        bos.close();
        bis.close();

        long endTime = System.currentTimeMillis();
        long time = endTime - startTime;
        System.out.println("总计耗时：" + time+"毫秒");
    }
}
