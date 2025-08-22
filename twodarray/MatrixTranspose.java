package twodarray;

public class MatrixTranspose {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        System.out.println("\nTranspose (with extra space):");
        int[][] transposed = transposeWithExtraSpace(matrix);
        printMatrix(transposed);

        System.out.println("\nIn-place Transpose:");
        inPlaceTranspose(matrix);
        printMatrix(matrix);
    }

    public static int[][] transposeWithExtraSpace(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] transposed = new int[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transposed[j][i] = matrix[i][j];
            }
        }
        return transposed;
    }

    public static void inPlaceTranspose(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
