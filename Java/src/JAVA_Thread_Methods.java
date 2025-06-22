class MyNewThr1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyNewThr1");
            try {
                sleep(455);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class MyNewThr2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("MyNewThr2");
        }
    }
}

public class JAVA_Thread_Methods {
    public static void main(String[] args) {
        MyNewThr1 obj1 = new MyNewThr1();
        MyNewThr2 obj2 = new MyNewThr2();

        obj1.start();
        try {
            obj1.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        obj2.start();
    }
}
