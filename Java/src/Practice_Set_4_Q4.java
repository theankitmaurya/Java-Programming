
import java.util.Scanner;

public class Practice_Set_4_Q4 {

    public static void main(String[] args) {
//        Write a Java program to find out the day of the week given the number [1 for Monday, 2 for Tuesday, ... , and so On.]

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day: ");
        int week = sc.nextInt();
        switch (week) {
            case 1 ->
                System.out.println("Today is Monday.");
            case 2 ->
                System.out.println("Today is Tuesday.");
            case 3 ->
                System.out.println("Today is Wednesday.");
            case 4 ->
                System.out.println("Today is Thursday.");
            case 5 ->
                System.out.println("Today is Friday.");
            case 6 ->
                System.out.println("Today is Saturday.");
            case 7 ->
                System.out.println("Today is Sunday.");
            default ->
                System.out.println("Invalid Number. Please Enter a valid number.");
        }
    }
}
