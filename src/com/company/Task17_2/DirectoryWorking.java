package com.company.Task17_2;

import com.company.Reader.ConsoleReader;
import com.company.Reader.Reader;
import com.company.Writer.ConsoleWriter;
import com.company.Writer.Writer;

import java.io.File;
import java.io.FilenameFilter;

public class DirectoryWorking {

    private File folderFile;

    private String folderPath;

    private Writer consoleWriter = new ConsoleWriter();
    private Reader reader = new ConsoleReader();


    public void setDirectoryPath() {
        reader.consoleReader("Enter path of directory...");
        folderPath = consoleWriter.writer();
        folderFile = new File(folderPath);
    }

    public boolean getValidationFolder() {
        folderFile = new File(folderPath);
        if (folderFile.exists() && folderFile.isDirectory()) {
            return true;
        } else {
            return false;
        }
    }

    public File[] getListFilesOnFolder() {
        File[] txtFile = folderFile.listFiles(new FilenameFilter() {
                                                  @Override
                                                  public boolean accept(File dir, String name) {
                                                      return name.toLowerCase().endsWith(".txt");
                                                  }
                                              }
        );
        return txtFile;
    }

    public int countFilesInDirectory(){
        File[] allFile = folderFile.listFiles();
        return allFile.length;
    }


}
