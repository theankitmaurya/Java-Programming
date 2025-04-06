
public class Practice_Set_5_Q9 {

    public static void main(String[] args) {
//        Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.

        int n = 8;
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            int product = n * i;
            sum += product;
            System.out.printf("%d X %d = %d | %d\n", n, i, product, sum);
        }
    }
}
