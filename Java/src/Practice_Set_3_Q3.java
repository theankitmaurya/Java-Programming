
public class Practice_Set_3_Q3 {

    public static void main(String[] args) {
//        Write a JAVA program to fill in a letter template which looks like below:
//        letter = "Dear <|name|>, Thanks a lot!"
//        Replace <|name|> with a string (some name)

        String str1 = "Dear <|name|>, Thanks a lot!";
        String str2 = "Ankit1";

        System.out.println(str1.replace("<|name|>", str2));
    }
}
