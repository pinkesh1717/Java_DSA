


package Array;

import java.util.Scanner;

public class ArrayBasics {
    public static void inputAndPrintArray() {
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i <= 4; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        sc.close();
    }

    public static void main(String[] args) {
        System.out.println("Input and print array:");
        inputAndPrintArray();
    }
}
