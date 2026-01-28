class Base1 {

    Base1() {
        System.out.println("I am a Base class constructor");
    }

    Base1(int x) {
        System.out.println("I am a overloaded Base class constructor with value of x as: " + x);
    }

}

class Derived1 extends Base1 {

    Derived1() {
        super(0);
        System.out.println("I am a Derived class constructor");
    }

    Derived1(int x, int y) {
        super(x);
        System.out.println("I am a overloaded Derived class constructor with value of y as: " + y);
    }

}

class superDerived extends Derived1 {
    superDerived() {
        System.out.println("I am a super derived class constructor");
    }

    superDerived(int x, int y, int z) {
        super(x, y);
        System.out.println("I am a super derived class constructor with value of z as: " + z);
    }

}

public class Constructors_In_Inheritance_In_JAVA {
    public static void main(String[] args) {
        Base1 b1 = new Base1();
        Derived1 d1 = new Derived1();
        Derived1 d2 = new Derived1(12, 14);
        superDerived sd1 = new superDerived(34, 45, 56);

/*
        Constructors In Inheritance -> When a derived class is extended from the Base class, the constructor of the Base class is executed first followed by the constructor of the Derived class. Constructors execute in top to bottom order
*/

/*
        Constructors during constructors overloading -> When there are multiple constructors in the parent class, the constructors without any parameter are called from the child class. If we want to call the constructor with parameters from the parent class, we will use super keyword.
        super (a, b);
*/
    }
}
