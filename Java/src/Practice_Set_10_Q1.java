import com.codewithankit.Shape.Circle2;

class Circle {
    public Circle() {
        System.out.println("This is a Circle2");
    }
}

class Cylinders extends Circle2 {
    public Cylinders() {
        super();
        System.out.println("This is a Cylinders");
    }
}

public class Practice_Set_10_Q1 {
    public static void main(String[] args) {
        // Create a class Circle2 and use Inheritance to create another class Cylinder2
        // from it.

        Circle2 c1 = new Circle2();
        Cylinders c2 = new Cylinders();

        System.out.println(c1);
        System.out.println(c2);
    }
}
