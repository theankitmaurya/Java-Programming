public class Practice_Set_7_Q6 {

    static int Average(int... numbers) {
        if (numbers.length == 0) {
            throw new Error("Please enter at least one number");
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    public static void main(String[] args) {
        // Write a function to find average of a set of numbers passed as arguments

        System.out.println("Average: " + Average(10, 20, 30, 40));
        System.out.println("Average: " + Average(5, 15));
    }
}
