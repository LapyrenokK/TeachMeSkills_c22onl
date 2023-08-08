package com.company.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class ArrayWork {
    private Collection<Integer> integerList=new ArrayList<>();
    private String choiceArray;
    private int size;

    public ArrayWork(String choiceArray, int size) {
        this.choiceArray = choiceArray;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getChoiceArray() {
        return choiceArray;
    }


    public Collection<Integer>choiceArray(String choiceArray){
        if (choiceArray.equalsIgnoreCase("My")){
            return createMyArray();
        } else if (choiceArray.equalsIgnoreCase("Random")) {
            return createRandomArray(size);
        }else return new ArrayList<>();
    }

    public Collection<Integer> getIntegerList() {
        return integerList;
    }

    public void setIntegerList(Collection<Integer> integerList) {
        this.integerList = integerList;
    }

    public Collection<Integer> createMyArray(){
        integerList = new ArrayList<>();
        integerList.add(3);
        integerList.add(1);
        integerList.add(13);
        integerList.add(3);
        integerList.add(18);
        integerList.add(9);
        integerList.add(4);
        integerList.add(30);
        integerList.add(3);
        integerList.add(17);
        integerList.add(7);
        integerList.add(16);
        integerList.add(10);
        return integerList;
    }

    public Collection<Integer> createRandomArray(int size){
        Random random = new Random();
        for (int i = 0; i < size; i++) {
        integerList.add(random.nextInt(100));
        }
        return integerList;
    }

}
