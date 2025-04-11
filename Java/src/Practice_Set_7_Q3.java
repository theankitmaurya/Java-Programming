import java.util.Scanner;

public class Practice_Set_7_Q3 {

    static int SumReturn(int n) {

        if (n == 1) {
            return 1;
        }
        return (n + SumReturn(n - 1));
    }

    public static void main(String[] args) {

        // Write a recursive function to calculate sum of first n natural numbers
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);

        int n1 = sc.nextInt();

        System.out.printf("Sum of first %d natural numbers are: %d", n1, SumReturn(n1));

    }
}
