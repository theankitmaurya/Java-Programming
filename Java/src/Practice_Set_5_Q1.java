
public class Practice_Set_5_Q1 {

    public static void main(String[] args) {
//        Write a program to print the following pattern:
//        * * * *
//        * * *
//        * *
//        *

        int n = 4;
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.print("\n");
        }
    
    }
}
