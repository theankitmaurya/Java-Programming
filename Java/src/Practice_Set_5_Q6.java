
import java.util.Scanner;

public class Practice_Set_5_Q6 {

    public static void main(String[] args) {
//        Repeat Question No 5 using while loop

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no: ");
        int n = sc.nextInt();

        int i = 1;
        int factorial = 1;

        while (i <= n) {
            factorial *= i;
            i++;
        }
        System.out.println(factorial);
    }
}
