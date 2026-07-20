package demo;

import java.io.File;

public class FileDownload {

    public File download(String filename) {

        return new File("C:\\files\\" + filename);

    }

}