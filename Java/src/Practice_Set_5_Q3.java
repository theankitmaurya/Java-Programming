
import java.util.Scanner;

public class Practice_Set_5_Q3 {

    public static void main(String[] args) {
//        Write a java program to print multiplication table of a given number n.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number for which you want to get the table: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }
}
