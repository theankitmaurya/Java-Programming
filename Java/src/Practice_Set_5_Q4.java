import java.util.Scanner;

public class Practice_Set_5_Q4 {
    public static void main(String[] args) {
//        Write a java program to print multiplication table in reverse order.


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no for which you want to generate the table: ");
        int n = sc.nextInt();

        for (int i = 10; i >= 1; i--) {
            System.out.printf("%d X %d = %d\n", n, i, (n * i));
        }
    }
}
