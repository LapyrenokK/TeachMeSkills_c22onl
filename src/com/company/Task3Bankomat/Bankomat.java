package com.company.Task3Bankomat;

import java.util.Scanner;

public class Bankomat {
    private double currentSum, money;
    private int banknote20, banknote50, banknote100;
    private int getBanknote20, getBanknote50, getBanknote100;
    private double hundred, fifty, twenty;

    boolean completed;

    public Bankomat(int note20, int note50, int note100) {
        this.banknote20 = note20;
        this.banknote50 = note50;
        this.banknote100 = note100;
        currentSum = banknote20 * 20 + banknote50 * 50 + banknote100 * 100;
    }


    public double putMoney() {
        System.out.println("Only banknotes 20, 50, 100 are accepted\nEnter how much money you want to put in your account...");
        do {
            System.out.println("How much do you have banknotes 100?");
            hundred = cin().nextDouble();
            if (hundred < 0) {
                System.out.println("You have entered an incorrect number banknotes");
            }
        } while (hundred < 0);

        do {
            System.out.println("How much do you have banknotes 50?");
            fifty = cin().nextDouble();
            if (fifty < 0) {
                System.out.println("You have entered an incorrect number banknotes");
            }
        } while (fifty < 0);

        do {
            System.out.println("How much do you have banknotes 20?");
            twenty = cin().nextDouble();
            if (hundred < 0) {
                System.out.println("You have entered an incorrect number banknotes");
            }
        } while (hundred < 0);

        banknote100 += hundred;
        banknote50 += fifty;
        banknote20 += twenty;
        currentSum += hundred * 100 + fifty * 50 + twenty * 20;
        return currentSum;
    }

    public boolean withdrawMoney() {

        System.out.println("What amount do you want to withdraw?");
        money = cin().nextDouble();
        if (money < 0) {
            System.out.println("sorry, it will not be possible to withdraw such an amount," +
                    " there are only bills 20, 50, 100...");
            return completed = false;
        } else if (money > currentSum) {
            System.out.println("Sorry, you don't have enough money!!!");
            return completed = false;
        } else {
            currentSum -= money;

            if (money % 100 < 20) {
                banknote100 -= (int) (money / 100) - 1;
                getBanknote100 = (int) (money / 100) - 1;
                money = (money % 100) + 100;
            } else {
                banknote100 -= (int) money / 100;
                getBanknote100 = (int) money / 100;
                money %= 100;
            }
            if (money % 50 < 20) {
                banknote50 -= (int) (money / 50) - 1;
                getBanknote50 = (int) (money / 50) - 1;
                money = (money % 50) + 50;
                banknote20 -= (int) money / 20;
                getBanknote20 = (int) money / 20;
            } else {
                banknote50 -= (int) money / 50;
                getBanknote50 = (int) money / 50;
                money %= 50;
                banknote20 -= (int) money / 20;
                getBanknote20 = (int) money / 20;
            }
            printGetBanknote();
            return completed = true;
        }
    }


    public void getAccountInformation() {
        System.out.printf("\nYour account information %.2f $\n", currentSum);
        System.out.println("Banknotes 20 = " + banknote20 + "\nBanknotes 50 = " + banknote50 + "\nBanknotes 100 = " + banknote100);
    }

    public void printGetBanknote() {
        System.out.println("Banknote 100$= " + getBanknote100 + "\nBanknote 50$= " + getBanknote50 + "\nBanknote 20$= " + getBanknote20);
    }

    public void printInfoOperation() {
        if (completed == true) {
            System.out.println("Operation completed successfully");
        } else {
            System.out.println("Operation failed");
        }
    }

    private Scanner cin() {
        return new Scanner(System.in);
    }
}
