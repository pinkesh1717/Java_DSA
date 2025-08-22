package twodarray;

public class MatrixWavePrint {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        System.out.println("Column-wise Wave Print:");
        wavePrintColWise(arr);
        System.out.println("Row-wise Wave Print:");
        wavePrintRowWise(arr);
    }

    public static void wavePrintColWise(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int j = 0; j < m; j++) {
            if (j % 2 == 0) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int i = n - 1; i >= 0; i--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }

    public static void wavePrintRowWise(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            } else {
                for (int j = m - 1; j >= 0; j--) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println();
    }
}
