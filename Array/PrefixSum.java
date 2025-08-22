package Array;
import java.util.Scanner;

public class PrefixSum {
    // Prefix sum in the same array
    static int[] makePrefixSum(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i - 1] + arr[i];
        }
        return arr;
    }

    // Prefix sum with queries (1-based index)
    static void prefixSumWithQueries(Scanner sc) {
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n + 1];
        System.out.println("Enter " + n + " elements:");
        for (int i = 1; i <= n; i++) {
            arr[i] = sc.nextInt();
        }
        int[] prefsum = makePrefixSum(arr);
        System.out.println("Enter number of queries:");
        int q = sc.nextInt();
        while (q-- > 0) {
            System.out.println("Enter range:");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans = prefsum[r] - prefsum[l - 1];
            System.out.println("sum " + ans);
        }
    }

    // Equal sum partition
    static boolean equalSumPartition(int[] arr) {
        int totalSum = 0;
        for (int num : arr) totalSum += num;
        int prefixSum = 0;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            int suffixSum = totalSum - prefixSum;
            if (suffixSum == prefixSum) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Demo for prefix sum in same array
        System.out.println("Prefix sum in same array:");
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] prefix = makePrefixSum(arr1.clone());
        for (int x : prefix) System.out.print(x + " ");
        System.out.println();

        // Demo for prefix sum with queries
        prefixSumWithQueries(sc);

        // Demo for equal sum partition
        System.out.println("Enter size for equal sum partition:");
        int n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();
        System.out.println("Equal partition possible: " + equalSumPartition(arr2));
        sc.close();
    }
}
