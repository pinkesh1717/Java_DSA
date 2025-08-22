package twodarray;

public class MatrixElementFinder {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };
        int largest = findLargest(arr);
        int smallest = findSmallest(arr);
        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
    }

    public static int findLargest(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr) {
            for (int val : row) {
                if (val > max) {
                    max = val;
                }
            }
        }
        return max;
    }

    public static int findSmallest(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr) {
            for (int val : row) {
                if (val < min) {
                    min = val;
                }
            }
        }
        return min;
    }
}
