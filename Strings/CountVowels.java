package Strings;

import java.util.Scanner;

// Q.1 Counting the vowel in string
public class CountVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            if (isVowel(ch))
                count++;
        }
        System.out.print(count);
        sc.close();
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'A')
            return true;
        if (ch == 'e' || ch == 'E')
            return true;
        if (ch == 'i' || ch == 'I')
            return true;
        if (ch == 'o' || ch == 'O')
            return true;
        if (ch == 'u' || ch == 'U')
            return true;
        return false;
    }
}
