
package Array;

public class ReverseArray {
	// Method 1: Reverse entire array
	public static void reverseFullArray(int[] arr) {
		int i = 0, j = arr.length - 1;
		while (i < j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	// Method 2: Reverse a subarray (from i to j)
	public static void reverseSubArray(int[] arr, int i, int j) {
		while (i <= j) {
			swap(arr, i, j);
			i++;
			j--;
		}
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr1 = {1, 2, 3, 4, 5};
		System.out.print("Original: ");
		for (int x : arr1) System.out.print(x + " ");
		reverseFullArray(arr1);
		System.out.print("\nReversed: ");
		for (int x : arr1) System.out.print(x + " ");
		System.out.println();

		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90};
		System.out.print("\nOriginal: ");
		for (int x : arr2) System.out.print(x + " ");
		reverseSubArray(arr2, 1, 6);
		System.out.print("\nSubarray reversed (1-6): ");
		for (int x : arr2) System.out.print(x + " ");
		System.out.println();
	}
}
