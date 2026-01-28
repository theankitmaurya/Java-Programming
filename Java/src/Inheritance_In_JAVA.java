class Base {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am in Base and setting x now");
        this.x = x;
    }

    public void print() {
        System.out.println("This is a constructor.");
    }
}

class Derived extends Base {
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived and setting y now");
        this.y = y;
    }
}

public class Inheritance_In_JAVA {
    public static void main(String[] args) {

/*
         Inheritance In JAVA-> Inheritance is used to borrow properties and methods from an existing class.
         Declaring Inheritance in JAVA -> Inheritance in JAVA is declared using extends keyword
*/


        Base b = new Base();
        b.setX(4);
        System.out.println("This is getting called from Base Class: " + b.getX());

        Derived d = new Derived();
        d.setY(5);
        System.out.println("This is Derived Class itself: " + d.getY());

        Derived d1 = new Derived();
        d1.setX(4);
        System.out.println("This is getting called from Derived Class: " + d1.getX());


/*
        When a class inherits from a superclass, it inherits parts of superclass methods and fields.
        JAVA doesn't support multiple inheritance, i.e., two classes can be superclass for a subclass.
*/
    }
}
