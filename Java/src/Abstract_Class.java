abstract class Parent {
    abstract public void Greet();

    public Parent() {
        System.out.println("Parent");
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}

class Child extends Parent {
    @Override
    public void Greet() {
        System.out.println("Good Morning");
    }

    public Child() {
        System.out.println("Child");
    }
}

abstract class grandChild extends Child {
    @Override
    public void Greet() {
        System.out.println("Good Evening");
    }

    public grandChild() {
        System.out.println("GrandChild");
    }
}

public class Abstract_Class {
    public static void main(String[] args) {
        /*
         * Abstract Method -> A method that is declared without an implementation
         * abstract void moveTo(doubleX, doubleY)
         * 
         * Abstract Class -> If a class includes abstract methods, then the class itself
         * must be declared abstract, as in:
         * 
         */
        // Parent p = new Parent(); // throws error
        Child c = new Child();
        System.out.println(c);

        // grandChild gc = new grandChild(); // throws error

        /*
         * When an abstract class is subclassed, the subclass usually provides
         * implementations for all the methods in the parent class. If it doesn't, it
         * must be declared abstract
         */

    }
}
