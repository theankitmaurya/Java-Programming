class Deprecation1 {
    @Deprecated
    void meths() {
        System.out.println("This is deprecated method");
    }
}

public class Practice_Set_16_Q3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
//        Suppress the generated warnings from Question 2

        Deprecation1 deprecation = new Deprecation1();
        deprecation.meths();
    }
}
