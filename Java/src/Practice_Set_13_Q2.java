class Greet3 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Greet4 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            try {
                sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println("Welcome");
            i++;
        }
    }
}

public class Practice_Set_13_Q2 {
    public static void main(String[] args) {
//        Add a sleep method in the welcome thread of Question 1 to delay its execution for 200 ms.

        Greet3 g1 = new Greet3();
        Greet4 g2 = new Greet4();

        g1.start();
        g2.start();
    }
}
