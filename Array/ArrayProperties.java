package Array;

import java.util.Scanner;

public class ArrayProperties {
    // Find second largest element
    public static int findSecondMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i];
        }
        int secondMax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != max && arr[i] > secondMax) secondMax = arr[i];
        }
        return secondMax;
    }

    // Find unique element (appears only once)
    public static int uniqueElement(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            boolean isUnique = true;
            for (int j = 0; j < n; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) return arr[i];
        }
        return -1;
    }

    // Find first repeating number
    public static int firstRepeating(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("Second Maximum Element: " + findSecondMax(arr));
        System.out.println("Unique Element: " + uniqueElement(arr));
        System.out.println("First Repeating Number: " + firstRepeating(arr));
        sc.close();
    }
}
