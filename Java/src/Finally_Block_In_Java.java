public class Finally_Block_In_Java {

    public static int greet() {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("This is the end of this program.");
        }
        return -1;
    }

    public static void main(String[] args) {
        greet();
    }
}
