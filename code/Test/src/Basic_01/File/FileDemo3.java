package Basic_01.File;

import java.io.File;

public class FileDemo3 {
    public static void main(String[] args) {
        File f = new File("/Volumes/data/Java/FileTest/平台信息.txt");

        //exists()判断是否存在
        System.out.println(f.exists());
        System.out.println("----------------");

        //isFile()判断是否是文件
        System.out.println(f.isFile());
        System.out.println("----------------");

        //isDirectory()判断是否为目录
        System.out.println(f.isDirectory());
        System.out.println("----------------");

        //getAbsolutePath() 返回此抽象路径名的绝对路径名字符串
        System.out.println(f.getAbsoluteFile());
        System.out.println("----------------");

        //getPath()将此抽象名转化为路径名字符串
        System.out.println(f.getPath());
        System.out.println("----------------");

        //getName()返回由此路径名表示的文件或目录的名称
        System.out.println(f.getName());
        System.out.println("----------------");

        File f2 = new File("/Volumes/data/Java/FileTest");

        //返回目录中的文件和目录的名称字符串数组
        String[] strArray = f2.list();
        for(String str: strArray){
            System.out.println(str);
        }

        System.out.println("---------------");

        //返回目录中的文件和目录的File对象数组
        File[] fileArray = f2.listFiles();
        for(File file:fileArray){
            if(file.isFile()){
                System.out.println(file.getName());
            }
        }

    }
}
