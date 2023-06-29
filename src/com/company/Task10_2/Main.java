package com.company.Task10_2;


import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        double[] a = {3,5};
        double[] b = {5,9};
        Vector vector = new Vector(a,b);
        System.out.printf("Length of vector A = %.2f\n",vector.getLengthVectorA());
        System.out.printf("Length of vector B = %.2f\n",vector.getLengthVectorB());
        System.out.println("Scalar product = "+vector.getScalar());
        System.out.println("Addition of vectors A and B = "+ Arrays.toString(vector.getAdditionVectors()));
        System.out.println("Difference of vectors A and B = "+Arrays.toString(vector.getDifferenceVectors()));
        vector.equalsVectors();
        vector.getInfo();


    }
}
