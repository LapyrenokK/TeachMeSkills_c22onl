package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Exercise 1
        PersonInformation personInformation = new PersonInformation();
        personInformation.printInfoPerson(personInformation);
        System.out.println();
        //Exercise 2
        changeCharToNumber();
        System.out.println();
        //Exercise 3
        printBMI();

    }

    static void changeCharToNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input symbol: ");
        char symbol = sc.next().charAt(0);
        int number = (int) symbol;
        System.out.println("Symbol " + symbol + "=" + number);
    }

    static void printBMI() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();
        System.out.print("enter your weight in kilogram: ");
        double weigth = sc.nextDouble();
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
}
