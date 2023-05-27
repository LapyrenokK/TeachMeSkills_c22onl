package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 1.1");
        System.out.println(getMonthWithSwitchCase());
        System.out.println();

        System.out.println("Exercise 1.2");
        System.out.println(getMonthWithIfElse());
        System.out.println();

        System.out.println("Exercise 1.3");
        System.out.println(getEvenOddResult());
        System.out.println();

        System.out.println("Exercise 1.4");
        System.out.println(getWeather());
        System.out.println();

        System.out.println("Exercise 1.5");
        System.out.println(getColorOfTheReinbow());
        System.out.println();

        System.out.println("Exercise 2.1");
        printOddNuumbers();
        System.out.println();

        System.out.println("Exercise 2.2");
        printReverseNumbers();
        System.out.println();

        System.out.println("Exercise 2.3");
        getResultSum();
        System.out.println();

        System.out.println("Exercise 2.4");
        printNumbers7_98();
        System.out.println();

        System.out.println("Exercise 2.5");
        printFirstNumbers10();
        System.out.println();

        System.out.println("Exercise 2.6");
        printSquareNumbers();
        System.out.println();

        System.out.println("Exercise 3.1");
        printFibNums();
        System.out.println();

        System.out.println("Exercise 3.2");
        printDepositBank();
        System.out.println();

        System.out.println("Exercise 3.3");
        printMultiplicationTable();


    }

    static String getMonthWithSwitchCase() {
        System.out.print("Method switch-case.\n Enter season number: ");
        switch (cout().nextInt()) {
            case 1, 2, 12:
                return "Winter!";
            case 3, 4, 5:
                return "Spring!";
            case 6, 7, 8:
                return "Summer!";
            case 9, 10, 11:
                return "Autumn!";
            default:
                return "Тo such month!!!";
        }
    }

    static String getMonthWithIfElse() {
        System.out.print("Method if-else-if: \n Enter season number: ");
        int season = cout().nextInt();
        if (season == 1 || season == 2 || season == 12) {
            return "Winter!";
        } else if (season == 3 || season == 4 || season == 5) {
            return "Spring!";
        } else if (season == 6 || season == 7 || season == 8) {
            return "Summer!";
        } else if (season == 9 || season == 10 || season == 11) {
            return "Autumn!";
        } else {
            return "Тo such month!!!";
        }
    }

    static String getEvenOddResult() {
        System.out.print("Enter your number: ");
        int number = cout().nextInt();
        if (number % 2 == 1) {
            return "Number: " + number + " - Odd.";
        } else {
            return "Number: " + number + " - Even.";
        }
    }

    static String getWeather() {
        System.out.print("Enter temperature: ");
        int temperature = cout().nextInt();
        if (temperature > -5) {
            return "Тепло";
        } else if (-5 >= temperature && temperature > -20) {
            return "Нормально";
        } else if (-20 >= temperature) {
            return "Холодно";
        } else {
            return null;
        }
    }

    static String getColorOfTheReinbow() {
        System.out.print("Enter number rainbow: ");
        switch (cout().nextInt()) {
            case 1:
                return "RED";
            case 2:
                return "ORANGE";
            case 3:
                return "YELLOW";
            case 4:
                return "GREEN";
            case 5:
                return "CYAN";
            case 6:
                return "BLUE";
            case 7:
                return "VIOLET";
            default:
                return "It's not the color of the rainbow...";
        }
    }

    static void printOddNuumbers() {
        for (int i = 1; i <= 99; i++) {
            System.out.print(i + " ");
            i++;
        }
    }

    static void printReverseNumbers() {
        int i = 5;
        do {
            System.out.println(i);
            i--;
        } while (i >= 1);
    }

    static void getResultSum() {
        System.out.print("Enter your number: ");
        int number = cout().nextInt();
        int count = 0;
        for (int i = 1; i <= number; i++) {
            count += i;
        }
        System.out.println(count);
    }

    static void printNumbers7_98() {
        int i = 0;
        while (i < 98) {
            i += 7;
            System.out.print(i + " ");
        }
    }

    static void printFirstNumbers10() {
        for (int i = 0; i >= (-5 * 9); i -= 5) {
            System.out.print(i + " ");
        }
    }

    static void printSquareNumbers() {
        int num = 10;
        for (int i = 10; i <= 20; i++) {
            System.out.println(i + "^2= " + i * i);
        }
    }

    static void printFibNums() {

        int sum = 1, fib1 = 1, fib2 = 1, i = 0;
        for (int n = 0; n < 11; n++) {
            while (i <= n - 2) {
                sum = fib1 + fib2;
                fib1 = fib2;
                fib2 = sum;
                i++;
            }
            System.out.println(sum + " ");
        }
    }

    static void printDepositBank() {
        System.out.print("Enter your deposit amount in $: ");
        float money = cout().nextFloat();
        System.out.print("Enter number of months for deposit: ");
        int months = cout().nextInt();
        float sum = money, procent = 7 / 100f;
        for (int i = 1; i <= months; i++) {
            sum = sum * procent + sum;
        }
        String formatted = String.format("%.2f", sum);
        System.out.println("Final amount = " + formatted + "$");
    }

    static void printMultiplicationTable() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.println("["+i + "*" + j + " = " + i * j+"]");
            }
            System.out.println();
        }
    }


    static Scanner cout() {
        return new Scanner(System.in);
    }
}
