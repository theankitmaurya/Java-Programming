package com.codewithankit.Shape;

public class Rectangle4 extends com.codewithankit.Shape.Shape {
    Rectangle4(int dim1, int dim2) {
        super(dim1, dim2);
    }
        public int area() {
            return this.dim1 * this.dim2;
        }
}
