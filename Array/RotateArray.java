package Array;

import java.util.Scanner;

public class RotateArray {
    // In-place rotation using reversal
    public static void rotateInPlace(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        reverse(arr, 0, n - k - 1);
        reverse(arr, n - k, n - 1);
        reverse(arr, 0, n - 1);
    }

    private static void reverse(int[] arr, int i, int j) {
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Rotation using extra array
    public static int[] rotateWithExtraArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - k; i < n; i++) {
            ans[j++] = arr[i];
        }
        for (int i = 0; i < n - k; i++) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter k: ");
        int k = sc.nextInt();

        System.out.print("Original array: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        int[] arrCopy = arr.clone();
        rotateInPlace(arr, k);
        System.out.print("After in-place rotation: ");
        for (int x : arr) System.out.print(x + " ");
        System.out.println();

        int[] rotated = rotateWithExtraArray(arrCopy, k);
        System.out.print("After rotation with extra array: ");
        for (int x : rotated) System.out.print(x + " ");
        System.out.println();
        sc.close();
    }
}
