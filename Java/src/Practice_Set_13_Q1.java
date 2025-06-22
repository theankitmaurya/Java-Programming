class Greet1 extends Thread {
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Good Morning");
            i++;
        }
    }
}

class Greet2 extends Thread {
    public void run() {
        int  i = 0;
        while (i <= 100) {
            System.out.println("Welcome");
            i++;
        }
    }
}

public class Practice_Set_13_Q1 {
    public static void main(String[] args) {
//        Write a program to print "Good Morning" and "Welcome" continuously on the screen in JAVA using threads

        Greet1 g1 = new Greet1();
        Greet2 g2 = new Greet2();

        g1.start();
        g2.start();
    }
}
