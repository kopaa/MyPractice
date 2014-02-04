package IO.copyFiles;

import java.io.*;
import java.nio.channels.FileChannel;

/**
 * User: Andrew
 * Date: 23.11.13
 */
public class CopyChannel implements FileCopy {

    @Override
    public void copyFiles(File source, File dest) throws MyException {
        FileChannel inputChannel = null;
        FileChannel outputChannel = null;
        try {
            inputChannel = new FileInputStream(source).getChannel();
            outputChannel = new FileOutputStream(dest).getChannel();
            outputChannel.transferFrom(inputChannel, 0, inputChannel.size());
        } catch (FileNotFoundException e) {
            throw new MyException(e);
        } catch (IOException e) {
            throw new MyException(e);
        } finally {
            try {
                inputChannel.close();
                outputChannel.close();
            } catch (IOException e) {
                throw new MyException(e);
            }
        }
    }
}
