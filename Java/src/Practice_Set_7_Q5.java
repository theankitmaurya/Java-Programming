import java.util.Scanner;

public class Practice_Set_7_Q5 {

    static int FibonacciSeries(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return FibonacciSeries(n - 1) + FibonacciSeries(n - 2);
        }
    }

    static int Fibonacci(int n) {
        if (n == 1 || n == 2) {
            return n - 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        // Write a function to print nth term of fibonacci series using recursion

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index number: ");
        int n = sc.nextInt();

        System.out.println("Value at the given index: " + FibonacciSeries(n));
        System.out.println("Value at the given index: " + Fibonacci(n));
    }
}
