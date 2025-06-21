import java.util.Scanner;

public class Practice_Set_12_Q2 {
    public static void main(String[] args) {
//        Use a built-in package in java to write a class which displays a message (by using System.out.println) after taking input from the user.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your message: ");
        String a = sc.nextLine();
        System.out.println("Entered Message: " + a);
        sc.close();
    }
}
