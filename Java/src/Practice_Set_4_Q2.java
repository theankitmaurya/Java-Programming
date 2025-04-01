
import java.util.Scanner;

public class Practice_Set_4_Q2 {

    public static void main(String[] args) {
//        Write a program to find out whether a student is pass or fail; if it requires total 40% and at least 33% in each subject to pass. Assume 3 subjects and take marks as an input from the user.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of 1st subject: ");
        byte subject1 = sc.nextByte();
        System.out.println("Enter number of 2nd subject: ");
        byte subject2 = sc.nextByte();
        System.out.println("Enter number of 3rd subject: ");
        byte subject3 = sc.nextByte();

        float total_percentage = (subject1 + subject2 + subject3) / 3.0F;
        System.out.println("Percentage: " + total_percentage);

        if (total_percentage > 40 && subject1 > 33 && subject2 > 33 && subject3 > 33) {
            System.out.println("You are passed.");
        } else {
            System.out.println("You are not passed.");
        }
    }
}
