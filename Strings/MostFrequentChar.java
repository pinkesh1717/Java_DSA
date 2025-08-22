package Strings;

import java.util.Scanner;

// Q.9 Given a string consisting of lowercase English alphabet. Print the character that is occurring most number of times.
public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int idx = (int) ch - 97;
            freq[idx]++;
        }
        int maxfreq = 0;
        for (int i = 0; i < freq.length; i++) {
            maxfreq = Math.max(maxfreq, freq[i]);
        }
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] == maxfreq) {
                char ch = (char) (i + 97);
                System.out.print(ch + " ");
            }
        }
        sc.close();
    }
}
