class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee() {
        id = 45;
        name = "Ankit Maurya";
    }

    public MyMainEmployee(int myId, String myName) {
        id = myId;
        name = myName;
    }

    public String getName() { return name; }
    public void setName(String n) { this.name = n; }
    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

}

public class Constructors_In_JAVA {
    public static void main(String[] args) {
//        Constructors In Java -> A member function used to initiate an object while creating it.

        MyMainEmployee me1 = new MyMainEmployee(12, "Ankit Maurya");
        MyMainEmployee me2 = new MyMainEmployee();
//
        System.out.println(me1.getId());
        System.out.println(me1.getName());

        System.out.println(me2.getId());
        System.out.println(me2.getName());

//        Constructor Overloading -> Constructors can be overloaded like any other methods in java.
//        Note -> (1) -> Constructors can take parameters without being overloaded.
//                (2) -> There can be more thn two overloaded constructors.

    }
}
