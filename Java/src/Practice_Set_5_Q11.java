
import java.util.Scanner;

public class Practice_Set_5_Q11 {

    public static void main(String[] args) {
//        Repeat Problem 2 using for loop

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int sum = 0;
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum += (2 * i);
        }
        System.out.print("Sum of even numbers is: ");
        System.out.println(sum);
    }
}
