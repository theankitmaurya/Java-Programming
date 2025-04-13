
import java.util.Scanner;

class Rectangle1 {

    private int length;
    private int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Breadth: " + breadth + "]";
    }
}

public class Practice_Set_9_Q4 {

    public static void main(String[] args) {
//        Overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle: ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle: ");
        int breadth = sc.nextInt();

        Rectangle1 rectangle1 = new Rectangle1(length, breadth);
        System.out.println(rectangle1);

        Rectangle1 rectangle2 = new Rectangle1();
        System.out.println(rectangle2);
    }
}
