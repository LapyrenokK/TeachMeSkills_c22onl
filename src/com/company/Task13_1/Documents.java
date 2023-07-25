package com.company.Task13_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Documents {
    private List<String> listsDoc = new ArrayList();
    private StringBuilder stringWorking = new StringBuilder();
    private File allFile = new File("src/resources/docInformation.txt");


    public void inputNameFile() {

            do {
                stringWorking.delete(0, stringWorking.length());
                System.out.println("Enter name document (example 'Doc1...3' [enter 0 to exit]");
                stringWorking.append(scin().nextLine());
                if (!stringWorking.toString().equals("0")) {
                    listsDoc.add(stringWorking.toString());
                } else {
                    System.out.println("You are out of document entry...");
                }
            } while (!stringWorking.toString().equals("0"));
        }

    private Set<String> getNumbersOfDcocumets() {
        Set<String> numsDoc = new HashSet<>();
        File file;
        for (int i = 0; i < listsDoc.size(); i++) {
            file = new File("src/resources/" + listsDoc.get(i) + ".txt");
            try (Scanner scin = new Scanner(file)) {
                while (scin.hasNext()) {
                    stringWorking.delete(0, stringWorking.length());
                    stringWorking.append(scin.nextLine());
                    numsDoc.add(stringWorking.toString());
                }
            } catch (FileNotFoundException | NoSuchElementException e) {
                e.printStackTrace();
            }
        }
        return numsDoc;
    }

    public void checkAndWriteValidationInDoc() {

        clearDoc(allFile.getPath());
        for (String docNum : getNumbersOfDcocumets()) {
            stringWorking.delete(0, stringWorking.length());
            stringWorking.append(docNum);
            if ((stringWorking.substring(0, 6).equals("docnum")
                    || stringWorking.substring(0, 8).equals("contract"))
                    & stringWorking.length() == 15) {
                System.out.println("Valid document");
                writeInDoc(stringWorking.toString());
            } else {
                System.out.println("Document number not valid - " + stringWorking);
                writeInDoc(stringWorking.toString());
            }
            stringWorking.delete(0, stringWorking.length());
        }
    }

    private void writeInDoc(String numberDoc) {
        Map<String, String> mapDocNumAndInformation = new HashMap<>();
        try (FileWriter fw = new FileWriter(allFile, true)) {
            mapDocNumAndInformation.put(numberDoc, getValidityInformation(numberDoc));
            for (Map.Entry<String, String> map : mapDocNumAndInformation.entrySet()) {
                fw.write(map.getKey() + " - " + map.getValue() + "\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    private void clearDoc(String path) {
        try (FileWriter fileWriter = new FileWriter(path, false)) {
            fileWriter.write("");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private String getValidityInformation(String docNum) {
        if (!stringWorking.substring(0, 6).equals("docnum")
                && !stringWorking.substring(0, 8).equals("contract")
                && stringWorking.length() == 15) {
            return "Document number not valid (number does not start with \"docnum\" or \"contract\" sequence !!!)\n";
        } else if (stringWorking.length() != 15
                && !stringWorking.substring(0, 6).equals("docnum")
                && !stringWorking.substring(0, 8).equals("contract")) {
            return "Document number not valid (number does not start with \"docnum\" or \"contract\" sequence !!!, and " +
                    "the length of the document number is not 15, but is " + docNum.length() + " !!!)\n";
        } else if (stringWorking.length() != 15) {
            return "Document number not valid (the length of the document number is not 15, but is " + docNum.length() + " !!!)\n";
        } else {
            return "Valid document \n";
        }
    }

    private Scanner scin(){
        return new Scanner(System.in);
    }
}

