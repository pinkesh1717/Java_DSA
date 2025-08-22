package Array;

import java.util.*;

public class TwoDArrays {
    // Print a 2D array
    public static void print2D(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    // Merge two sorted arrays
    public static int[] mergeArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (i < a.length) c[k++] = a[i++];
        while (j < b.length) c[k++] = b[j++];
        return c;
    }

    // Pascal's Triangle
    public static List<List<Integer>> pascalTriangle(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) l.add(1);
                else l.add(ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1));
            }
            ans.add(l);
        }
        return ans;
    }

    public static void printPascal(List<List<Integer>> ans) {
        for (List<Integer> row : ans) {
            for (Integer num : row) System.out.print(num + " ");
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // 2D array print demo
        int[][] a = { { 1, 2, 1 }, { 2, 1, 2 } };
        int[][] b = { { 1, 2, 0, 1 }, { 1, 2, 2, 0 }, { 1, 0, 0, 2 } };
        System.out.println("2D Array a:");
        print2D(a);
        System.out.println("2D Array b:");
        print2D(b);

        // Merge arrays demo
        int[] arr1 = {2, 6, 4, 5};
        int[] arr2 = {4, 8, 9, 10};
        int[] merged = mergeArrays(arr1, arr2);
        System.out.print("Merged array: ");
        for (int x : merged) System.out.print(x + " ");
        System.out.println();

        // Pascal's Triangle demo
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n for Pascal's Triangle: ");
        int n = sc.nextInt();
        List<List<Integer>> pascal = pascalTriangle(n);
        System.out.println("Pascal's Triangle:");
        printPascal(pascal);
        sc.close();
    }
}
