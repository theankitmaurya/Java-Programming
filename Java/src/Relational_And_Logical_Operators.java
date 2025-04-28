
public class Relational_And_Logical_Operators {

    public static void main(String[] args) {
//        AND Operator (&&) -> Returns false if any one of the conditions is false
        boolean A = true;
        boolean B = false;

        System.out.println("And Operator: " + (A && B));

//        OR Operator (||) -> Returns true if any one of the conditions is true
        System.out.println("Or Operator: " + (A || B));

//        NOT operator (!) -> Returns the reverse value of the given argument
        System.out.println("Not Operator for A: " + !A + " and" + " for B: " + !B);

    }
}
