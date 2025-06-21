class Employee1 {
    String id;
    int salary;
    String name;

    public void printDetails() {
        System.out.println("My ID is " + id + " and my name is " + name + " and my Salary is " + salary);
    }
}

public class Creating_Our_Own_JAVA_Class {
    public static void main(String[] args) {
        Employee1 ankit = new Employee1();
        Employee1 john = new Employee1();

        ankit.id = "ASD12V5BGE1";
        ankit.name = "Ankit1";
        ankit.salary = 50000;

        john.id = "ASD12V5BGE2";
        john.name = "John";
        john.salary = 25000;

        // System.out.println(ankit.id);
        // System.out.println(ankit.name);

        ankit.printDetails();
        john.printDetails();
    }
}
