public class JavaDoc_Method_Tags_For_Generating_Java_Documentation {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *
     * @param a This is the first number to add
     * @param b This is the second number to add
     * @return Sum of two integers as an integer
     * @throws Exception if a is 0
     * @deprecated This method is deprecated. Please use updated method to get the value.
     */

    public int add(int a, int b) throws Exception{

        if (a == 0) {
            throw new Exception();
        }
        int c;
        c = a + b;
        return c;

/*
        Tags for Methods - Javadoc provides the following tags for methods:
        (1) @param -> For developing methods of a parameter
        (2) @return -> For describing about the return value
        (3) @throws -> For describing exceptions thrown
        (4) @deprecated -> For describing deprecation status
*/
    }
}
