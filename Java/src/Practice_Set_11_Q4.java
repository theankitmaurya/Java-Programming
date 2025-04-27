abstract class Telephone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartTelephone extends Telephone {
    @Override
    void ring() {
        System.out.println("Ringing...");
    }

    @Override
    void lift() {
        System.out.println("Lifting...");
    }

    @Override
    void disconnect() {
        System.out.println("Disconnecting...");
    }
}

public class Practice_Set_11_Q4 {
    public static void main(String[] args) {
        // Create a class Telephone with ring(), lift() and disconnect() methods as
        // abstract methods. Create another class SmartTelephone and demonstrate
        // polymorphism.
        Telephone obj = new SmartTelephone();
        obj.ring();
        obj.lift();
        obj.disconnect();
    }
}
