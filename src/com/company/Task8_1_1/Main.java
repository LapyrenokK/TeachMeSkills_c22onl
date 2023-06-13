package com.company.Task8_1_1;


public class Main {
    public static void main(String[] args) {
        Phone sumsung = new Phone("111 222 333","Gelaxy S23",228);
        Phone iphone = new Phone("444 555 666","14Pro Max",240);
        Phone huawei= new Phone("777 888 999","Mate X3",240);
        sumsung.receiveCall("Ivan");
        iphone.receiveCall("Igor");
        huawei.receiveCall("Iga");
        System.out.println(sumsung.getNumber());
        System.out.println(iphone.getNumber());
        System.out.println(huawei.getNumber());
        sumsung.receiveCall("Natalia","123 456 789");
        iphone.receiveCall("Katia","987 654 321");
        huawei.receiveCall("Andry","666 666 666");
        sumsung.sendMessage("123 456 789","987 654 321","111 222 3333");
    }
    }

