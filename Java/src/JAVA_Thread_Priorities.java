class Thr1 extends Thread {
    public Thr1(String name) {
        super(name);
    }

    @Override
    public void run() {
        while (true) {
            System.out.println("My name: " + getName());
        }
    }
}

public class JAVA_Thread_Priorities {
    public static void main(String[] args) {
        Thr1 obj1 = new Thr1("Ankit (MI)");
        obj1.start();
        obj1.setPriority(Thr1.MAX_PRIORITY);
        Thr1 obj2 = new Thr1("Shubham");
        obj2.start();
        obj2.setPriority(Thr1.MIN_PRIORITY);
        Thr1 obj3 = new Thr1("Devansh");
        obj3.start();
        obj3.setPriority(Thr1.MIN_PRIORITY);
        Thr1 obj4 = new Thr1("Vedant");
        obj4.start();
        obj4.setPriority(Thr1.MIN_PRIORITY);
        Thr1 obj5 = new Thr1("Anurag");
        obj5.start();
        obj5.setPriority(Thr1.MIN_PRIORITY);
    }
}
