package Recursion;

import java.util.Stack;

public class PreviousGreaterElement {
    public static void prevGreater(int[] arr, int n) {
        Stack<Integer> s = new Stack<>();
        s.push(arr[0]);
        System.out.print("-1 ");
        for (int i = 1; i < n; i++) {
            while (!s.isEmpty() && s.peek() <= arr[i])
                s.pop();
            if (s.isEmpty())
                System.out.print("-1 ");
            else
                System.out.print(s.peek() + " ");
            s.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        prevGreater(arr, n);
    }
}
