import java.util.Scanner;

public class Practice_Set_1_Q4 {
    public static void main(String[] args) {
        // Write a Java program to convert kilometers to miles
        Scanner sc = new Scanner(System.in);

        double constant = 0.621371;

        System.out.println("Enter the value in kilometers: ");
        double km = sc.nextDouble();
        double miles = km * constant;

        System.out.println("Miles: " + miles);
    }
}
