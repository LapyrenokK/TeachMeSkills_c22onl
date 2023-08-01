package com.company.Task13_2;


public class Main {
    public static void main(String[] args) {
        MyArray<String> array = new MyArray<>(9);
        array.add("Alex");
        array.add("Ivan");
        array.add("Kirill");
        array.add("July");
        array.add("Jul");
        array.add("Ju");
        array.add("J");
        array.add("Moly");
        array.add("Jad");
        System.out.println("Default array size: "+array.arraySize());
        array.add("Georg");
        array.add("Pele");
        array.add("Bob");
        System.out.println("New array size: "+array.arraySize());

        array.printArray();

        array.remove("Ivan");

        array.printArray();

        System.out.println("Get element for index 2: "+array.get(2));

        System.out.println(array.contains("Kirill"));
        System.out.println(array.contains("Adam"));



    }
}
