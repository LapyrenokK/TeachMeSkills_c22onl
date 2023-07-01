package com.company.Task10_1;



public class Main {
    public static void main(String[] args) {
        String documentNumber = "1234-qwe-5678-rty-9u0i";

        try {
            System.out.println(StringWorking.searchRowInDocument("abc",documentNumber));
        }catch (CorrectStringException e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(StringWorking.searchRowInDocument("RTY",documentNumber));
        }catch (CorrectEnterException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println("-------------------------------------------------");

        try {
            System.out.println(StringWorking.checkingFirstLinesInDocument(123,documentNumber));
        }catch (CorrectNumberException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(StringWorking.checkingFirstLinesInDocument(555,documentNumber));
        }catch (CorrectEnterException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("-------------------------------------------------");

        try {
            System.out.println(StringWorking.checkingLastLinesInDocument("1a2b",documentNumber));
        }catch (CorrectStringWithNumberException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        try {
            System.out.println(StringWorking.checkingLastLinesInDocument("9u0i",documentNumber));
        }catch (CorrectEnterException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }



        }

}

