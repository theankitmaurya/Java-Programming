class Deprecation {
    @Deprecated
    void meths() {
        System.out.println("This is deprecated method");
    }
}

public class Practice_Set_16_Q2 {
    public static void main(String[] args) {
//        Create a class and add a method with deprecated annotation. What is its effect on program execution
        Deprecation deprecation = new Deprecation();
        deprecation.meths();
    }
}
