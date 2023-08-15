package com.company.Task17_2;


import com.company.Reader.ConsoleReader;
import com.company.Reader.Reader;


import java.io.File;
import java.util.List;
import java.util.Map;

public class Demo {

    private DirectoryWorking folderWorking = new DirectoryWorking();
    private File[] newListWithFiles;
    private List<Document>newListDocuments;
    private Map<String,List<Document>>newListDocMap;
    private FileWorking fileWorking = new FileWorking();
    private Reader reader = new ConsoleReader();



    public void start() {
        do {
            folderWorking.setDirectoryPath();
            if (!folderWorking.getValidationFolder()){
                reader.consoleReader("Invalid folder path !!!");
            }else {
                break;
            }
        }while (true);

        int length = folderWorking.getListFilesOnFolder().length;
         if (length<1){
             reader.consoleReader("In folder not found txt files !!!");
         }else {
             reader.consoleReader("In the folder there are "+length+" txt files");
         }
        newListWithFiles = fileWorking.getNewListWithFiles(folderWorking.getListFilesOnFolder());
        newListDocuments = fileWorking.convertFileInDocumentsList(newListWithFiles);
        newListDocMap = fileWorking.getMapDocuments();
       printDocumentList();
       printDocumentMap();
       printInfoAfterWorking();
    }

    private void printDocumentList(){
        for (Document d: newListDocuments) {
            System.out.println(d);
        }
    }

    private void printDocumentMap(){
        for (Map.Entry<String, List<Document>> entry : newListDocMap.entrySet()) {
            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }
    }

    private void printInfoAfterWorking(){
        int countFilesNotValid = folderWorking.countFilesInDirectory() - folderWorking.getListFilesOnFolder().length;
        System.out.println("All Files =  "+ folderWorking.countFilesInDirectory());
        System.out.println("Files (txt) were processed =  "+ newListWithFiles.length);
        System.out.println("Number of non-txt files = " + countFilesNotValid);
    }




}
