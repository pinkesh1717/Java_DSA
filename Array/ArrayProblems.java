package Array;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayProblems {
    // Move all even integers to the beginning
    static void sortByParity(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        while (left < right) {
            if (arr[left] % 2 == 1 && arr[right] % 2 == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] % 2 == 0) {
                left++;
            }
            if (arr[right] % 2 == 1) {
                right--;
            }
        }
    }

    // Return array of squares sorted in non-decreasing order
    static int[] sortedSquares(int[] arr) {
        int n = arr.length;
        int left = 0, right = n - 1;
        int[] ans = new int[n];
        int k = 0;
        while (left <= right) {
            if (Math.abs(arr[left]) > Math.abs(arr[right])) {
                ans[k++] = arr[left] * arr[left];
                left++;
            } else {
                ans[k++] = arr[right] * arr[right];
                right--;
            }
        }
        Arrays.sort(ans);
        return ans;
    }

    // Find smallest and largest in array
    static int[] smallestAndLargest(int[] arr) {
        Arrays.sort(arr);
        return new int[] { arr[0], arr[arr.length - 1] };
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Parity sort demo
        System.out.println("Enter size for parity sort:");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr1[i] = sc.nextInt();
        sortByParity(arr1);
        System.out.print("Parity sorted array: ");
        for (int x : arr1)
            System.out.print(x + " ");
        System.out.println();

        // Sorted squares demo
        System.out.println("Enter size for sorted squares:");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        System.out.println("Enter " + m + " elements:");
        for (int i = 0; i < m; i++)
            arr2[i] = sc.nextInt();
        int[] squares = sortedSquares(arr2);
        System.out.print("Sorted squares: ");
        for (int x : squares)
            System.out.print(x + " ");
        System.out.println();

        // Smallest and largest demo
        System.out.println("Enter size for min/max:");
        int k = sc.nextInt();
        int[] arr3 = new int[k];
        System.out.println("Enter " + k + " elements:");
        for (int i = 0; i < k; i++)
            arr3[i] = sc.nextInt();
        int[] minmax = smallestAndLargest(arr3);
        System.out.println("Smallest: " + minmax[0]);
        System.out.println("Largest: " + minmax[1]);
        sc.close();
    }
}
