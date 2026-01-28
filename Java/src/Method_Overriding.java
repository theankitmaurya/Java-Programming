class A {
    public int a;

    public int four() {
        return 4;
    }

    public void meth1() {
        System.out.println("I am meth1 of class A");
    }

}

class B extends A {

    @Override
    public void meth1() {
        System.out.println("I am meth1 of class B");
    }

    public void meth2() {
        System.out.println("I am meth2 of class B");
    }

}

public class Method_Overriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth1();

        B b = new B();
        b.meth1();

/*
        Method Overriding ->If the child class implements the same method present in the parent class again,it is known as method overriding.
        When an object of a subclass is created and the override method is called, the method which has been implemented in the subclass is called and its code is executed.
*/

    }
}
