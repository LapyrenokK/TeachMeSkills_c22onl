package com.company.Task2Computer;

public class Computer {
    private double price;
    private String model;
    private HDD hdd;
    private RAM ram;

    public Computer(double cost, String model) {
        this.price = cost;
        this.model = model;
        new HDD();
        new RAM();
    }

    public Computer(double cost, String model, HDD hdd, RAM ram) {
        this.price = cost;
        this.model = model;
        this.hdd = hdd;
        this.ram = ram;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public HDD getHdd() {
        return hdd;
    }

    public void setHdd(HDD hdd) {
        this.hdd = hdd;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public String printComputerInformation() {
        return "Computer price: " + price + "$\n"+
                "Computer model= " + model +"\n"+
                new HDD().printHDDInformation() +"\n"+
                new RAM().printRAMInformation() ;
    }
}
