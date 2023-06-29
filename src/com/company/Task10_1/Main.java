package com.company.Task10_1;


import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Vector vector2D = new Vector2D(3, 5, 5, 9);
        System.out.printf("Length of vector A = %.2f\n",vector2D.getLengthVectorA());
        System.out.printf("Length of vector B = %.2f\n",vector2D.getLengthVectorB());
        System.out.println("Scalar product = "+vector2D.getScalar());
        System.out.println("Addition of vectors A and B = "+vector2D.getAdditionVectors());
        System.out.println("Difference of vectors A and B = "+vector2D.getDifferenceVectors());
        vector2D.equalsVectors();
        vector2D.getInfo();
        System.out.println("\n....................................\n");
        Vector vector3D = new Vector3D(3, 5, 7, 7, 4, 8);
        System.out.printf("Length of vector A = %.2f\n",vector3D.getLengthVectorA());
        System.out.printf("Length of vector B = %.2f\n",vector3D.getLengthVectorB());
        System.out.println("Scalar product = "+vector3D.getScalar());
        System.out.println("Addition of vectors A and B = "+vector3D.getAdditionVectors());
        System.out.println("Difference of vectors A and B = "+vector3D.getDifferenceVectors());
        vector3D.equalsVectors();
        vector3D.getInfo();
        System.out.println("\n....................................\n");
        System.out.println(Arrays.deepToString(getRandomArray2DVectors(5)));

    }

    static double[][] getRandomArray2DVectors(int n) {
        Random random = new Random();
        DecimalFormat decimalFormat = new DecimalFormat("#,##");
        double[][] vectors = new double[n][2];
        for (int i = 0; i < n; i++) {
            double x = Double.parseDouble(decimalFormat.format( (0 + random.nextDouble() * 100)));
            double y = Double.parseDouble(decimalFormat.format( (0 + random.nextDouble() * 100)));
            vectors[i][0] = x;
            vectors[i][1] = y;
        }
        return vectors;
    }
}

