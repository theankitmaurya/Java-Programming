import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class Exception_Class_In_Java {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < 9) {
            try {
                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Finished!");
            }
            System.out.println("Yes Finished!");
        }

/*
        Exception class in Java -> We can write our custom exceptions using Exception class in Java
        public class MyException extends Exception {
            // overridden methods
        }

        The exception class has the following important methods:
        (1) String - toString() - executes when sout(e) is ran
        (2) void - printStackTrace() - prints stack trace
        (3) String - getMessage() - prints the exception message
*/

/*
        The Throw Keyword - The throw keyword is used to throw an exception explicitly by the programmer
        if (b == 0) {
            throw new ArithmeticException("Div by 0");
        } else {
            return a / b;
        }

        In a similar manner, we can throw user defined exceptions: throw new MyException("Exception Thrown!");
*/
    }
}
