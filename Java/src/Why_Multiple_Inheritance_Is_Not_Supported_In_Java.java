public class Why_Multiple_Inheritance_Is_Not_Supported_In_Java {
    public static void main(String[] args) {
        /*
         * Multiple inheritances face problems when there exists methods with same signature in both the super classes.
         * Due to such problems, java does not support multiple inheritance directly, but the similar concept can be achieved using interfaces.
         * A class can implement multiple interfaces and extend a class at the same time.
         */

        /*
         * Note ->
         * 1. Interfaces in JAVA are a bit like the class with a significant difference.
         * 2. An interface can only have method signatures, fields, and default methods.
         * 3. The class implementing an interface needs to define the methods necessarily, not the fields.
         * 4. You can create a refernce of interfaces but not the object.
         * 5. Interface methods are public by default.
         */

    }
}
