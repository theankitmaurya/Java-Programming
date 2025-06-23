class Circle1 {
    public int radius;

    public Circle1(int r) {
        this.radius = r;
    }

    public double Area() {
        return Math.PI * radius * radius;
    }
}

class Cylinder1 extends Circle1 {
    public int height;

    public Cylinder1(int r, int h) {
        super(r);
        this.height = h;
    }

    public double Volume() {
        return Math.PI * radius * radius * height;
    }
}

public class Practice_Set_10_Q3 {
    public static void main(String[] args) {
        // Create methods for Area and Volume in Question 1

        Circle1 c = new Circle1(5);
        Cylinder1 cy = new Cylinder1(5, 10);

        System.out.println("Area of Circle2: " + c.Area());
        System.out.println("Volume of Cylinder2: " + cy.Volume());
    }
}
