class Calculator3 {
    public int calculate(int a, int b) {
        return (a + b);
    }
}

class scCalculator3 {
    public String calculate (int a, int b) {
        return ("sin" + "(" +(a + b) + ")");
    }
}

class hybridCalculator3 {
    public String calculate (int a, int b) {
        return ("sin" + "(" +(a + b) + ")" + " + 2" + (a + b));
    }
}

public class Extension {

    protected int proInt = 4;
    int defInt = 14;

    public static void main(String[] args) {
        System.out.println("I am main method");
    }
}
