import java.util.Scanner;

public class Practice_Set_7_Q9 {

    static double CelsiusToFahrenheit(int celsius) {

        double result = 0.0;

        if (celsius == 0) {
            return 32.0;
        } else if (celsius > 0) {
            result = 9.0 / 5.0 + CelsiusToFahrenheit(celsius - 1) - 32.0;
        } else {
            result = -9.0 / 5.0 + CelsiusToFahrenheit(celsius + 1) - 32.0;
        }

        return 32.0 + result;
    }

    static double FahrenheitToCelsius(int fahrenheit) {
        double result = 0.0;

        if (fahrenheit == 32) {
            return 0.0;
        } else if (fahrenheit > 32) {
            result = 5.0 / 9.0 + FahrenheitToCelsius(fahrenheit - 1);
        } else {
            result = -5.0 / 9.0 + FahrenheitToCelsius(fahrenheit + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        // Write a function to convert Celsius temperature to Fahrenheit temperature

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        int n = sc.nextInt();

        double fahrenheit = CelsiusToFahrenheit(n);
        System.out.printf("%d°C = %.2f°F\n", n, fahrenheit);

        System.out.println("Enter the temperature in Fahrenheit: ");
        int n1 = sc.nextInt();

        double celsius = FahrenheitToCelsius(n1);
        System.out.printf("%d°F = %.2f°C\n", n1, celsius);
    }
}
