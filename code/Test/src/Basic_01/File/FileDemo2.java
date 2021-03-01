package Basic_01.File;

import java.io.File;
import java.io.IOException;

public class FileDemo2 {
    public static void main(String[] args) throws IOException {
        File f1 = new File("/Volumes/data/Java/FileTest/java.txt");
        System.out.println(f1.createNewFile());
        System.out.println("----------------");

        File f2 = new File("/Volumes/data/Java/FileTest/JavaEE");
        System.out.println(f2.mkdir());
        System.out.println("----------------");

        File f3 = new File("/Volumes/data/Java/FileTest/JavaWeb/HTML");
        System.out.println(f3.mkdirs());

    }
}
