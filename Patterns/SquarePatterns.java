package Patterns;

import java.util.Scanner;

public class SquarePatterns {
    public static void printAlphabetSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void printAlphabetTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }
    }

    public static void printNumberSquare(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printNumberTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void printMixtureTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j + 64) + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Alphabet Square:");
        printAlphabetSquare(n);
        System.out.println("\nAlphabet Triangle:");
        printAlphabetTriangle(n);
        System.out.println("\nNumber Square:");
        printNumberSquare(n);
        System.out.println("\nNumber Triangle:");
        printNumberTriangle(n);
        System.out.println("\nMixture Triangle:");
        printMixtureTriangle(n);
        sc.close();
    }
}
