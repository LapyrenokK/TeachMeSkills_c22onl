package com.company.Task10_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String words = "polop lop bob bari aaab";
        String[]arrayWord = words.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        int num;
        int length = arrayWord.length -1;

        do {
            System.out.println("Enter a number from 0 to "+length);
            num=scin().nextInt();
            if (num> length||num<0){
                System.out.println("You have entered an incorrect number!!!");
            }
        } while (num> length||num<0);



            if (arrayWord[num].equalsIgnoreCase(stringBuilder.append(arrayWord[num]).reverse().toString())){
                System.out.println("This is the word palindrome...");
            }else {
                System.out.println("This word is not a palindrome...");
            }
        }

    static Scanner scin(){
        return new Scanner(System.in);
    }
    
}
