package io_copy_files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * User: Andrew
 */
public class CopyJava7Files implements FileCopy {

    @Override
    public void copyFiles(File source, File dest) throws MyException {
        try {
            Files.copy(source.toPath(), dest.toPath());
        } catch (IOException e) {
            throw new MyException(e);
        }
    }
}
