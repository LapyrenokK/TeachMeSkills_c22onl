package com.company.Task8_2_1;

public class Triangle extends Figure{
    private double a,b,c,s,p;

    public Triangle(double a, double b, double c) {
        this.a=a;
        this.b=b;
        this.c=c;
        printAreaPerimeter();

    }

    @Override
    public double calculationArea() {
        p=calculationPerimeter()/2;
        s=Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    public double calculationPerimeter(){
        p=(a+b+c);
        return p;
    }

    public void printAreaPerimeter(){
        System.out.println("\nTriangle: ");
        System.out.printf("Area = %.1f m2\n",calculationArea());
        System.out.printf("Perimeter = %.1f m\n",calculationPerimeter());
    }

    public double getP() {
        return p;
    }
}
