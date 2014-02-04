package IO.copyFiles;

import java.io.File;

/**
 * User: Andrew
 * Date: 23.11.13
 */
public class CopyExample {
    public static void main(String[] args) throws MyException {
        FileCopy stream = new CopyStream();
        FileCopy channel = new CopyChannel();
        FileCopy apache = new CopyApacheCommonsIO();
        FileCopy java7 = new CopyJava7Files();

        File source = new File("D:/qw1.avi");
        long start = System.currentTimeMillis();
        long end;
        stream.copyFiles(source, new File("D:/copy1.avi"));
        System.out.println("Time taken by FileStreams Copy = " + (System.currentTimeMillis() - start));

        start = System.currentTimeMillis();
        channel.copyFiles(source, new File("D:/copy2.avi"));
        end = System.currentTimeMillis();
        System.out.println("Time taken by FileChannels Copy = " + (end - start));

        start = System.currentTimeMillis();
        apache.copyFiles(source, new File("D:/copy3.avi"));
        end = System.currentTimeMillis();
        System.out.println("Time taken by Apache Commons IO Copy = " + (end - start));

        start = System.currentTimeMillis();
        java7.copyFiles(source, new File("D:/copy4.avi"));
        end = System.currentTimeMillis();
        System.out.println("Time taken by Java7 Files Copy = " + (end - start));
    }

}
