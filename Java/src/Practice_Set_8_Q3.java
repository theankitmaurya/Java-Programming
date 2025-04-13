import java.util.Scanner;

class square {
    public void dimensions() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int n = sc.nextInt();

        System.out.printf("Area of square with given side %d is: %d", n, n * n);
        System.out.println();
        System.out.printf("Circumference of square of given side %d is: %d", n, 4 * n);
    }
}

public class Practice_Set_8_Q3 {
    public static void main(String[] args) {
        // Create a class square with a method to initialize its side, calculating area,
        // perimeter, etc.

        square sq = new square();
        sq.dimensions();
    }
}
