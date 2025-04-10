
public class Practice_Set_6_Q2 {

    public static void main(String[] args) {
//        Write a program to find out whether a given integer is present in an array or not.

        int[] age = {10, 15, 20, 25};

        int num = 15;
        boolean isInArray = false;

        for (int element : age) {
            if (num == element) {
                isInArray = true;
                break;
            }
        }
        if (isInArray) {
            System.out.printf("%d is present in the array", num);
        } else {
            System.out.printf("%d is not present in the array", num);
        }
    }
}
