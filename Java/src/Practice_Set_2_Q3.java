import java.util.Scanner;

public class Practice_Set_2_Q3 {
    public static void main(String[] args) {
//        Use comparison operators to find out whether a given number is greater than the user entered number or not.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int a = 10;
        int b = sc.nextInt();

        System.out.println(b > a);

        sc.close();
    }
}
