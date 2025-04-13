class circle {
    float pi = 3.14F;
    float radius = 3.0F;

    public float Area() {
        return (pi * radius * radius);
    }

    public float Circumference() {
        return (2 * pi * radius);
    }
}

public class Practice_Set_8_Q6 {
    public static void main(String[] args) {
        // Repeat 4 for circle

        circle cr = new circle();

        System.out.println("Area of circle: " + cr.Area());
        System.out.println("Circumference of circle: " + cr.Circumference());
    }
}
