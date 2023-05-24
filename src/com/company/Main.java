package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//      Exercise 1
        printPersonInf();
        System.out.println();
//      Exercise 2
        changeCharToNumber();
        System.out.println();
//      Exercise 3
        printBMI();

    }
    static void printPersonInf()
    {
        System.out.print("Write your Name: ");
        String name = cout().nextLine();
        System.out.print("Write your Surname: ");
        String surname = cout().nextLine();
        System.out.print("Write your age: ");
        short age = cout().nextShort();
        System.out.print("Write your height: ");
        int height = cout().nextInt();
        System.out.print("Write your weight: ");
        double weight = cout().nextDouble();
        System.out.println("\n You preson data: \n Your Name - "+name+" \n Your Surname - "+surname+" \n You Age - "+age+" \n You Height - "+height+" \n You Weight - "+weight);
    }


    static void changeCharToNumber()
    {
        System.out.print("Input symbol: ");
        char symbol = cout().next().charAt(0);
        System.out.println("Symbol " + symbol + "=" +(int)symbol);
    }

    static void printBMI()
    {
        System.out.print("Enter your height : ");
        double height = cout().nextDouble()/100;
        System.out.print("Enter your weight : ");
        double weigth = cout().nextDouble();
        double heightM2 = Math.pow(height, 2);
        double bmi = weigth / heightM2;
        String formattedBMI = String.format("%.2f", bmi);
        System.out.println("You BMI = " + formattedBMI);
        if (bmi < 16) {
            System.out.println("Classification - Severe Thinness");
        } else if (bmi > 16 && bmi < 17) {
            System.out.println("Classification - Moderate Thinness");
        } else if (bmi > 17 && bmi < 18.5) {
            System.out.println("Classification - Mild Thinness");
        } else if (bmi > 18.5 && bmi < 25) {
            System.out.println("Classification - Normal");
        } else if (bmi > 25 && bmi < 30) {
            System.out.println("Classification - Overweight");
        } else if (bmi > 30 && bmi < 35) {
            System.out.println("Classification - Obese Class I");
        } else if (bmi > 35 && bmi < 40) {
            System.out.println("Classification - Obese Class II");
        } else {
            System.out.println("Classification - Obese Class III");
        }
    }
    static Scanner cout (){
        return new Scanner(System.in);
    }
}
