package com.company.Task12_1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String doc;
        File file = new File("src/resources/text.txt");

        try (Scanner scin = new Scanner(file);) {
                while (scin.hasNext()) {
                    doc = scin.nextLine();
                    if (doc.substring(0, 6).equals("docnum")
                            || doc.substring(0, 8).equals("contract")
                            && doc.length() == 15) {
                        System.out.println("Valid document");
                    } else {
                        System.out.println("Document number not valid - " + doc);
                    }
                }

        } catch (FileNotFoundException | NoSuchElementException e) {
            e.printStackTrace();
        }

    }
}

