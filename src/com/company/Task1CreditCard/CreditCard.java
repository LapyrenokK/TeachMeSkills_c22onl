package com.company.Task1CreditCard;

public class CreditCard {
    private String accountNumber; ;
    private double currentSum;

    public CreditCard(String accountNumber, double currentSum) {
        this.accountNumber = accountNumber;
        this.currentSum = currentSum;
    }

    public double addMoney (double amountToBeCharged ) {
        if (amountToBeCharged <= 0) {
            System.out.println("Amount entered incorrectly");
            return amountToBeCharged;

        } else {
            System.out.println("Amount added " + amountToBeCharged + "$, to account " + accountNumber);
            return currentSum += amountToBeCharged;
        }
    }

    public double withdrawMoney(double withdraw) {
        if (withdraw <= 0) {
            System.out.println("Amount entered incorrectly");
            return withdraw;
        } else if (withdraw > currentSum) {
            System.out.println("There are not enough funds in your account : "+currentSum+"$");
            return withdraw;
        } else {
            System.out.println("Withdrawn " + withdraw + "$, from account " + accountNumber);
            return currentSum -= withdraw;
        }
    }

    public void getInformationMoney(){
        System.out.printf("The amount on your account %s is %.2f $ \n",accountNumber,currentSum);
       // System.out.println("The amount on your account: "+accountNumber+" is "+currentSum+"$");
    }

}
