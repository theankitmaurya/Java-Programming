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

        me.setName("Ankit Maurya");
        System.out.println(me.getName());

        me.setId(1);
        System.out.println(me.getId());
    }
}
