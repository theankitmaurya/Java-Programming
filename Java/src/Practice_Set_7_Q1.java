import java.util.Scanner;

public class Practice_Set_7_Q1 {

    static void MultiplicationTable() {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.format("%d X %d = %d\n", n, i, n * i);
        }
    }

    public static void main(String[] args) {
        // Write a JAVA Program to print multiplication table of a number n
        MultiplicationTable();
    }
}
