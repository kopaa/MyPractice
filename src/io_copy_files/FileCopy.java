package io_copy_files;

import java.io.File;

/**
 * User: Andrew
 * Date: 23.11.13
 */

public interface FileCopy {
    public void copyFiles(File source, File dest) throws MyException;
}
