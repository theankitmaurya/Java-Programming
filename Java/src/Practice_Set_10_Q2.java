class Rectangle2 {
    public Rectangle2() {
        System.out.println("Inside Rectangle4");
    }
}

class Cuboid extends Rectangle2 {
    public Cuboid() {
        System.out.println("Inside Cuboid");
    }
}

public class Practice_Set_10_Q2 {
    public static void main(String[] args) {
        // Create a class Rectangle4 and use inheritance to create another class Cuboid.
        // Try to keep it as close to a real world scenario as possible.
        Rectangle2 r = new Rectangle2();
        Cuboid c = new Cuboid();

        System.out.println(r);
        System.out.println(c);

    }
}
