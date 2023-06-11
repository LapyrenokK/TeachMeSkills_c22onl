package com.company.Task2Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer1 =new Computer(1500.2,"i5-13400F/16GB/1TB/RTX3060/W11x");
        System.out.println("Computer 1 : \n"+computer1.printComputerInformation());
        System.out.println();
        Computer computer2 = new Computer(3000,"13700F/32GB/1TB/RTX4070/W11x",
                new HDD("WD RED",1000,"external"),
                new RAM("Kingston FURY",32));
        System.out.println("Computer 2 : \n"+computer2.printComputerInformation());
    }
}
