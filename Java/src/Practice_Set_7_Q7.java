import java.util.Scanner;

public class Practice_Set_7_Q7 {

    static void Pattern3(int n) {

        if (n == 0) {
            return;
        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        Pattern3(n - 1);
    }

    public static void main(String[] args) {
        // Repeat Question 4 using Recursion

        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Pattern3(n);
    }
}
