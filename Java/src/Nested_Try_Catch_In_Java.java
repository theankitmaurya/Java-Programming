import java.util.Scanner;

public class Nested_Try_Catch_In_Java {
    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index: ");
        int ind = sc.nextInt();

        try {
            System.out.println("Welcome to nested try catch");

            try {
                System.out.println(marks[ind]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Sorry this index does not exist");
                System.out.println("Exception in level 2");
            }
        } catch (Exception e) {
            System.out.println("Exception in level 1");
        }

/*
        try {
            try {
                code
            } catch (Exception e) {
                code
            }
        } catch (Exception e) {
            code
        }
*/
    }
}
