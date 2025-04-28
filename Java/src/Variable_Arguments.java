public class Variable_Arguments {

    static int Sum(int ...arr) {
        int result = 0;
        for (int a : arr) {
            result += a;
        }
        return result;
    }

    public static void main(String[] args) {
/*
        Variable Arguments (varargs) -> A function with varargs can be created in JAVA using the following syntax:
        public static void name(int ...arr) {
              arr is available here as int[] arr
        }
*/

        System.out.println("The sum of nothing is:" + Sum());
        System.out.println("The sum of only one number is: " + Sum(1));
        System.out.println("The sum of two numbers is: " + Sum(3, 4));
        System.out.println("The sum of three numbers is: " + Sum(5, 6, 7));
        System.out.println("The sum of four numbers is: " + Sum(8, 9, 10, 11));
        System.out.println("The sum of five numbers is: " + Sum(12, 13, 14, 15, 16));
    }
}
