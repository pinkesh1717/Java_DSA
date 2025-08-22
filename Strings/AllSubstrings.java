package Strings;

import java.util.Scanner;

// Q.2 Input a string and print all the substring of that string
public class AllSubstrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any string : ");
        String str = sc.nextLine();
        int n = str.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                System.out.print(str.substring(i, j) + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
