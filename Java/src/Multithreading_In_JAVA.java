class Thread1 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread1 is running...");
            System.out.println("Thread1 is happy!");
            i++;
        }
    }
}

class Thread2 extends Thread{
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Thread2 is running...");
            System.out.println("Thread2 is happy!");
            i++;
        }
    }
}

public class Multithreading_In_JAVA {
    public static void main(String[] args) {
/*
        Multiprocessing and Multithreading both are used to achieve multitasking
        In a nutshell ->
        (1) Threads used shared memory area
        (2) Threads -> Faster content switching
        (3) A thread is light-weighted whereas a process is heavy-weighted
*/

/*
        Flow of control in JAVA ->
        (1) Without Threading -
        main() -> func1() -> func2() -> END
        (2) With Threading -
        main() -------------|
        func1() ---------- END
        func2() ------------|
*/


/*
        Creating a Thread ->
        There are two ways to create a thread in Java -
        (1) - By extending thread class
        (2) - By implementing runnable interface
*/

        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        t1.start();
        t2.start();
    }
}
