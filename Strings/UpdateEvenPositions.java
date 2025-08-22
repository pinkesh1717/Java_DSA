package Strings;

import java.util.Scanner;

// Q.5 Input a string and update all the even position in the string to character 'a'.
public class UpdateEvenPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String str = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                str += 'a';
            } else {
                str += s.charAt(i);
            }
        }
        System.out.println(str);
        sc.close();
    }
}
