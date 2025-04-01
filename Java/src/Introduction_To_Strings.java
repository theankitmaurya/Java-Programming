
import java.util.Scanner;

public class Introduction_To_Strings {

    public static void main(String[] args) {
        String name1 = new String("Ankit");
        String name2 = "Ankit";
        System.out.println(name1);
        System.out.println(name2);

//        Print Statement in Java ->
        int a = 5;
        float b = 5.0F;
        System.out.println(a + b);
        System.out.print(a + b);
        System.out.printf("The value of a is %d and b is %.1f", a, b);
        System.out.format("The value of a is %d and b is %.1f", a, b);
//
        Scanner sc = new Scanner(System.in);

//        sc.next() -> This will only print the initial statement of the string and can't print whitespace
        String st1 = sc.next();
        System.out.println(st1);

//        sc.nextLine() -> This will print the initial statement and also print the whitespace means the whole statement
        String st2 = sc.nextLine();
        System.out.println(st2);
    }
}
