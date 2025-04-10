
public class Practice_Set_6_Q6 {

    public static void main(String[] args) {
//        Write a JAVA Program to find the maximum element in an array

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int max = Integer.MIN_VALUE;
        for (int element : arr) {
            if (element > max) {
                max = element;
            }
        }
        System.out.println("The maximum value in the array is: " + max);
    }
}
