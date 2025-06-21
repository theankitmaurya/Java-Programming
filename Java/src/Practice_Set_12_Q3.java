package folder.folderL1.folderL2;
import java.util.Scanner;

class Calculator1 {
    public int calculate(int a, int b) {
        return (a + b);
    }
}

class scCalculator1 {
    public String calculate(int a, int b) {
        return ("sin" + "(" + (a + b) + ")");
    }
}

class hybridCalculator1 {
    public String calculate(int a, int b) {
        return ("sin" + "(" + (a + b) + ")" + " + 2" + (a + b));
    }
}

public class Practice_Set_12_Q3 {
    public static void main(String[] args) {
//        Create a package in class with three package level folders, folderL1, folderL2

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator1 c = new Calculator1();
        System.out.println(c.calculate(a, b));

        scCalculator1 cs = new scCalculator1();
        System.out.println(cs.calculate(a, b));

        hybridCalculator1 h = new hybridCalculator1();
        System.out.println(h.calculate(a, b));
    }
}
