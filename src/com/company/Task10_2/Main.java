package com.company.Task10_2;

public class Main {
    public static void main(String[] args) {
        String s = "Hello my friends";
        System.out.println(s.replaceAll(".","$0$0"));

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i<s.length();i++){
            char letter = s.charAt(i);
            stringBuilder.append(letter).append(letter);
        }
        System.out.println(stringBuilder);
    }
}
