import java.util.Scanner;

class InvalidInputException extends Exception {
    public InvalidInputException() {
        super("Invalid input! Only +, -, *, / operations are allowed.");
    }
}

class CannotDivideByZeroException extends Exception {
    public CannotDivideByZeroException() {
        super("Cannot divide by zero!");
    }
}

class MaxInputException extends Exception {
    public MaxInputException() {
        super("Input value exceeds maximum limit of 100000!");
    }
}

class MaxMultiplierReachedException extends Exception {
    public MaxMultiplierReachedException() {
        super("Multiplier input exceeds 7000!");
    }
}

class CustomCalculator {
    public static double calculate(int a, int b, char op) throws InvalidInputException, CannotDivideByZeroException, MaxInputException, MaxMultiplierReachedException {
        if (a > 100000 || b > 100000) {
            throw new MaxInputException();
        }

        switch (op) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                if (a > 7000 || b > 7000) {
                    throw new MaxMultiplierReachedException();
                }
                return a * b;

            case '/':
                if (b == 0) {
                    throw new CannotDivideByZeroException();
                }
                return (double) a / b;

            default:
                throw new InvalidInputException();
        }
    }
}

public class Problem_6 {
    public static void main(String[] args) {
/*
        You have to create a custom calculator with the following operations:
        1. + -> Addition
        2. - -> Subtraction
        3. * -> Multiplication
        4. / -> Division
        which throws the following exceptions:
        1. Invalid Input Exception
        2. Cannot Divide By 0 Exception
        3. Max Input Exception if any of the inputs is greater than 100000
        4. Max Multiplier Reached Exception - Don't allow any multiplication input to be greater than 7000
*/

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number: ");
            int num2 = sc.nextInt();

            System.out.print("Enter operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = CustomCalculator.calculate(num1, num2, operator);
            System.out.println("Result: " + result);

        } catch (InvalidInputException | CannotDivideByZeroException | MaxInputException | MaxMultiplierReachedException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        sc.close();
    }
}
