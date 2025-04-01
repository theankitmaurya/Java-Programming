
import java.util.Scanner;

public class Practice_Set_4_Q3 {

    public static void main(String[] args) {
//        Calculate income tax paid by an employee to the government as per the slabs mentioned below:
//        Income Slab       Tax
//        2.5L - 5.0L       5%
//        5.0L - 10.0L      20%
//        Above 10.0L       30%
//        Note that there is no tax below 2.5L. take input amount as an input from the user.

        Scanner sc = new Scanner(System.in);

        float tax = 0;
        System.out.println("Enter your income in Lakhs per annum: ");
        float income = sc.nextFloat();

        if (income <= 2.5F) {
            tax = tax + 0;
        }

        if (income > 2.5F && income <= 5.0F) {
            tax = tax + 0.05F * (income - 2.5F);
        } else if (income > 5.0F && income <= 10.0F) {
            tax = tax + 0.05F * (5.0F - 2.5F);
            tax = tax + 0.20F * (income - 5.0F);
        } else if (income > 10.0F) {
            tax = tax + 0.05F * (5.0F - 2.5F);
            tax = tax + 0.20F * (10.0F - 5.0F);
            tax = tax + 0.30F * (income - 10.0F);
        }
        System.out.println("Tax paid by the person is: " + tax);
    }
}
