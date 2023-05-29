package com.company;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Exercise 0");
        printIsNumberInArray();
        System.out.println();
        System.out.println("Exercise 1");
        printDeleteNumInArr();
        System.out.println();
        System.out.println("Exercise 2");
        printMinMaxMid();
        System.out.println();
        System.out.println("Exercise 3");
        arraysСomparison();
        System.out.println();
        System.out.println("Exercise 4");
        printRandomArrayRange5to10();
        System.out.println();
        System.out.println("Exercise 5");
        printArrOddNumSwapZero();
        System.out.println();
        System.out.println("Exercise 6");
        printStringArrayName();
        System.out.println();
        System.out.println("Exercise 7");
        sortBubble();
        System.out.println();
    }

    static void sortBubble() {
        int[] arr = getRandomArray(20, -100, 100);
        System.out.print("Random array: ");
        printArrTypeInt(arr);
        sortedArray(arr);
        System.out.print("Array bubble sort: ");
        printArrTypeInt(arr);
    }

    static void printRandomArrayRange5to10() {
        int length;
        do {
            System.out.print("Enter length of the array from 5 to 10: ");
            length = cout().nextInt();
            if (!getLengthFormatExc(length,10,5))
                System.out.println("Please enter a valid length in range from 5 to 10...");
        } while (!getLengthFormatExc(length,10,5));
        int[] arr = getRandomArray(length, -10, 10);
        System.out.print("Array: ");
        printArrTypeInt(arr);
        printSortArrOnlyEvenNum(arr);
    }

    static void printArrOddNumSwapZero() {
        int[] arr = new int[]{4, -10, 55, 6, 22, -77, 4, 1, -98, 9, -7, 20, 33, -40, 15, 1, -10, 4};
        System.out.print("Old array: ");
        printArrTypeInt(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }
        System.out.print("New array: ");
        printArrTypeInt(arr);
    }

    static void printStringArrayName() {
        String[] names = new String[]{"Cassandra", "Lisa", "Sandra", "Laura", "Sylvia", "Martin", "Barbara"};
        System.out.print("Not sorted Array: ");
        printArrTypeString(names);
        Arrays.sort(names);
        System.out.print("Sorted Array: ");
        printArrTypeString(names);
    }

    static void printIsNumberInArray() {
        System.out.print("Enter your number from -100 and to 100: ");
        int number = cout().nextInt();
        int[] arr = new int[]{4, -10, 55, 6, 22, -77, 4, 1, -98, 9, -7, 20, 33, -40, 15, 1, -10, 4};
        searchNumberInArray(arr, number);
        System.out.print("Array: ");
        printArrTypeInt(arr);
    }

    static void printDeleteNumInArr() {
        System.out.print("Enter your number from -100 and to 100: ");
        int number = cout().nextInt();
        int[] arr = new int[]{4, -10, 55, 6, 22, -77, 4, 1, -98, 9, -7, 20, 33, -40, 15, 1, -10, 4};
        System.out.print("Array: ");
        printArrTypeInt(arr);
        deleteNumbersInArray(arr, number);
    }

    static void printMinMaxMid() {
        System.out.print("Enter length of the array : ");
        int size = cout().nextInt();
        int[] arr = getRandomArray(size, 100, -100);
        System.out.print("Array: ");
        printArrTypeInt(arr);
        System.out.println("Middle = " + String.format("%.2f", getMidValue(arr)));
    }

    static void arraysСomparison() {
        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 4, 6, 8, 10};
        System.out.print("Array 1: ");
        printArrTypeInt(arr1);
        System.out.println("Middle 1= " + getMidValue(arr1));
        System.out.print("Array 2: ");
        printArrTypeInt(arr2);
        System.out.println("Middle 1= " + getMidValue(arr2));

        if (getMidValue(arr1) > getMidValue(arr2)) {
            System.out.println("Array 1 more than Array2 ");
        } else if (getMidValue(arr1) < getMidValue(arr2)) {
            System.out.println("Array 2 more than Array1 ");
        } else {
            System.out.println("Array 2 equals Array1 ");
        }
    }

    static boolean getLengthFormatExc(int input,int max,int min) {
        if (input >= min && input <= max) {
            return true;
        } else {
            return false;
        }
    }

    static int[] sortedArray(int[]arr){
        int sort = 0;
        boolean doSort = false;
        while (!doSort) {
            doSort = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i + 1] < arr[i]) {
                    sort = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = sort;
                    doSort = false;
                }
            }
        }
        return arr;
    }

    static void printSortArrOnlyEvenNum(int[] arr) {
        int count = 0;
        boolean isNum = false;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                newArr[i - count] = arr[i];
            } else {
                isNum = true;
                count++;
            }
        }
        if (isNum == true) {
            System.out.println("Array of even numbers: " + Arrays.toString(Arrays.copyOf(newArr, newArr.length - count)));
        }
    }


    static void getMinMaxValue(int[] arr) {
        int min = 0, max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Min= " + min + "\n" + "Max= " + max);
    }

    static double getMidValue(int[] arr) {
        double mid = 0;
        for (int i = 0; i < arr.length; i++) {
            mid += arr[i];
        }
        return mid / arr.length;
    }

    static int[] getRandomArray(int size, int min, int max) {
        int range = max - min + 1;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((Math.random() * range) + min);
        }
        return arr;
    }

    static void searchNumberInArray(int[] arr, int number) {
        int count = 0;
        boolean isNum = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                isNum = true;
                count++;
            }
        }
        if (isNum == true) {
            System.out.println("Number '" + number + "' found " + count + " times");
        } else {
            System.out.println("Number '" + number + "' is not in the array");
        }
    }

    static void deleteNumbersInArray(int[] arr, int number) {
        int count = 0;
        boolean isNum = false;
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                isNum = true;
                count++;
            } else {
                newArr[i - count] = arr[i];
            }
        }
        if (isNum == true) {
            System.out.println("Number '" + number + "' delete " + count + " times");
            System.out.println("New array: " + Arrays.toString(Arrays.copyOf(newArr, newArr.length - count)));
        } else {
            System.out.println("Number '" + number + "' is not in the array");
        }
    }

    static void printArrTypeInt(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static void printArrTypeString(String[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    static Scanner cout() {
        return new Scanner(System.in);
    }
}
