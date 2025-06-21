class Employee2 {
    int salary;
    String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
}

public class Practice_Set_8_Q1 {
    public static void main(String[] args) {
        // Create a class Employee with the following properties and methods:
        // Salary (property | return -> int)
        // name (property | return -> string)
        // setName (method | return -> changing name)
        // getName (method | return -> string)
        // getSalary (method | return -> int)

        Employee2 ankit = new Employee2();

        ankit.salary = 50000;
        ankit.name = "Ankit1 Maurya";

        System.out.println(ankit.getSalary());
        System.out.println(ankit.getName());

        ankit.setName("Ankit1 Maurya");
        System.out.println(ankit.getName());

    }
}
