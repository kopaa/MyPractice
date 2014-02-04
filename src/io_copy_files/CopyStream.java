package io_copy_files;

import java.io.*;

/**
 * User: Andrew
 * Date: 23.11.13
 */
public class CopyStream implements FileCopy {

    @Override
    public void copyFiles(File source, File dest) throws MyException {
        InputStream input = null;
        OutputStream output = null;
        try {
            input = new FileInputStream(source);
            output = new FileOutputStream(dest);
            byte[] buf = new byte[1024];
            int bytesRead;
            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } catch (FileNotFoundException e) {
            throw new MyException(e);
        } catch (IOException e) {
            throw new MyException(e);
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                throw new MyException(e);
            }
            try {
                output.close();
            } catch (IOException e) {
                throw new MyException(e);
            }
        }
    }
}
