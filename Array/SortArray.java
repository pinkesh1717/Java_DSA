package Array;

import java.util.Scanner;

public class SortArray {
    // Sort 0s and 1s (two pointer method)
    public static void sortZerosAndOnes(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == 1 && arr[right] == 0) {
                swap(arr, left, right);
                left++;
                right--;
            }
            if (arr[left] == 0) left++;
            if (arr[right] == 1) right--;
        }
    }

    // Sort 0s and 1s (counting method)
    public static void sortZerosAndOnesCount(int[] arr) {
        int n = arr.length, zeros = 0;
        for (int i = 0; i < n; i++) if (arr[i] == 0) zeros++;
        for (int i = 0; i < n; i++) arr[i] = (i < zeros) ? 0 : 1;
    }

    // Sort 0s, 1s, 2s (counting method)
    public static void sortColorsCount(int[] arr) {
        int n = arr.length, zeros = 0, ones = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) zeros++;
            if (arr[i] == 1) ones++;
        }
        for (int i = 0; i < n; i++) {
            if (i < zeros) arr[i] = 0;
            else if (i < zeros + ones) arr[i] = 1;
            else arr[i] = 2;
        }
    }

    // Sort 0s, 1s, 2s (Dutch National Flag)
    public static void sortColorsDNF(int[] arr) {
        int lo = 0, mid = 0, hi = arr.length - 1;
        while (mid <= hi) {
            if (arr[mid] == 0) {
                swap(arr, mid, lo);
                lo++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else {
                swap(arr, mid, hi);
                hi--;
            }
        }
    }

    // Check if array is sorted
    public static boolean isSorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) return false;
        }
        return true;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void printArray(int[] arr) {
        for (int x : arr) System.out.print(x + " ");
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int[] arr1 = arr.clone();
        int[] arr2 = arr.clone();
        int[] arr3 = arr.clone();
        int[] arr4 = arr.clone();

        sortZerosAndOnes(arr1);
        System.out.print("Sorted 0s and 1s (two pointer): ");
        printArray(arr1);

        sortZerosAndOnesCount(arr2);
        System.out.print("Sorted 0s and 1s (counting): ");
        printArray(arr2);

        sortColorsCount(arr3);
        System.out.print("Sorted 0s, 1s, 2s (counting): ");
        printArray(arr3);

        sortColorsDNF(arr4);
        System.out.print("Sorted 0s, 1s, 2s (DNF): ");
        printArray(arr4);

        System.out.println("Is sorted: " + isSorted(arr));
        sc.close();
    }
}