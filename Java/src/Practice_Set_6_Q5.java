
public class Practice_Set_6_Q5 {

    public static void main(String[] args) {
//        Write a JAVA Program to reverse an array

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int l = arr.length;
        int n = Math.floorDiv(l, 2);
        int temp;

        for (int i = 0; i < n; i++) {
            temp = arr[i];
            arr[i] = arr[l - i - 1];
            arr[l - i - 1] = temp;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
