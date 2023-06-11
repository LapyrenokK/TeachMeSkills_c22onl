package com.company.Task3Bankomat;

public class Main {
    public static void main(String[] args) {
        Bankomat aliorBank = new Bankomat(10, 10, 10);

        aliorBank.putMoney();
        aliorBank.getAccountInformation();
        aliorBank.withdrawMoney();
        aliorBank.printInfoOperation();
        aliorBank.getAccountInformation();
    }
}
