class MyThr extends Thread {
    public MyThr(String name) {
        super(name);
    }

    public void run() {
        System.out.println("This is MyThr thread");
    }
}

public class Constructors_From_Thread_In_JAVA {
    public static void main(String[] args) {
        MyThr obj = new MyThr("Ankit");
        obj.start();
        System.out.println(obj.getName());
        System.out.println(obj.threadId());
    }
}
