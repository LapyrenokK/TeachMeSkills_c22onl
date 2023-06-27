package com.company.Task10_1;


public class StringWorking {
    static String theFirstTwoBlocks(String documentNumber) {
        return documentNumber.substring(0, 4) + documentNumber.substring(8, 13);
    }

    static String stringWithoutLetters(String documentNumber) {
        return documentNumber.replaceAll("[a-zA-Z]", "*");
    }

    static String singleLetters(String documentNumber) {
        return documentNumber.substring(5, 8) + "/" + documentNumber.substring(14, 17) + "/" + documentNumber.charAt(19) + "/" + documentNumber.charAt(21);
    }

    static StringBuilder singleLetterWithFormat(String documentNumber) {
        return stringBuilder(singleLetters(documentNumber)).insert(0, "Letters:");
    }

    static String searchRowInDocument(String row, String documentNumber) {
        if (documentNumber.toLowerCase().matches(".*" + row + ".*") || documentNumber.toUpperCase().matches(".*" + row + ".*")) {
            return "Yes, such a line is present in the document...";
        } else {
            return "No, there is no such line in the document...";
        }
    }

    static String checkingFirstLinesInDocument(int row, String documentNumber) {
        if (documentNumber.substring(0, 3).equalsIgnoreCase(String.valueOf(row))) {
            return "Yes, such a line is present in the document...";
        } else {
            return "No, there is no such line in the document...";
        }
    }

    static String checkingLastLinesInDocument(String row, String documentNumber) {
        if (documentNumber.substring(18, 22).equalsIgnoreCase(row)) {
            return "Yes, such a line is present in the document...";
        } else {
            return "No, there is no such line in the document...";
        }
    }

    static StringBuilder stringBuilder(String s) {
        return new StringBuilder(s);
    }
}

