package com.company.Task1CreditCard;


import com.company.Task1CreditCard.CreditCard;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nTask1: ");
        CreditCard bankPKO= new CreditCard("40000001110101010101",600);
        CreditCard bankSantander= new CreditCard("50000003330101010101",333.3);
        CreditCard bankAliorBank= new CreditCard("60000004440101010101",1000.2);

        System.out.println("Bank PKO");
        bankPKO.addMoney(100.3);
        bankPKO.getInformationMoney();

        System.out.println("\nBank Santander");
        bankSantander.addMoney(335.8);
        bankSantander.getInformationMoney();

        System.out.println("\nAlior Bank");
        bankAliorBank.withdrawMoney(1001);
        bankAliorBank.getInformationMoney();


    }

}
