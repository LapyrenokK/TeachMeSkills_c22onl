package com.company.Task10_1;


public class Vector2D implements Vector {
    private final String info = "This is a vector for a two-dimensional coordinate system";
    private double ax, ay, bx, by;


    public Vector2D(double ax, double ay, double bx, double by) {
        this.ax = ax;
        this.ay = ay;
        this.bx = bx;
        this.by = by;
    }

    @Override
    public double getLengthVectorA() {
        return Math.sqrt(ax * ax + ay * ay);
    }

    @Override
    public double getLengthVectorB() {
        return Math.sqrt(bx * bx + by * by);
    }

    @Override
    public double getScalar() {
        return (ax * bx) + (ay * by);
    }

    @Override
    public String getAdditionVectors() {
        return "{" + (ax + bx) + ";" + (ay + by) + "}";
    }

    @Override
    public String getDifferenceVectors() {
        return "{" + (ax - bx) + ";" + (ay - by) + "}";
    }

    @Override
    public void equalsVectors() {
        if (ax == bx && ay == by) {
            System.out.println("Vector A is equal to vector B");
        } else {
            System.out.println("Vector A is not equal to vector B");
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Coordinates of vector A = {"+ax+","+ay+"}");
        System.out.println("Coordinates of vector B = {"+bx+","+by+"}");
        System.out.println(this.info);
    }


}
