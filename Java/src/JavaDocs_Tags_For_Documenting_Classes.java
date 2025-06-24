/**
 * This class is to demonstrate what javadoc is and how it is used in the java industry
 * @author Ankit
 * @version 0.1
 * @since 2025
 * @see Docs
*/

public class JavaDocs_Tags_For_Documenting_Classes {
    public static void sum(int a, int b) {
        System.out.println("The value of sum is: " + (a + b));
    }
    public static void main(String[] args) {
        sum(3, 5);
    }

/*
    Tags for class or a package
    @author -> Adds the author name
    @version -> Adds the version
    @since -> To add when was this version written
    @see -> Adds a see also heading with a link
*/
}
