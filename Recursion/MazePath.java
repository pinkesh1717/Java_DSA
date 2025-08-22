package Recursion;

import java.util.Scanner;

public class MazePath {
    public static int maze(int row, int col, int n, int m) {
        if (row == m || col == n)
            return 1;
        int rightways = maze(row, col + 1, m, n);
        int leftways = maze(row + 1, col, m, n);
        return rightways + leftways;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        System.out.println(maze(1, 1, m, n));
        sc.close();
    }
}
