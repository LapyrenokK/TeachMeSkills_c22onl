package com.company.Task12_1_2;


import java.io.File;

public class Main {
    public static void main(String[] args){
        File file = new File("src/resources/text.txt");
        Documents documents = new Documents();
        documents.checkValidationkInDoc(file);

    }
}

