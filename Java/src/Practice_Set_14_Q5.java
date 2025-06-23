import java.util.Scanner;

class TheException1 extends Exception {
    public TheException1() {
        super("Error! This is a very crucial exception!");
    }
}

public class Practice_Set_14_Q5 {

    public static void main(String[] args) {
        try {
            accessArray();  // Call the method that can throw the exception
        } catch (TheException1 e) {
            System.out.println(e.getMessage());
        }
    }

    // This method contains the retry logic and throws the custom exception
    public static void accessArray() throws TheException1 {
        boolean flag = true;
        int[] marks = {7, 56, 6};  // Cleaner initialization
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;

        System.out.println("Enter the index of the array (max 5 retries):");

        while (flag && i < 5) {
            try {
                index = sc.nextInt();
                System.out.println("The value of marks[" + index + "] is " + marks[index]);
                flag = false; // Exit after success
            } catch (Exception e) {
                System.out.println("Invalid index. Try again.");
                i++;
            }
        }

        if (i >= 5) {
            throw new TheException1();  // Let the caller handle the exception
        }
    }
}
