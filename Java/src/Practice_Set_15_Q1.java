import java.util.ArrayList;

public class Practice_Set_15_Q1 {
    public static void main(String[] args) {
//        Create an array list and store the names of 10 students inside it. Print it using a for-each loop

        ArrayList al = new ArrayList();
        al.add("Student 1");
        al.add("Student 2");
        al.add("Student 3");
        al.add("Student 4");
        al.add("Student 5");
        al.add("Student 6");
        al.add("Student 7");
        al.add("Student 8");
        al.add("Student 9");
        al.add("Student 10");

        for (Object o: al) {
            System.out.println(o);
        }
    }
}
