public class Recursion {

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    static int factorial_iterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int product = 1;
            for (int i = 1; i <= n; i++) {
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int  n = 5;

//        Using Function Recursion
        System.out.println("Factorial of x is: " + factorial(n));

//        Using Function Iteration
        System.out.println("Factorial of y is: " + factorial_iterative(n));
    }
}
