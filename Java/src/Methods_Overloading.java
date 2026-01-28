public class Methods_Overloading {
    /* void return type -> When we don't want our method to return anything, we use void as the return type. */

    static void tellJoke() {
        System.out.println("I invented a new word!\n" + "Plagiarism!");
    }

    static void change1(int a) {
        a = 98;
    }

    static void change2(int[] arr) {
        arr[0] = 12;
    }

    static void foo() {
        System.out.println("Good Morning Bro!");
    }

    static void foo(String a) {
        System.out.println("Good Morning " + a + " Bro!");
    }

    static void foo(String a, String b) {
        System.out.println("Good Morning " + a + " Bro!");
        System.out.println("Good Morning " + b + " Bro!");
    }

    /* Static keyword -> Static keyword is used to associate a method of a given class with the class rather than the object. All the objects share static method in a class. */

    public static void main(String[] args) {
        tellJoke();

        // Note: In the case of arrays, the reference is passed. Same in the case for object passing to methods.

        // Case1: Changing the Integer
        int x = 45;
        change1(x);
        System.out.println("The value of x after running change is: " + x);

        // Case2: Changing the Array
        int[] marks = {24, 48, 72, 96};
        change2(marks);
        System.out.println("The first value in array after changing is: " + marks[0]);

        /* Methods Overloading -> Two or more methods can have the same name but different parameters. Such methods are called overloaded methods. */
        foo();
        foo("Ankit1");
        foo("Ankit1", "Sam");

        /* Method Overloading cannot be performed by changing the return type of methods. */
    }
}
