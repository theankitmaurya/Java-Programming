package com.codewithankit.Shape;

public class Rectangle4 extends Shape {
    protected double length;
    protected double width;

    public Rectangle4(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double surfaceArea() {
        return length * width;
    }

    public double volume() {
        return 0;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


}
