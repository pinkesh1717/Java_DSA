package Array;

public class ReverseArrayDemo {
    static int[] reverseArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        int j = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] ans = reverseArray(arr);
        System.out.println("The reversed array is:");
        for (int value : ans) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
