interface Cycle {
    int a = 45;

    void applyBrake(int increment);

    void speedUp(int decrement);
}

interface BlowHorn {
    void blowHorn1();

    void blowHorn2();
}

class AvonCycle1 implements Cycle {

    void BlowHorn() {
        System.out.println("Please");
    }

    @Override
    public void applyBrake(int increment) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int decrement) {
        System.out.println("Speeding Up");
    }
}

class AvonCycle2 implements Cycle, BlowHorn {
    @Override
    public void applyBrake(int increment) {
        System.out.println("Applying Brake");
    }

    @Override
    public void speedUp(int decrement) {
        System.out.println("Speeding Up");
    }

    public void blowHorn1() {
        System.out.println("Horn1");
    }

    public void blowHorn2() {
        System.out.println("Horn2");
    }
}

public class Abstract_Class_VS_Interfaces {
    public static void main(String[] args) {
        AvonCycle1 cycle = new AvonCycle1();
        cycle.applyBrake(1);
        System.out.println(cycle.a);

        AvonCycle2 cycle2 = new AvonCycle2();
        cycle2.blowHorn1();
        cycle2.blowHorn2();

/*
        Abstract Class -> We have to only override those methods which have abstract keyword with them.
        It is necessary to override the abstract method in child class, but it is not necessary to implement rest other methods which haven't abstract keyword with them.

        Interface Class-> We have to override all the methods in the child class otherwise the child class will show that Class must either be declared abstract or implement abstract method.
        So we have to implement all the methods declared of the interface class in the child class.
*/
    }
}
