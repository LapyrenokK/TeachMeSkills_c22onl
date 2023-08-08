package com.company.Task1;

import java.util.Collection;


public class StreamWork {
    private ArrayWork array;

    public StreamWork(String choiceArray,int size) {
        array = new ArrayWork(choiceArray,size) ;
    }


    public Collection<Integer> originalList(){
        return array.choiceArray(array.getChoiceArray());
    }

    public Collection<Integer> deletedDuplicate(){
        Collection<Integer> list = array.getIntegerList().stream().distinct().toList();
return list;
    }

    public Collection<Integer> getArrayEvenWithRange(int firstRange, int lastRange){
        Collection<Integer> list = array.getIntegerList().stream().filter(n->n>firstRange&n<lastRange&n%2==0).toList();
        return list;
    }

    public Collection<Integer> getArrayMuliplyX2(){
        Collection<Integer> list = array.getIntegerList().stream().map(n->n*2).toList();
        return list;
    }

    public Collection<Integer> firstNums(int limitNums){
        Collection<Integer> list = array.getIntegerList().stream().limit(limitNums).sorted().toList();
        return list;
    }

    public long count(){
        long count = array.getIntegerList().stream().count();
        return count;
    }

    public double average(){
        double count = array.getIntegerList().stream().mapToDouble(n->n).average().getAsDouble();
        return count;
    }










}
