package com.codewithankit.Shape;

public class Cylinder2 extends com.codewithankit.Shape.Shape {
    public Cylinder2(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public Cylinder2() {
        super();
    }

    public double area() {
        return 2 * Math.PI * this.dim1 * (this.dim2 + this.dim1);
    }

    public void setRadius(int i) {
    }

    public boolean getRadius() {
        return false;
    }

    public void setHeight(int i) {
    }

    public boolean getHeight() {
        return false;
    }
}
