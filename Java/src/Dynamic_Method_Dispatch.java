class Phone {
    public void Greet() {
        System.out.println("Good Morning!");
    }

    public void On() {
        System.out.println("Turning On Phone...");
    }
}

class SmartPhone extends Phone {
    public void Welcome() {
        System.out.println("Your Welcome");
    }

    @Override
    public void On() {
        System.out.println("Turning On SmartPhone...");
    }
}

public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {

        Phone obj1 = new Phone();
        obj1.On();

        SmartPhone obj2 = new SmartPhone();
        obj2.On();

        Phone obj3 = new SmartPhone(); // Allowed
        // SmartPhone obj3 = new Phone(); // Not Allowed

        obj3.On();
        obj3.Greet();
    }
}
