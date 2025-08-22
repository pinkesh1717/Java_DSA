package Strings;

import java.util.Scanner;

// Q.3 Take integer input and convert it into a string
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int a = sc.nextInt();
        String s = "" + a;
        System.out.println(s);
        sc.close();
    }
}
