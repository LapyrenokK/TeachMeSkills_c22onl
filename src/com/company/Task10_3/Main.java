package com.company.Task10_3;



public class Main {
    public static void main(String[] args) {
        String s = "Hello my world";
        String longestWord = null;
        String shortestWord = null;

        String[] arrayWords = s.split(" ");
        for (int i = 1; i < arrayWords.length; i++) {
            if (arrayWords[i-1].length() > arrayWords[i].length()) {
                longestWord = arrayWords[i];
            } else {
                shortestWord = arrayWords[i];
            }
        }
        System.out.println("Longest word: " + shortestWord + "\nShortest word: " + longestWord);
    }
}
