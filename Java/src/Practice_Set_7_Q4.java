import java.util.Scanner;

public class Practice_Set_7_Q4 {

    static void Pattern2() {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write a program using functions to print the following pattern:
        // * * * *
        // * * *
        // * *
        // *

        Pattern2();
    }
}
