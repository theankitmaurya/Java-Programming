public class Exceptions_In_Java_And_Try_Catch_Block_In_Java {
    public static void main(String[] args) {
/*
        Exceptions in JAVA -> An exception is an event that occurs when a program is executed disrupting the normal flow of instructions.
        There are mainly two types of exception in java.
        (1) Checked Exceptions -> Compile-Time Exceptions (handled by compiler)
        (2) Unchecked Exceptions -> Runtime Exceptions
*/

/*
        Commonly occurring Exceptions -> Following are few commonly occurring exceptions in java:
        (1) NullPointerException
        (2) ArithmeticException
        (3) ArrayIndexOutOfBoundException
        (4) IllegalArgumentException
        (5) NumberFormatException
*/

/*
        try-catch block in Java -> In Java, exceptions are managed using try-catch blocks
        Syntax ->
                try {
                    code to try
                } catch (Exception e) {
                    code if exception
                }
*/

        int a = 5000;
        int b = 0;

//        With try-catch
        try {
            int c = a / b;
            System.out.println("The result is: " + c);
        } catch (Exception e) {
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of the program");

/*
        Without try-catch
        The program will give an exception saying that it has an ArithmeticException
*/
    }
}
