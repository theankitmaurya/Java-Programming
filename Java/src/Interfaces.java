interface Bicycle {
    void applyBrake(int decrement);

    void speedUp(int increment);
}

class BajajCycle implements Bicycle {
    int speed = 7;

    @Override
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }
}

public class Interfaces {
    public static void main(String[] args) {

        BajajCycle cycle = new BajajCycle();
        System.out.println("Initial Speed: " + cycle.speed);

        cycle.speedUp(10);
        System.out.println("After Speed Up: " + cycle.speed);

        cycle.applyBrake(5);
        System.out.println("After Brake: " + cycle.speed);

    }
}
