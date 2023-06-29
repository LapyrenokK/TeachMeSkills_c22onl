package com.company.Task10_1;

public class Vector3D implements Vector {
    private final String info = "This is a vector for a three-dimensional coordinate system";
    private double ax, ay, az;
    private double bx, by, bz;


    public Vector3D(double ax, double ay, double az, double bx, double by, double bz) {
        this.ax = ax;
        this.ay = ay;
        this.az = az;
        this.bx = bx;
        this.by = by;
        this.bz = bz;
    }

    @Override
    public double getLengthVectorA() {
        return Math.sqrt(ax * ax + ay * ay + az * az);
    }

    @Override
    public double getLengthVectorB() {
        return Math.sqrt(bx * bx + by * by + bz * bz);
    }

    @Override
    public double getScalar() {
        return (ax * bx) + (ay * by) + (az * bz);
    }

    @Override
    public String getAdditionVectors() {
        return "{" + (ax + bx) + ";" + (ay + by) + ";" + (az + bz) + "}";
    }

    @Override
    public String getDifferenceVectors() {
        return "{" + (ax - bx) + ";" + (ay - by) + ";" + (az - bz) + "}";
    }

    @Override
    public void equalsVectors() {
        if (ax == bx && ay == by && az == bz) {
            System.out.println("Vector A is equal to vector B");
        } else {
            System.out.println("Vector A is not equal to vector B");
        }
    }

    @Override
    public void getInfo() {
        System.out.println("Coordinates of vector A = {"+ax+","+ay+","+az+"}");
        System.out.println("Coordinates of vector B = {"+bx+","+by+","+bz+"}");
        System.out.println(this.info);
    }
}
