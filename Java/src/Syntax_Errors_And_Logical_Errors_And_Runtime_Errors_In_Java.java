import java.util.Scanner;

public class Syntax_Errors_And_Logical_Errors_And_Runtime_Errors_In_Java {
    public static void main(String[] args) {
/*
        SYNTAX ERROR DEMO
        int a = 0 -> Error: No selection
        b = 8; Error: b is not declared!
*/

/*
        LOGICAL ERROR DEMO
        System.out.println(2);
        for (int i = 1; i < 5; i++) {
            System.out.println(2 * i + 1);
        }
        This is the program for printing prime numbers from 1 to 10, but this will contain 2 3 5 7 9. And 9 is not a prime number, so there is a logical error in the program
*/

/*
        RUNTIME ERROR DEMO
        int k;
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        System.out.println("Integer part of 1000 divided by k is " + (1000 / k));
        This will throw a Runtime Exception if a user enters '0' for dividing 1000
*/
    }
}
