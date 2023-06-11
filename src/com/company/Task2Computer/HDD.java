package com.company.Task2Computer;

public class HDD {
    private String name;
    private int capacity;
    private String type;

    public HDD(){
        this.name="Unknown";
        this.capacity=0;
        this.type="Unknown";

    }

    public HDD(String name, int capacity, String type) {
        this.name = name;
        this.capacity = capacity;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String printHDDInformation() {
        return  "HDD name= " + name + "\n"+
                "HDD capacity= " + capacity+" GB" +"\n"+
                "HDD type= " + type;
    }
}
