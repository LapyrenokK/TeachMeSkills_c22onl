package com.company.Task10_1;


public class Main {
    public static void main(String[] args) {
        String documentNumber = "1234-qwe-5678-rty-9u0i";

        System.out.println(StringWorking.theFirstTwoBlocks(documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.stringWithoutLetters(documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.singleLetters(documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.singleLetterWithFormat(documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.searchRowInDocument("abc",documentNumber));
        System.out.println(StringWorking.searchRowInDocument("RTY",documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.checkingFirstLinesInDocument(123,documentNumber));
        System.out.println(StringWorking.checkingFirstLinesInDocument(555,documentNumber));
        System.out.println("-------------------------------------------------");
        System.out.println(StringWorking.checkingLastLinesInDocument("1a2b",documentNumber));
        System.out.println(StringWorking.checkingLastLinesInDocument("9u0i",documentNumber));
    }

}

