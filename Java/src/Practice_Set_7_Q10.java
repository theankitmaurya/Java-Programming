import java.util.Scanner;

public class Practice_Set_7_Q10 {

    static int sumUsingIteration(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Repeat Question 3 using iterative approach

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        System.out.println(sumUsingIteration(n));
    }
}
