package com.company.Task8_1_1;

public class Phone {
    private String number;
    private String model;
    private double weight;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        System.out.println(toString());
        new Phone("Unknown","Unknown");
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String name,String number){
        System.out.println("\nЗвонит "+ name +", Номер телефона: "+number);
    }

    public void receiveCall(String name){
        System.out.println("\nЗвонит "+ name);
    }

    public void sendMessage(String ...phoneNumber){
        for (String number:phoneNumber) {
            System.out.print("\nНомер телефона на который будет отправлено сообщение: "+number);
        }

    }


    public String getNumber() {
        return "\n"+number;
    }

    @Override
    public String toString() {
        return "\nPhone number: " + number + "\n" +
                "Phone model: " + model + "\n" +
                "Phone weight: " + weight;
    }
}
