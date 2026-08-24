public class MatrixTranspose {

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int rows = matrix.length;
        int columns = matrix[0].length;

        System.out.println("Transpose:");

        for (int i = 0; i < columns; i++) {

            for (int j = 0; j < rows; j++) {

                System.out.print(matrix[j][i] + " ");
            }

            System.out.println();
        }
    }
}