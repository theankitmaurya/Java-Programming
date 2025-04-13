class TommyVercetti {

    public void running() {
        System.out.println("Running...");
    }

    public void hitting() {
        System.out.println("Hitting...");
    }

    public void firing() {
        System.out.println("Firing...");
    }
}

public class Practice_Set_8_Q5 {
    public static void main(String[] args) {
        // Create a class TommyVercetti for Rockstar Games capable of hitting(print
        // hitting...), running, firing etc.

        TommyVercetti tv = new TommyVercetti();

        tv.running();
        tv.hitting();
        tv.firing();
    }
}
