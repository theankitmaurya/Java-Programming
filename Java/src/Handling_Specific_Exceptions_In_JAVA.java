import java.util.Scanner;

public class Handling_Specific_Exceptions_In_JAVA {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;

        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();

        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();

        try {
            System.out.println("The value of array index entered is: " + marks[ind]);
            System.out.println("The value of array value/number is: " + marks[ind] / number);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred!");
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occurred!");
            System.out.println(e);
        } catch (Exception e) {
            System.out.println("Some Other Exception occurred!");
            System.out.println(e);
        }

/*
        try {
            code
        } catch (IOException e) { -> Handles all exception to type IOExceptions
            code
        } catch (ArithmeticException e) { -> Handles all exception to type ArithmeticException
            code
        } catch (Exception e) { -> Handles all other Exceptions
            code
        }
*/

    }
}
