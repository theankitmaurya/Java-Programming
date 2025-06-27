class MyEmployee {
    private int id;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }
}

public class Access_Modifiers_Getters_And_Setters_In_JAVA {
    public static void main(String[] args) {

        MyEmployee me = new MyEmployee();

        me.setName("Ankit1 Maurya");
        System.out.println(me.getName());

        me.setId(1);
        System.out.println(me.getId());

//        NOTE - If we have declared any variable private, then to access it, we have to use getters and setters, and then we will access the private methods or variables initiated
    }
}
