
public class Practice_Set_6_Q1 {

    public static void main(String[] args) {
//        Create an array of 5 floats and calculate their sum

        float[] marks = {99.5F, 89.F, 23.0F, 46.9F, 20.2F};

        float sum = 0;
        for (float element : marks) {
            sum += element;
        }
        System.out.println("Sum: " + sum);
    }
}
