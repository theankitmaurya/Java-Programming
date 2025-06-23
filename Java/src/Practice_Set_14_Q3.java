import java.util.Scanner;

public class Practice_Set_14_Q3 {
    public static void main(String[] args) {
//        Write a java program that allows you to keep accessing an array until a valid index is given. If max retries exceed 5 print "Error"

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
            System.out.println("Error");
        }
    }
}
