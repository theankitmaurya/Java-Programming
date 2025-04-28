
public class Data_Types_Of_Expressions_And_Increment_And_Decrement_Operators {

    public static void main(String[] args) {
        //   The following table summarizes the resulting data types after arithmetic operation On them

        byte a = 45;
        short b = 12;
        int c = 23;
        double d = 67.2D;
        float e = 27.4F;
        long f = 123456789L;

        // Result = Byte + Short = Int
        System.out.println("Result of Byte + Short: " + (a + b));

        // Result = Short + Int = Int
        System.out.println("Result of Short + Int: " + (b + c));

        // Result = Long + Float = Float
        System.out.println("Result of Long + Float: " + (f + e));

        // Result = Int + Float = Float
        System.out.println("Result of Int + Float: " + (c + e));

        // Result = Int + Int = Int
        System.out.println("Result of Int + Int: " + (c + c));

        // Result = Int + Short = Int
        System.out.println("Result of Int + Short: " + (c + b));

        // Result = Long + Double = Double
        System.out.println("Result of Long + Double: " + (f + d));

        // Result = Float + Double = Double
        System.out.println("Result of Float + Double: " + (e + d));

        // Result = Byte + Float = Float
        System.out.println("Result of Byte + Float: " + (a + e));
        System.out.println();
        System.out.println("Increment And Decrement Operators ->");

//        Increment And Decrement Operators
        int g = 3;
        System.out.println(g);
        System.out.println(g++);
        System.out.println(g);

        int h = 5;
        System.out.println(h);
        System.out.println(++h);
        System.out.println(h);

//        a++ -> First use the value and then increment
//        ++a -> First increment the value, then use it
    }
}
