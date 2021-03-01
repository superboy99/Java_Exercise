package Basic_01.File;

/*
    递归遍历目录
    给定一个路径，通过递归完成该目录下所有内容，并把文件的绝对路径输出在控制台
 */

import java.io.File;

public class DiGuiDemo3 {
    public static void main(String[] args) {
        File srcFile = new File("/Volumes/data/Java/FileTest");
        getAllFilePath(srcFile);
    }

    //定义一个方法，用于获取给定目录下的所有内容，参数为第1步创建的File对象
    public static void getAllFilePath(File srcFile) {
        //获取给定的File目录下的所有文件或者目录的File数组
        File[] fileArray = srcFile.listFiles();

        //遍历该File目录下所有的文件或者目录的File数组
        if (fileArray != null) {
            for (File file : fileArray) {
                //判断该File是否为目录
                if (file.isDirectory()) {
                    //如果是，递归调用
                    getAllFilePath(file);
                } else {
                    //如果不是，输出绝对路径
                    System.out.println(file.getAbsoluteFile());
                }
            }
        }
    }
}
