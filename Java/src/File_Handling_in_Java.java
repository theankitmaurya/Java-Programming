import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Handling_in_Java {
    public static void main(String[] args) {
/*
        File handling in Java - Reading from and writing to files is an important aspect of any programming language.
        We can use the File class in Java to create a file object.
        (1) createNewFile() method -> creates a File
        (2) For reading files we can use the same Scanner class and supply it a file object.
        (3) To delete a file in Java, we can use the file object's delete() method.
*/

//        To create a file -
        File file = new File("file_ankit.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("Unable to create this file");
            throw new RuntimeException(e);
        }

//        For writing to a File -
        try {
            FileWriter fileWriter = new FileWriter("file_ankit.txt");
            fileWriter.write("This is the ending of this Java Playlist\nOk bye");
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

//        Reading a File -
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

//        Delete a File -
        if (file.delete()) {
            System.out.println("I have deleted: " + file.getName());
        } else {
            System.out.println("Some problem occurred in deleting the file");
        }
    }
}
