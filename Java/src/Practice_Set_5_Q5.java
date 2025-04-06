
import java.util.Scanner;

public class Practice_Set_5_Q5 {

    public static void main(String[] args) {
//        Write a Java program to find factorial of a given number using for loops.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            long factorial = 1;

            // Using for loop to compute factorial
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of: " + n + " is: " + factorial);
        }
    }
}
