package calc;
import java.util.Scanner;

class Calculator {
    public int calculate(int a, int b) {
        return (a + b);
    }
}

class scCalculator {
    public String calculate (int a, int b) {
        return ("sin" + "(" +(a + b) + ")");
    }
}

class hybridCalculator {
    public String calculate (int a, int b) {
        return ("sin" + "(" +(a + b) + ")" + " + 2" + (a + b));
    }
}

public class Practice_Set_12_Q1 {
    public static void main(String[] args) {
//        Create three class Calculator, scCalculator and hybridCalculator1 and group them into a package

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculator c = new Calculator();
        System.out.println(c.calculate(a, b));

        scCalculator cs = new scCalculator();
        System.out.println(cs.calculate(a, b));

        hybridCalculator h = new hybridCalculator();
        System.out.println(h.calculate(a, b));
    }
}
