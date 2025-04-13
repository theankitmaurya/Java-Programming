class Rectangle {
    int length = 4;
    int breadth = 2;

    public int area() {
        return (length * breadth);
    }

    public int perimeter() {
        return (2 * (length + breadth));
    }
}

public class Practice_Set_8_Q4 {
    public static void main(String[] args) {
        // Create a class Rectangle and repeat Question 3

        Rectangle r = new Rectangle();

        System.out.println("Area of the rectangle is: " + r.area());
        System.out.println("Circumference of the rectangle is: " + r.perimeter());
    }
}
