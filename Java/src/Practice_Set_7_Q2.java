import java.util.Scanner;

public class Practice_Set_7_Q2 {

    static void Pattern1() {

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Write a program using functions to print the following pattern:
        // *
        // * *
        // * * *
        // * * * *
        Pattern1();
    }
}
