class Greet7 extends Thread {
    @Override
    public void run() {
        System.out.println("Good Morning");
    }
}

class Greet8 extends Thread {
    @Override
    public void run() {
        System.out.println("Welcome");
    }
}

public class Practice_Set_13_Q4 {
    public static void main(String[] args) {
//        How do you get the state of a given thread in JAVA?

        Greet7 g1 = new Greet7();
        Greet8 g2 = new Greet8();

        System.out.println(g1.getState());
        g1.start();
        System.out.println(g1.getState());

        System.out.println(g2.getState());
        g2.start();
        System.out.println(g2.getState());

    }
}
