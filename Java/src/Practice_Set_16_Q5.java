import java.io.FileWriter;
import java.io.IOException;

public class Practice_Set_16_Q5 {
    public static void main(String[] args) {
//        Write a program to generate multiplication table of a given number and write it to a file

        int i = 5;
        String table = "";
        for (int j = 0; j < 10; j++) {
            table += i + " X " + (j + i) + " = " + i * (j + i);
            table += "\n";
        }
        try {
            FileWriter fw = new FileWriter("MultiplicationTable.txt");
            fw.write(table);
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
