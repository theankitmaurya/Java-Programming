
public class Break_And_Continue {

    public static void main(String[] args) {

//        The break statement is used to exit the loop irrespective of whether the condition is true or false. Whenever a "break" is encountered inside the loop, the control is sent outside the loop.
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
            System.out.println("Here we use break statement.");

            if (i == 2) {
                System.out.println("Broke the loop.");
                break;
            }
        }

//        The continue statement is used to immediately move to the next iteration of the loop. The control is taken to the next iteration thus skipping everything below "continue" inside the loop for that iteration.
        for (int i = 0; i < 10; i++) {
            if (i == 2) {
                System.out.println("Broke the loop.");
                continue;
            }
            System.out.println(i);
            System.out.println("Here we use continue statement");
        }
    }
}
