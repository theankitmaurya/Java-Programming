import java.util.Scanner;

class TheException extends Exception {
    public TheException() {
        super("Error! This is a very crucial exception!");
    }
}

public class Practice_Set_14_Q4 {
    public static void main(String[] args) {
//        Modify program in Question 3 to throw a custom exception if max retries are reached

        boolean flag = true;
        int[] marks = new int[3];

        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of index: ");
        int index;
        int i = 0;

        while (flag && i < 5) {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            } catch (Exception e) {
                System.out.println("Invalid index");
                i++;
            }
        }

        if (i >= 5) {
            try {
            throw new TheException();
            } catch (TheException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
