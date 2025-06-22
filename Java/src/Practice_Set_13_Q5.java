class Greet9 extends Thread {
    @Override
    public void run() {
        System.out.println("Good Morning");
    }
}

class Greet10 extends Thread {
    @Override
    public void run() {
        System.out.println("Welcome");
    }
}

public class Practice_Set_13_Q5 {
    public static void main(String[] args) {
//        How do you get reference to the current thread in JAVA?

        Greet9 g1 = new Greet9();
        Greet10 g2 = new Greet10();

        System.out.println(g1.getState());
        g1.start();
        System.out.println(g1.getState());
        System.out.println(Thread.currentThread().getState());

    }
}
