class Greet5 extends Thread {
    @Override
    public void run() {
        System.out.println("Good Morning");
    }
}

class Greet6 extends Thread {
    @Override
    public void run() {
        System.out.println("Welcome");
    }
}

public class Practice_Set_13_Q3 {
    public static void main(String[] args) {
//        Demonstrate getPriority() and setPriority() methods in JAVA threads

        Greet5 g1 = new Greet5();
        Greet6 g2 = new Greet6();

        g1.setPriority(3);
        g2.setPriority(7);

        System.out.println(g1.getPriority());
        System.out.println(g2.getPriority());
    }
}
