package com.company.Task8_2_2;

public class Main {
    public static void main(String[] args) {
        Post director = new Director();
        Post accountant = new Accountant();
        Post worker = new Worker();
        director.printPosition();
        accountant.printPosition();
        worker.printPosition();

    }
}
