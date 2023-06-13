package com.company.Task8_2_1;

public class Rectangle extends Figure{
    private double a,b,s,p;

    public Rectangle(double a, double b) {
        this.a=a;
        this.b=b;
        printAreaPerimeter();
    }

    @Override
    public double calculationArea() {
        s=a*b;
        return s;
    }

    @Override
    public double calculationPerimeter() {
        p=2*(a+b);
        return p;
    }

    public void printAreaPerimeter(){
        System.out.println("\nRectangle: ");
        System.out.printf("Area = %.1f m2\n",calculationArea());
        System.out.printf("Perimeter = %.1f m\n",calculationPerimeter());
    }

    public double getP() {
        return p;
    }
}
