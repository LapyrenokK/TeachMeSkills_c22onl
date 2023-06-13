package com.company.Task8_2_1;

public class Circle extends Figure {
    private double r, s, p;
    private final double pi = Math.PI;

    public Circle(double r) {
        this.r=r;
        printAreaPerimeter();
    }

    @Override
    public double calculationArea() {
        s = r * pi;
        return s;
    }

    @Override
    public double calculationPerimeter() {
        p = 2 * pi * r;
        return p;
    }

    public void printAreaPerimeter() {
        System.out.println("\nCircle: ");
        System.out.printf("Area = %.1f m2\n", calculationArea());
        System.out.printf("Perimeter = %.1f m\n", calculationPerimeter());
    }

    public double getP() {
        return p;
    }
}
