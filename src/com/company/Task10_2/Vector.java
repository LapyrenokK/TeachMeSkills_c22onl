package com.company.Task10_2;

import java.util.Arrays;

public class Vector {
    private final String info1 = "This is a vector for a";
    private final String info2 = "-dimensional coordinate system";
    private final double[] vectorsCoordinatesA;
    private final double[] vectorsCoordinatesB;


    public Vector(double[] vectorsCoordinatesA, double[] vectorsCoordinatesB) {
        this.vectorsCoordinatesA = vectorsCoordinatesA;
        this.vectorsCoordinatesB = vectorsCoordinatesB;
    }

    public double getLengthVectorA() {
        double sum = 0;
        for (int i = 0; i < vectorsCoordinatesA.length; i++) {
            sum += vectorsCoordinatesA[i] * vectorsCoordinatesA[i];
        }
        return Math.sqrt(sum);
    }

    public double getLengthVectorB() {
        double sum = 0;
        for (int i = 0; i < vectorsCoordinatesB.length; i++) {
            sum += vectorsCoordinatesB[i] * vectorsCoordinatesB[i];
        }
        return Math.sqrt(sum);
    }

    public double getScalar() {
        double sum = 0;
        for (int i = 0; i < vectorsCoordinatesA.length; i++) {
            sum += vectorsCoordinatesA[i] * vectorsCoordinatesB[i];
        }
        return sum;
    }

    public double[] getAdditionVectors() {
        double[] result = new double[vectorsCoordinatesA.length];
        for (int i = 0; i < vectorsCoordinatesA.length; i++) {
            result[i] = vectorsCoordinatesA[i] + vectorsCoordinatesB[i];
        }
        return result;
    }

    public double[] getDifferenceVectors(){
        double[] result = new double[vectorsCoordinatesA.length];
        for (int i = 0; i < vectorsCoordinatesA.length; i++) {
            result[i] = vectorsCoordinatesA[i] - vectorsCoordinatesB[i];
        }
        return result;
    }

    public void equalsVectors() {
        if (Arrays.equals(vectorsCoordinatesA,vectorsCoordinatesB)){
            System.out.println("Vector A is equal to vector B");
        } else {
            System.out.println("Vector A is not equal to vector B");
        }
    }

    public void getInfo() {
        System.out.println("Coordinates of vector A = "+Arrays.toString(vectorsCoordinatesA));
        System.out.println("Coordinates of vector B = "+Arrays.toString(vectorsCoordinatesB));
        System.out.printf("%s %d%s",info1,vectorsCoordinatesA.length,info2);
    }


    public void printArray(double[]aray){
        System.out.println(Arrays.toString(aray));
    }
}
