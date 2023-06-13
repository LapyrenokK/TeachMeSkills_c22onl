package com.company.Task8_2_1;

public class Main {
    public static void main(String[] args) {
        Figure triangle1 = new Triangle(21,21,21);
        Figure triangle2 = new Triangle(5,5,6);
        Figure rectangle1 = new Rectangle(4,5);
        Figure rectangle2 = new Rectangle(10,4);
        Figure circle= new Circle(15);
        Figure[]figuresArr = new Figure[]{triangle1,rectangle1,circle,triangle2,rectangle2};
        System.out.printf("\nSum of perimeters of figures in this array: %.1f",getSumPerimetersFigure(figuresArr));
    }

    static double getSumPerimetersFigure(Figure[]figeresArrey) {
        double sumPerimeters=0;
     for (int figure =0; figure<figeresArrey.length;figure++){
         sumPerimeters+=figeresArrey[figure].getP();
     }
        return sumPerimeters;
    }

    }

