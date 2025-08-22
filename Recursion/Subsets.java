package Recursion;

import java.util.ArrayList;

public class Subsets {
    static ArrayList<String> arr = new ArrayList<>();

    public static void printsubsets(int i, String s, String ans) {
        if (i == s.length()) {
            arr.add(ans);
            return;
        }
        char ch = s.charAt(i);
        printsubsets(i + 1, s, ans);
        printsubsets(i + 1, s, ans + ch);
    }

    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>();
        printsubsets(0, s, "");
        System.out.println(arr);
    }
}
