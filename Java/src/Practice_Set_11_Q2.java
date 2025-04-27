abstract class Pen1 {
    abstract void Write();

    abstract void Refill();
}

class FountainPen extends Pen1 {
    void Write() {
        System.out.println("Write");
    }

    void Refill() {
        System.out.println("Refill");
    }

    void changeNib() {
        System.out.println("Changing the Nib");
    }
}

public class Practice_Set_11_Q2 {
    public static void main(String[] args) {
        // Use the Pen Class from Question 1 to create a concrete class FountainPen with
        // additional method changeNib()
        FountainPen fp = new FountainPen();
        fp.Write();
        fp.Refill();
        fp.changeNib();
    }
}
