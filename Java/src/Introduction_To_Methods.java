
public class Introduction_To_Methods {

    static int Logic(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = (x + y) * 5;
        }
        return z;
    }

    ;

    int Sum(int x, int y) {
        int z;
        z = x + y;
        return z;
    }

    public static void main(String[] args) {
//            By using static keyword -> We have to use static if we have static in our Main file
        int a1 = 2;
        int b1 = 5;
        int c1 = Logic(a1, b1);
        System.out.println("Value: " + c1);

        int a2 = 5;
        int b2 = 2;
        int c2 = Logic(a2, b2);
        System.out.println("Value: " + c2);

//        Without using static keyword -> We can create a new class which is the same as our file name, and then we don't have to use static keyword.
        Introduction_To_Methods Addition = new Introduction_To_Methods();
        int a3 = 3;
        int b3 = 8;

        int c3 = Addition.Sum(a3, b3);
        System.out.println("Value: " + c3);
    }
}

/*
 Syntax of a Method -> A method is a function written inside a class. Since JAVA is an Object-Oriented Programming Language, we need to write the method inside some class.
 datatype name() {
      Method body
 }
*/
