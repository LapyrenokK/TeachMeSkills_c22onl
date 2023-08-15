package com.company.Task17_2;

import com.company.Reader.ConsoleReader;
import com.company.Reader.Reader;
import com.company.Writer.ConsoleWriter;
import com.company.Writer.Writer;


import java.io.File;
import java.io.IOException;
import java.util.*;

public class FileWorking {

    private List<Document> documents = new ArrayList<>();
    private Map<String,List<Document>> mapDocuments = new TreeMap<>();
    private Writer consoleWriter = new ConsoleWriter();
    private Reader reader = new ConsoleReader();

    public Map<String,List<Document> > getMapDocuments() {
        return mapDocuments;
    }

    public File[] getNewListWithFiles(File[] oldListFiles) {
        reader.consoleReader("Enter number files for checking...");
        int numberOfFiles = Integer.parseInt(consoleWriter.writer());
        if (numberOfFiles > oldListFiles.length) {
            numberOfFiles = oldListFiles.length;
        }
        File[] newListFiles = new File[numberOfFiles];
        for (int i = 0; i < numberOfFiles; i++) {
            newListFiles[i] = oldListFiles[i];
        }
        return newListFiles;
    }

    public List<Document> convertFileInDocumentsList(File[] newListWithFiles) {
        for (int i = 0; i < newListWithFiles.length; i++) {
            String path = newListWithFiles[i].getPath();

            try (Scanner scanner = new Scanner(new File(path))) {
                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();
                    String[] parts = line.split(", ");
                    String numberDoc = parts[0];
                    String phoneNumber = parts[2];
                    String email = parts[1];
                    Document document = new Document(numberDoc, phoneNumber, email);
                    documents.add(document);
                    mapDocuments.put(newListWithFiles[i].getName(),documents);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        return documents;
    }


}



