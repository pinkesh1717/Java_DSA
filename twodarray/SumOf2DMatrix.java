package twodarray;

//Q.3 WAP TO PRINT THE SUM OF 2D MATRIX
public class SumOf2DMatrix {
    public static void main(String[] args) {
        int[][] arr = { { 4, 5, 7 }, { 8, 9, 10 } };
        int multi = 1;
        // int sum =0;
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                multi *= arr[i][j];
                // sum+=arr[i][j]
            }
        }
        // System.out.print(sum)
        System.out.print(multi);
    }
}
