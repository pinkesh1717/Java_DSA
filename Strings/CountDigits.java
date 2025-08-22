package Strings;

import java.util.Scanner;

// Q.4 Return a total number of digit in a number without using any loop
public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any integer: ");
        int a = sc.nextInt();
        String s = Integer.toString(a);
        System.out.println(s.length());
        sc.close();
    }
}
