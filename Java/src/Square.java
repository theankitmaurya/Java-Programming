package com.codewithankit.Shape;

public class Square extends com.codewithankit.Shape.Shape {
    Square(int dim1) {
        super(dim1, -1);
    }
    public int area() {
        return this.dim1 * this.dim1;
    }
}
