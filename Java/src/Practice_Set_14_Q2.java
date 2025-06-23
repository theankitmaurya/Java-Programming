public class Practice_Set_14_Q2 {
    public static void main(String[] args) {
//        Write a java program that prints "Haha" during ArithmeticException and "Hehe" during an IllegalArgumentException

        try {
            int a = 4000 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Haha");
        } catch (IllegalArgumentException e) {
            System.out.println("Hehe");
        }
    }
}
