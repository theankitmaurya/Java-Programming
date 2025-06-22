class MyRunnableThread1 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread 1 is running not Threat 1");
            i++;
        }
    }
}

class MyRunnableThread2 implements Runnable {
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread 2 is running not Threat 2");
            i++;
        }
    }
}

public class Creating_A_JAVA_Thread_Using_Runnable_Interface {
    public static void main(String[] args) {
        MyRunnableThread1 m1 = new MyRunnableThread1();
        Thread t1 = new Thread(m1);

        MyRunnableThread2 m2 = new MyRunnableThread2();
        Thread t2 = new Thread(m2);

        t1.start();
        t2.start();
    }
}
