
public class Strings_Methods {

    public static void main(String[] args) {

//        Strings are immutable
        String str = "Ankit";

//        .length() -> returns length of the string
        System.out.println(str.length());

//        .toLowerCase() -> returns a new string which has all the lowercase characters from the string name
        System.out.println(str.toLowerCase());

//        .toUpperCase() -> returns a new string which has all the uppercase characters from the string name
        System.out.println(str.toUpperCase());

//        .trim() -> returns a new string after removing all the leading and trailing spaces from the original string
        String hello = "     Hello     ";
        System.out.println(hello);
        System.out.println(hello.trim());

//        .substring(int start) -> returns a substring from start to the end
        System.out.println(str.substring(2));

//        .substring(int start, int end) -> returns a substring from start index to the end index. Start index is included and end is excluded.
        System.out.println(str.substring(2, 4));

//        .replace('a', 'b') -> returns a new string after replacing letters .
        String cat = "Cat";
        System.out.println(cat.replace('C', 'B'));
        System.out.println(cat.replace("Cat", "Batting"));

//        .startsWith("") -> returns true if string starts with the given argument
        System.out.println(str.startsWith("An"));

//        .endsWith("") -> returns true if string ends with the given argument
        System.out.println(str.endsWith("it"));

//        .charAt(2) -> returns character at a given position
        System.out.println(str.charAt(2));

//        .indexOf() -> returns the index of the given string
        System.out.println(str.indexOf("it"));

//    .indexOf("i", 2) -> returns the index of the given string starting from the index 2
        System.out.println(str.indexOf("it", 2));

//        .lastIndexOf("") -> returns the last index of the given string
        System.out.println(str.lastIndexOf("t"));

//        .lastIndexOf("k", 2) -> returns the last index of the given string before index 2
        System.out.println(str.lastIndexOf("it", 3));

//        .equals() -> returns true if the given string is equal to the argument
        System.out.println(str.equals("Ankit"));

//        .equalsIgnoreCase() -> returns true if two strings are equal ignoring the case of characters
        System.out.println(str.equalsIgnoreCase("ankit"));
    }

}
