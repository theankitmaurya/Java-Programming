
public class Practice_Set_5_Q7 {

    public static void main(String[] args) {
//        Repeat 1 using for/while loop
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
