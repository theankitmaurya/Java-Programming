
import java.util.Scanner;

public class Practice_Set_1_Q1 {

    public static void main(String[] args) {
        // Write a program to sum three numbers in Java.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = sc.nextInt();

        int sum = num1 + num2 + num3;
        System.out.println("Sum of these numbers: " + sum);
    }
}
