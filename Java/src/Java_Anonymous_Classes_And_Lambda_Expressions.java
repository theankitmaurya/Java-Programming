interface Lambda1 {
    void meth1();
    void meth2();
}

class AnonymousDemo implements Lambda1 {
    public void Display1() {
        System.out.println("Lambda");
    }

    @Override
    public void meth1() {
        System.out.println("meth1");
    }

    @Override
    public void meth2() {
        System.out.println("meth2");
    }
}

@FunctionalInterface
interface DemAnon {
    void display();
}

class AnonDem implements DemAnon {
    @Override
    public void display() {
        System.out.println("display");
    }
}

public class Java_Anonymous_Classes_And_Lambda_Expressions {
    public static void main(String[] args) {
        AnonymousDemo obj1 = new AnonymousDemo();
        obj1.meth1();

        Lambda1 obj2 = new Lambda1() {
            @Override
            public void meth1() {
                System.out.println("meth1");
            }
            @Override
            public void meth2() {
                System.out.println("meth2");
            }
        };
        obj2.meth1();

        AnonDem obj3 = new AnonDem();
        obj3.display();

        DemAnon obj4 = () -> {
            System.out.println("display");
        };
        obj4.display();
    }
}
