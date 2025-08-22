package Patterns;

import java.util.Scanner;

public class TrianglePatterns {
    public static void printStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printOppositeTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n + 1 - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printSpecialTriangleIncremental(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a++;
            }
            System.out.println();
        }
    }

    public static void printSpecialTriangleOdd(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 2 * i - 1; j += 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printFlippedStarTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j > n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void printBinaryTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(1 + " ");
                } else {
                    System.out.print(0 + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Star Triangle:");
        printStarTriangle(n);
        System.out.println("\nOpposite Triangle:");
        printOppositeTriangle(n);
        System.out.println("\nSpecial Triangle (Incremental):");
        printSpecialTriangleIncremental(n);
        System.out.println("\nSpecial Triangle (Odd Numbers):");
        printSpecialTriangleOdd(n);
        System.out.println("\nFlipped Star Triangle:");
        printFlippedStarTriangle(n);
        System.out.println("\nBinary Triangle:");
        printBinaryTriangle(n);
        sc.close();
    }
}
