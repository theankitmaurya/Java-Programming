public class Throw_VS_Throws_In_Java {

    public static int divide(int a, int b) throws ArithmeticException {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {

        try {
            int c = divide(4, 0);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("Exception: ");
            System.out.println(e);
        }
/*
        The Throws Exception -> The java throws keyword is used to declare an exception. This gives information to the programmer that there might be an exception, so it's better to be prepared with a try catch block!
        public void Calculate (int a, int b) throws IOException {
            // code
        }
*/
    }
}
