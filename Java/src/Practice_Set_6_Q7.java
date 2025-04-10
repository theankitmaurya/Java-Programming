
public class Practice_Set_6_Q7 {

    public static void main(String[] args) {
//        Write a JAVA Program to find the minimum element in a JAVA array.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int min = Integer.MAX_VALUE;
        for (int element : arr) {
            if (element < min) {
                min = element;
            }
        }
        System.out.println("The minimum value in the array is: " + min);
    }
}
