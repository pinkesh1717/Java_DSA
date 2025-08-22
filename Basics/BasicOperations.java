package Basics;

import java.util.Scanner;

public class BasicOperations {
    // Count strictly greater elements
    static int countStrictlyGreater(int[] arr, int x) {
        int count = 0;
        for (int value : arr) {
            if (value > x)
                count++;
        }
        return count;
    }

    // Swap two numbers (demonstration)
    static void swapDemo(int a, int b) {
        System.out.println("Original value before swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swap:");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
    }

    // Frequency array and query
    static void frequencyQuery(Scanner sc) {
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] freq = new int[10005];
        for (int value : arr)
            freq[value]++;
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter number to be searched:");
            int x = sc.nextInt();
            if (freq[x] > 0)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demo for strictly greater
        System.out.println("Enter size for strictly greater demo:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("Count of strictly greater: " + countStrictlyGreater(arr, x));

        // Demo for swap
        swapDemo(9, 3);

        // Demo for frequency query
        frequencyQuery(sc);
        sc.close();
    }
}
