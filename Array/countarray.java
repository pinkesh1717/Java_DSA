package Array;

import java.util.Scanner;

public class countarray {
    static int lastoccurence(int[] arr, int x) {
        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static int countoccurrences(int[] arr, int x) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + "elements :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("Enter x:");
        int x = sc.nextInt();
        System.out.println("COUNT OF X: " + countoccurrences(arr, x));
        System.out.print("LAST OCCURENCE OF X:" + lastoccurence(arr, x));
        sc.close();
    }

}