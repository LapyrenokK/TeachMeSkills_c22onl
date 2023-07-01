package com.company.Task10_1;


public class StringWorking {

    static String searchRowInDocument(String row, String documentNumber) throws CorrectStringException{
        if (documentNumber.toLowerCase().matches(".*" + row + ".*") || documentNumber.toUpperCase().matches(".*" + row + ".*")) {
            return "Yes, such a line is present in the document...";
        } else {
            throw new CorrectStringException("There is no \"abc\" in this line !!!");
        }
    }

    static String checkingFirstLinesInDocument(int row, String documentNumber) throws CorrectNumberException {
        if (documentNumber.substring(0, 3).equalsIgnoreCase(String.valueOf(row))) {
            return "Yes, such a line is present in the document...";
        } else {
            throw new CorrectNumberException("There is no \"555\" in this line !!!");
        }
    }

    static String checkingLastLinesInDocument(String row, String documentNumber) throws CorrectStringWithNumberException {
        if (documentNumber.substring(18, 22).equalsIgnoreCase(row)) {
            return "Yes, such a line is present in the document...";
        } else {
            throw new CorrectStringWithNumberException("There is no \"1a2b\" in this line !!!");
        }
    }

    static StringBuilder stringBuilder(String s) {
        return new StringBuilder(s);
    }
}

