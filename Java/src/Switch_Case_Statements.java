
import java.util.Scanner;

public class Switch_Case_Statements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

//        1st Method ->
        switch (age) {
            case 18:
                System.out.println("You are 18 years old now. But firstly complete your graduation.");
                break;
            case 23:
                System.out.println("You are 23 years old now. You can join a company now.");
                break;
            case 60:
                System.out.println("Now you can take retirement.");
                break;
            default:
                System.out.println("Enjoy your life");
        }

//        2nd Method ->
        switch (age) {
            case 18 ->
                System.out.println("You are 18 years old now. But firstly complete your graduation.");
            case 23 ->
                System.out.println("You are 23 years old now. You can join a company now.");
            case 60 ->
                System.out.println("Now you can take retirement.");
            default ->
                System.out.println("Enjoy your life");
        }
    }
}
