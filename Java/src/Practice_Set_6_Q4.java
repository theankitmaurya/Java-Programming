
public class Practice_Set_6_Q4 {

    public static void main(String[] args) {
//        Create a JAVA Program to add two matrices of size 2 X 3

        int[][] matrix1 = {{1, 2, 3},
        {4, 5, 6}};
        int[][] matrix2 = {{2, 3, 4},
        {5, 6, 7}};
        int[][] result = {{0, 0, 0},
        {0, 0, 0}};

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.format("Setting the value for i = %d and j = %d\n", i, j);
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(result[i][j] + " ");
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
            System.out.println("");
        }
    }
}
