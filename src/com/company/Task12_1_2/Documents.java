package com.company.Task12_1_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Documents {
    private StringBuilder stringWorking = new StringBuilder();
    private File validFile = new File("src/resources/validDoc.txt");
    private File notValidFile = new File("src/resources/notValidDoc.txt");


    public void checkValidationkInDoc(File file) {
        try (Scanner scin = new Scanner(file)) {
            clearDoc(validFile.getPath());
            clearDoc(notValidFile.getPath());
            while (scin.hasNext()) {
                stringWorking.append(scin.nextLine());
                if (stringWorking.substring(0, 6).equals("docnum")
                        || stringWorking.substring(0, 8).equals("contract")
                        && stringWorking.length() == 15) {
                    System.out.println("Valid document");
                    writeValidDoc(stringWorking.toString());
                } else {
                    System.out.println("Document number not valid - " + stringWorking);
                    writeNotValidDoc(stringWorking.toString());
                }
                stringWorking.delete(0, stringWorking.length());
            }

        } catch (FileNotFoundException | NoSuchElementException e) {
            e.printStackTrace();
        }
    }

    private void writeValidDoc(String numberDoc) {
        try (FileWriter fwValid = new FileWriter(validFile, true)) {
            fwValid.write("");
            fwValid.flush();
            fwValid.write(numberDoc + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void writeNotValidDoc(String numberDoc) {
        try (FileWriter fwNotValid = new FileWriter(notValidFile, true)) {
            fwNotValid.write(numberDoc + getValidityInformation(numberDoc) + "\n");
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
                &&stringWorking.length() == 15) {
            return ":\n- Document number does not start with \"docnum\" or \"contract\" sequence!!!\n";
        }else if (stringWorking.length() != 15
                &&!stringWorking.substring(0, 6).equals("docnum")
                &&!stringWorking.substring(0, 8).equals("contract")) {
            return ":\n- Document number does not start with \"docnum\" or \"contract\" sequence!!! " +
                    "\n- The length of the document number is not 15, but is " + docNum.length()+"!!!\n";
        }else if (stringWorking.length() != 15){
            return ":\n- The length of the document number is not 15, but is " + docNum.length()+"!!!\n";
        }
return null;
    }


}

