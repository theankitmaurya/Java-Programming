
public class Practice_Set_2_Q2 {

    public static void main(String[] args) {
//        Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

//        Encrypting ->
        char grade = 'A';
        System.out.print("Encrypting: ");
        grade = (char) (grade + 8);
        System.out.println(grade);

//        Decrypting ->
        System.out.print("Decrypting: ");
        grade = (char) (grade - 8);
        System.out.println(grade);

//        The (char) is a type cast. It explicitly converts the result of grade + 8 (which is an integer after the addition) back into a char. This ensures the result fits within the char type.
    }
}
