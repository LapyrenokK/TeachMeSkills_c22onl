package com.company.Task1;

public class Main {
    public static void main(String[] args) {
        // select list 1-My , 2-Random , and size list
        StreamWork streamWork = new StreamWork("Random",10);
        System.out.println("Original list: ");
        System.out.println(streamWork.originalList());
        System.out.println("List without duplicate: ");
        System.out.println(streamWork.deletedDuplicate());
        System.out.println("List with range: ");
        System.out.println(streamWork.getArrayEvenWithRange(7,17));
        System.out.println("List with num x 2:  ");
        System.out.println(streamWork.getArrayMuliplyX2());
        System.out.println("List with 4 first num:  ");
        System.out.println(streamWork.firstNums(4));
        System.out.println("Size list: ");
        System.out.println(streamWork.count());
        System.out.println("Average nums in list:  ");
        System.out.println(streamWork.average());





    }
    }
