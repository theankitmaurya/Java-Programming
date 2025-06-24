import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Practice_Set_16_Q6 {
    public static void main(String[] args) {
//        Repeat Question 5 with numbers from 2-9 and save all these multiplication tables to a folder
        File folder = new File("tables");
        if (!folder.exists()) {
            folder.mkdir();
        }

        // Loop from 2 to 9
        for (int i = 2; i <= 9; i++) {
            String table = "";
            for (int j = 0; j < 10; j++) {
                table += i + " X " + (j + 1) + " = " + (i * (j + 1)) + "\n";
            }

            try {
                FileWriter fw = new FileWriter("tables/MultiplicationTable_" + i + ".txt");
                fw.write(table);
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Multiplication tables saved successfully in the 'tables' folder.");
    }
}
