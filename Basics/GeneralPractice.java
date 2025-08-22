package Basics;
import java.util.Scanner;

public class GeneralPractice {
    // Sum of digits
    static void sumOfDigits(Scanner sc) {
        System.out.println("Enter any number:");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0) {
            int ld = n % 10;
            sum = sum + ld;
            n /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }

    // Age group
    static void ageGroup(Scanner sc) {
        System.out.println("Enter the age:");
        int age = sc.nextInt();
        if (age <= 0) {
            System.out.println("INVALID INPUT");
        } else if (age >= 1 && age <= 10) {
            System.out.println("CHILD");
        } else if (age >= 11 && age <= 25) {
            System.out.println("ADULT");
        } else {
            System.out.println("SENIOR CITIZENS");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sumOfDigits(sc);
        ageGroup(sc);
        sc.close();
    }
}
