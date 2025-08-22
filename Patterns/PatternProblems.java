package Patterns;
import java.util.Scanner;

public class PatternProblems {
    // Print rectangle pattern
    static void rectanglePattern(Scanner sc) {
        System.out.println("Enter rows and columns:");
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // Print right-aligned triangle pattern
    static void rightAlignedTriangle(Scanner sc) {
        System.out.println("Enter n:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        rectanglePattern(sc);
        rightAlignedTriangle(sc);
        sc.close();
    }
}
