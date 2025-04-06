
import java.util.Scanner;

public class Practice_Set_5_Q2 {

    public static void main(String[] args) {
//        Write a java program to sum first n even natural numbers using while loop.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int sum = 0;
        int n = sc.nextInt();
        int i = 0;
//        for (int i = 0; i < n; i++) {
//            sum += (2 * i);
//        }
//        System.out.print("Sum of even numbers is: ");
//        System.out.println(sum);
        while (i <= n) {
        sum =+ (2*i);
        i++;
        }
        System.out.println(sum);
    }
}
