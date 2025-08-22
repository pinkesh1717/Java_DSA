package Basics;
import java.util.Scanner;

public class NumberSystem {
    // Convert binary to decimal
    static int binaryToDecimal(int binary_num) {
        int ans = 0;
        int pw = 1;
        while (binary_num > 0) {
            int unit_digit = binary_num % 10;
            ans += (unit_digit * pw);
            binary_num /= 10;
            pw *= 2;
        }
        return ans;
    }

    // Convert decimal to binary
    static int decimalToBinary(int decimal_num) {
        int ans = 0;
        int pw = 1;
        while (decimal_num > 0) {
            int parity = decimal_num % 2;
            ans += (parity * pw);
            pw *= 10;
            decimal_num /= 2;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int binaryInput = sc.nextInt();
        System.out.println("Binary to Decimal: " + binaryToDecimal(binaryInput));

        System.out.println("Enter a decimal number:");
        int decimalInput = sc.nextInt();
        System.out.println("Decimal to Binary: " + decimalToBinary(decimalInput));
        sc.close();
    }
}
