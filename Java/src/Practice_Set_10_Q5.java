class Base2 {

    Base2() {
        System.out.println("Base 2");
    }

}

class Derived2 extends Base2 {

    Derived2() {
        System.out.println("Derived 2");
    }

}

class Derived3 extends Base2 {

    Derived3() {
        System.out.println("Derived 3");
    }

}

public class Practice_Set_10_Q5 {
    public static void main(String[] args) {

        /*
         * What is the order of constructor execution of the following inheritance
         * hierarchy:
         * Base -> Derived1 -> Derived2
         * 
         * Derived2 obj = new Derived 2();
         * Which constructor will be executed and in what order?
         */

        Derived3 obj = new Derived3();
        System.out.println(obj);
    }
}
