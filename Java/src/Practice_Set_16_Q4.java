interface myInteger {
    void myInteger();
}

public class Practice_Set_16_Q4 {
    public static void main(String[] args) {
//        Create an interface and generate an instance from it

        myInteger mi = new myInteger() {
            @Override
            public void myInteger() {
                System.out.println("I am myInteger");
            }
        };
    }
}
