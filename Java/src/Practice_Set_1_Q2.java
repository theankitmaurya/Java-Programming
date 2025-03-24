import java.util.Scanner;

public class Practice_Set_1_Q2 {
    public static void main(String[] args) {
        // Write a program to calculate CGPA using marks of three numbers (out of 100)

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of 1st Subject: ");
        float subject1 = sc.nextInt();
        System.out.println("Enter the marks of 2nd Subject: ");
        float subject2 = sc.nextInt();
        System.out.println("Enter the marks of 3rd Subject: ");
        float subject3 = sc.nextInt();

        float CGPA = (subject1 + subject2 + subject3) / 30;
        System.out.println("CGPA: " + CGPA);
    }
}
