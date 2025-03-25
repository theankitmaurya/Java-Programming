
import java.util.Scanner;

public class Practice_Set_1_Q3 {

    public static void main(String[] args) {
        // Write a Java program which asks the user to enter his/her name and greets them with "Hello <name>, have a good day" text.

        Scanner sc = new Scanner(System.in);

        System.out.println("Hello there! What's your name? ");
        String name = sc.nextLine();

        System.out.println("Hello " + name + ", have a good day!");
    }
}
