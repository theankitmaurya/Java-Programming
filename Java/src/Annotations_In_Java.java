class HelloJava {
    public void Java() {
        System.out.println("Hello Java");
    }
}

class JavaVersion extends HelloJava {
    @Override
    public void Java() {
        System.out.println("Java Version");
    }
}

class SumThis {
    @Deprecated
    public int sum(int a, int b) {
        return a + b;
    }
}

@FunctionalInterface
interface myFunctionalInterface {
    void thisMethod();
}

public class Annotations_In_Java {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
/*
        Annotations In Java - Used to provide extra information about aa program. Annotations provide metadata to class/methods.
        Following are some common annotations built into Java:
        (1) @Override -> Used to mark Overridden elements in the child class
        (2) @SuppressWarnings -> Used to suppress the generated warnings by the compiler
        (3) @Deprecated -> Used to mark deprecated methods
        (4) @FunctionalInterface -> Used to ensure an interface is a functional interface
*/

        HelloJava hello = new HelloJava();
        hello.Java();

        JavaVersion javaVersion = new JavaVersion();
        javaVersion.Java();

        SumThis sumThis = new SumThis();
        sumThis.sum(1, 5);
    }
}
