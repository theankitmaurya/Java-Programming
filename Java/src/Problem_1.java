
import java.util.Scanner;

public class Problem_1 {

    public static void main(String[] args) {
        // Write a program to calculate percentage of a given student in CBSE Board Exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100).

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter Your Marks of Subject 1: ");
        float marks1 = sc.nextFloat();
        System.out.println("Enter Your Marks of Subject 2: ");
        float marks2 = sc.nextFloat();
        System.out.println("Enter Your Marks of Subject 3: ");
        float marks3 = sc.nextFloat();
        System.out.println("Enter Your Marks of Subject 4: ");
        float marks4 = sc.nextFloat();
        System.out.println("Enter Your Marks of Subject 5: ");
        float marks5 = sc.nextFloat();

        float total_marks = marks1 + marks2 + marks3 + marks4 + marks5;

        float percentage = total_marks / 5;
        System.out.println(
                firstName + ", your total marks are: " + total_marks + " and your percentage is: " + percentage + "%");
    }
}
