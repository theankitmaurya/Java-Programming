
import java.util.Scanner;

public class Practice_Set_4_Q6 {

    public static void main(String[] args) {
//        Write a program to find out the type of website from the url
//        .com -> Commercial Website
//        .org -> Organisation Website
//        .in -> Indian Website

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the website url: ");
        String website = sc.nextLine();

        if (website.endsWith(".com")) {
            System.out.println("This is a commercial website.");
        } else if (website.endsWith(".org")) {
            System.out.println("This is an organisation website.");
        } else if (website.endsWith(".in")) {
            System.out.println("This is an Indian Website.");
        }
    }
}
