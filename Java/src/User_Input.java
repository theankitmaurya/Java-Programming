import java.util.Scanner;

public class User_Input {
    public static void main(String[] args) {
        System.out.println("Taking input from user: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = sc.nextInt();
        System.out.println("Enter number 2: ");
        int b = sc.nextInt();

        int sum = a + b;
        System.out.println("The sum of the numbers is: " + sum);

        // To check whether an entered number is an integer / float, then we use the below statement
        // hasNextInt(); / hasNextByte();
        System.out.println(sc.hasNextInt());
    }
}
