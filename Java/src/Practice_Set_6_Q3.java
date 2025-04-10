
public class Practice_Set_6_Q3 {

    public static void main(String[] args) {
//        Calculate the average marks from an array containing marks of all students in Physics using for-each loop.

        float[] marks = {99.5F, 89.5F, 23.0F, 46.9F, 20.2F};

        float sum = 0;
        float average = 0;
        for (float element : marks) {
            sum += element;
            average = sum / marks.length;
        }
        System.out.println("Average of the marks in Physics is: " + average);
    }
}
