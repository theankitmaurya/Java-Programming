
import java.util.Scanner;

public class Practice_Set_1_Q5 {

    public static void main(String[] args) {
        // Write a Java program to detect whether a number entered by the user is integer or not.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        System.out.println(sc.hasNextInt());
    }
}
