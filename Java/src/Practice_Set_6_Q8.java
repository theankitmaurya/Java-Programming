
public class Practice_Set_6_Q8 {

    public static void main(String[] args) {
//        Write a JAVA Program to find whether an array is sorted or not

        boolean isSorted = true;
        int[] arr = {1, 4, 8, 3, 5, 4};

        for (int i = 0; i < arr.length - 1; i++) {
            isSorted = false;
            break;
        }
        if (isSorted) {
            System.out.println("The array is sorted");
        } else {
            System.out.println("The array is not sorted");
        }
    }
}
