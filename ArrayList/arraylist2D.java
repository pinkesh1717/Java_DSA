

import java.util.*;

public class arraylist2D {

    // ------------------ Utility Functions ------------------
    public static void print2DArray(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printList2D(List<List<Integer>> ans) {
        for (List<Integer> row : ans) {
            for (Integer num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // ------------------ Q1: Pascal's Triangle ------------------
    public static void pascalsTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    l.add(1);
                } else {
                    l.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
                }
            }
            ans.add(l);
        }

        printList2D(ans);
    }

    // ------------------ Q2: Matrix Multiplication ------------------
    public static void matrixMultiplication() {
        int[][] a = { { 1, 2, 1 }, { 2, 1, 2 } };
        int[][] b = { { 1, 2, 0, 1 }, { 1, 2, 2, 0 }, { 1, 0, 0, 2 } };

        if (a[0].length != b.length) {
            System.out.print("Multiplication not possible ");
        } else {
            int[][] ans = new int[a.length][b[0].length];
            for (int i = 0; i < ans.length; i++) {
                for (int j = 0; j < ans[0].length; j++) {
                    for (int k = 0; k < b.length; k++) {
                        ans[i][j] += a[i][k] * b[k][j];
                    }
                }
            }
            print2DArray(a);
            print2DArray(b);
            print2DArray(ans);
        }
    }

    // ------------------ Q3: Score after flipping the matrix ------------------
    public static void scoreAfterFlipping() {
        int[][] arr = { { 0, 0, 1, 1 }, { 1, 0, 1, 0 }, { 1, 1, 0, 0 } };
        int m = arr.length;
        int n = arr[0].length;

        // Step1: Flip rows starting with 0
        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0) {
                for (int j = 0; j < n; j++) {
                    arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                }
            }
        }

        // Step2: Flip columns if zeros are more than ones
        for (int j = 1; j < n; j++) {
            int noOfZeros = 0;
            int noOfOnes = 0;
            for (int i = 0; i < m; i++) {
                if (arr[i][j] == 0)
                    noOfZeros++;
                else
                    noOfOnes++;
            }
            if (noOfZeros > noOfOnes) {
                for (int i = 0; i < m; i++) {
                    arr[i][j] = arr[i][j] == 0 ? 1 : 0;
                }
            }
        }

        // Step3: Calculate score
        int score = 0;
        int x = 1;
        for (int j = n - 1; j >= 0; j--) {
            for (int i = 0; i < m; i++) {
                score += (arr[i][j] * x);
            }
            x *= 2;
        }

        print2DArray(arr);
        System.out.print("score: " + score);
        System.out.println();
    }

    // ------------------ Q4: Searching 2D array (Method I) ------------------
    public static void search2DArrayMethod1() {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int m = arr.length;
        int n = arr[0].length;
        int i = m - 1;
        int j = 0;
        boolean found = false;
        int target = 9;

        while (i >= 0 && j < n) {
            if (arr[i][j] == target) {
                found = true;
                break;
            } else if (arr[i][j] > target) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println("Found target " + target + ": " + found);
    }

    // ------------------ Q5: Searching 2D array (Method II) ------------------
    public static void search2DArrayMethod2() {
        int[][] arr = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
                { 18, 21, 23, 26, 30 } };
        int m = arr.length;
        int n = arr[0].length;
        boolean found = false;
        int target = 21;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == target) {
                    found = true;
                }
            }
        }
        System.out.println("Found target " + target + " : " + found);
    }

    // ------------------ Main Function ------------------
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pascal’s Triangle:");
        pascalsTriangle(5);

        System.out.println("Matrix Multiplication:");
        matrixMultiplication();

        System.out.println("Score After Flipping:");
        scoreAfterFlipping();

        System.out.println("Search 2D Array (Method I):");
        search2DArrayMethod1();

        System.out.println("Search 2D Array (Method II):");
        search2DArrayMethod2();

        sc.close();
    }
}
