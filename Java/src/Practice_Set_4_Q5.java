
import java.util.Scanner;

public class Practice_Set_4_Q5 {

    public static void main(String[] args) {
//        Write a Java program to find whether a year entered by the user is a leap year or not.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeap) {
            System.out.println("This is a leap year.");
        } else {
            System.out.println("This is not a leap year.");
        }
    }
}
