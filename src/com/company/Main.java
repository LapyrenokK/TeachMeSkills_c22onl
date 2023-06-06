package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task1: ");
        increaseNumArraay();
        System.out.println("\nTask2: ");
        paintChessboard();
        System.out.println("\nTask3: ");
        printMultiply2DArays();
        System.out.println("\nTask4: ");
        printSumArray();
        System.out.println("\nTask5: ");
        printDiagonalArray();
        System.out.println("\nTask6: ");
        printSort2DArray();

    }

    static void increaseNumArraay() {
        int[][][] arr = new int[][][]{{{1, 2, 3}, {4, 5, 6}}, {{7, 8, 9}, {10, 11, 12}, {13, 14, 15}}, {{16, 17, 18}, {19, 20, 21}, {22, 23, 24}, {25, 26, 27}}};
        System.out.println("Old array: ");
        printInteger3DArr(arr);
        System.out.print("Enter your number for increase: ");
        int num = cin().nextInt();
        increaInArray(arr, num);
        System.out.println("New array: ");
        printInteger3DArr(arr);
    }

    static void paintChessboard() {
        String[][] arrayStr = new String[8][8];

        for (int i = 0; i < arrayStr.length; ++i) {
            for (int j = 0; j < arrayStr[i].length; ++j) {
                if ((i + j) % 2 == 0) {
                    arrayStr[i][j] = "W";
                } else {
                    arrayStr[i][j] = "B";
                }
            }
        }

        print2DStringArr(arrayStr);
    }

    static void printMultiply2DArays() {
        int[][] arrOne = new int[][]{{1, 0, 0, 0}, {0, 1, 0, 0}, {0, 0, 0, 0}};
        int[][] arrTwo = new int[][]{{1, 2, 3}, {1, 1, 1}, {0, 0, 0}, {2, 1, 0}};
        if (ruleForMultiplyingArrays(arrOne, arrTwo)) {
            System.out.println("The number of columns of the first array is not equal to the number of rows of the second array");
        } else {
            printInteger2DArrStyleLine(getMultiplyArray(arrOne, arrTwo));
        }

    }

    static void printSumArray() {
        int[][] arrInt = new int[][]{{1, 2, 1}, {1, 5, 1}, {3, 3, 4}};
        int sum = 0;

        for (int i = 0; i < arrInt.length; ++i) {
            for (int j = 0; j < arrInt[i].length; ++j) {
                sum += arrInt[i][j];
            }
        }

        System.out.println("Sum of all array elements = " + sum);
    }

    static void printDiagonalArray() {
        int[][] arrInt = new int[][]{{1, 2, 1, 4, 4}, {1, 5, 1, 8, 5}, {3, 3, 4, 9, 3}, {3, 5, 6, 7, 2}, {4, 7, 8, 2, 3}};
        if (arrInt.length != arrInt[0].length) {
            System.out.println("The array must contain the same number of rows and columns");
        } else {
            getDiagonalArray(arrInt);
        }
    }

    static void printSort2DArray() {
        int[][] arrInt = new int[][]{{3, 8, 1, 7, 2, 1}, {1, 4, 9, 2, 5, 1}, {8, 1, 9, 3, 3, 4, 5}};
        for (int i = 0; i < arrInt.length; ++i) {
            for (int j = 0; j < arrInt[0].length; ++j) {
                int temp = 0;
                boolean doSort = false;
                while (!doSort) {
                    doSort = true;
                    for (int k = 0; k < arrInt[i].length - 1; k++) {
                        if (arrInt[i][k + 1] < arrInt[i][k]) {
                            temp = arrInt[i][k + 1];
                            arrInt[i][k + 1] = arrInt[i][k];
                            arrInt[i][k] = temp;
                            doSort = false;
                        }
                    }
                }
            }
        }
        printInteger2DArrStyleMatrix(arrInt);
    }

    static void printInteger3DArr(int[][][] array3D) {
        int[][][] var1 = array3D;
        int var2 = array3D.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            int[][] outer = var1[var3];
            int[][] var5 = outer;
            int var6 = outer.length;

            for (int var7 = 0; var7 < var6; ++var7) {
                int[] midle = var5[var7];
                int[] var9 = midle;
                int var10 = midle.length;

                for (int var11 = 0; var11 < var10; ++var11) {
                    int inter = var9[var11];
                    System.out.print(inter + "\t");
                }

                System.out.print("\t");
            }

            System.out.println("\t");
        }

    }

    static void printInteger2DArrStyleMatrix(int[][] array2D) {

        for (int[] inter : array2D) {
            for (int outer : inter) {
                System.out.print(outer + "\t");
            }
            System.out.println();
        }
    }

    static void printInteger2DArrStyleLine(int[][] array2D) {

        for (int[] inter : array2D) {
            for (int outer : inter) {
                System.out.print(outer + " ");
            }
            System.out.print("\t");

        }
    }


    static void print2DStringArr(String[][] array2D) {
        for (String[] inter : array2D) {
            for (String outer : inter) {
                System.out.print(outer + "\t");
            }
            System.out.println();
        }
    }

    static int[][] getMultiplyArray(int[][] arrOne, int[][] arrTwo) {
        int[][] newArr = new int[arrOne.length][arrTwo[0].length];

        for (int i = 0; i < arrOne.length; ++i) {
            for (int j = 0; j < arrTwo[0].length; ++j) {
                int sum = 0;

                for (int k = 0; k < arrOne[i].length; ++k) {
                    sum += arrOne[i][k] * arrTwo[k][j];
                }

                newArr[i][j] = sum;
            }
        }

        return newArr;
    }

    static int[][] getDiagonalArray(int[][] arrInt) {
        for (int i = 0; i < arrInt.length; ++i) {
            for (int j = 0; j < arrInt[i].length; ++j) {
                if (i != j && j != arrInt[i].length - i - 1) {
                    System.out.print("\t");
                } else {
                    System.out.print(arrInt[i][j] + "\t");
                }
            }

            System.out.println();
        }

        return arrInt;
    }

    static boolean ruleForMultiplyingArrays(int[][] arrOne, int[][] arrTwo) {
        return arrOne[0].length != arrTwo.length;
    }

    static Scanner cin() {
        return new Scanner(System.in);
    }

    static void increaInArray(int[][][] array3D, int numCin) {
        for (int outer = 0; outer < array3D.length; ++outer) {
            for (int midle = 0; midle < array3D[outer].length; ++midle) {
                for (int inter = 0; inter < array3D[outer][midle].length; ++inter) {
                    array3D[outer][midle][inter] += numCin;
                    System.out.print("\t");
                }
            }
        }

        System.out.println();
    }

}
