package io_copy_files;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * User: Andrew
 * Date: 23.11.13
 */
public class CopyApacheCommonsIO implements FileCopy {

    @Override
    public void copyFiles(File source, File dest) throws MyException {
        try {
            FileUtils.copyFile(source, dest);
        } catch (IOException e) {
            throw new MyException(e);
        }
    }
}
