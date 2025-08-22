package Patterns;

import java.util.Scanner;

public class CompositePatterns {
    public static void printStarFlippedTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void printRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printStarPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumberPyramidPalindrome(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printStarBridge(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printNumberStarBridge(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        n--;
        for (int i = 1; i <= n; i++) {
            int a = 1;
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("  ");
                a++;
            }
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print(a++ + " ");
            }
            System.out.println();
        }
    }

    public static void printStarDiamond(int n) {
        int nsp = n - 1, nst = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp--;
            nst += 2;
        }
        nsp = 1;
        nst = nst - 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            System.out.println();
            nsp++;
            nst -= 2;
        }
    }

    public static void printNumberSpiral(int n) {
        for (int i = 1; i <= 2 * n - 1; i++) {
            for (int j = 1; j <= 2 * n - 1; j++) {
                int a = i, b = j;
                if (i > n)
                    a = 2 * n - i;
                if (j > n)
                    b = 2 * n - j;
                System.out.print(n + 1 - Math.min(a, b) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Star Flipped Triangle:");
        printStarFlippedTriangle(n);
        System.out.println("\nRhombus:");
        printRhombus(n);
        System.out.println("\nStar Pyramid:");
        printStarPyramid(n);
        System.out.println("\nNumber Pyramid Palindrome:");
        printNumberPyramidPalindrome(n);
        System.out.println("\nStar Bridge:");
        printStarBridge(n);
        System.out.println("\nNumber Star Bridge:");
        printNumberStarBridge(n);
        System.out.println("\nStar Diamond:");
        printStarDiamond(n);
        System.out.println("\nNumber Spiral:");
        printNumberSpiral(n);
        sc.close();
    }
}
