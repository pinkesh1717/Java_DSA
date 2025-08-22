package twodarray;

// Q.4 WAP to add two matrices
public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = { { 5, 7, 1 }, { 4, 9, 1 }, { 3, 2, 0 } };
        int[][] b = { { 9, 8, 6 }, { 5, 4, 3 }, { 2, 0, 1 } };
        int m = a.length;
        int n = b[0].length;
        int[][] res = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
