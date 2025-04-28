class Class1 {
    int a;

    public int getA() {
        return a;
    }

    Class1(int a) {
        this.a = a;
    }

    public int return1() {
        return 1;
    }
}

class Class2 extends Class1 {

    Class2(int b) {
        super(b);
        System.out.println("I am a constructor.");
    }
}

public class This_And_Super_Keyword {
    public static void main(String[] args) {
        Class1 c1 = new Class1(5);
        System.out.println(c1.getA());

        Class2 c2 = new Class2(4);
        System.out.println(c2.getA());

        /*
         * This Keyword -> This is a way for us to reference on an object of the class which is being created/referenced
         * Super Keyword -> A reference variable used to refer an immediate parent class object
         * (1) Can be used to refer immediate parent class instance variable
         * (2) Can be used to invoke parent class methods
         * (3) Can be used to invoke parent class constructors
         */
    }
}
