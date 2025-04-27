class Circle {
    public Circle() {
        System.out.println("This is a Circle");
    }
}

class Cylinders extends Circle {
    public Cylinders() {
        System.out.println("This is a Cylinders");
    }
}

public class Practice_Set_10_Q1 {
    public static void main(String[] args) {
        // Create a class Circle and use Inheritance to create another class Cylinder
        // from it.

        Circle c1 = new Circle();
        Cylinders c2 = new Cylinders();

        System.out.println(c1);
        System.out.println(c2);
    }
}
