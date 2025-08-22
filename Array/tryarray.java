package Array;
//import java.util.Scanner;

import java.util.Arrays;

public class tryarray {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
        System.out.println();

    }

    public static void main(String[] arg) {
        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the size of array:");
        // int n=sc.nextInt();
        int[] arr = new int[5];
        // System.out.println("Enter" + n +" element:");
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        arr[3] = 9;
        arr[4] = 11;
        // for(int i=0;i<arr.length;i++){
        // arr[i]=sc.nextInt();
        // }
        // for(int i=0;i<4;i++){
        // System.out.print(arr[i] + " ");
        System.out.println("Original array :");
        printarray(arr);
        // trying to copy the array.
        // int[] arr_2 = arr; // known as shallow copy.
        // int[]arr_2=arr.clone(); // known as deep copy.
        // int[]arr_2=Arrays.copyOf(arr,arr.length);
        // int[]arr_2=Arrays.copyOf(arr, 3);
        int[] arr_2 = Arrays.copyOfRange(arr, 0, 4);
        System.out.println("Copied array:");

        printarray(arr_2);
        arr_2[1] = 0;
        arr_2[2] = 0;
        System.out.println("Original array after changing in arr_2");
        printarray(arr);
        System.out.println("Copied array after changing in arr_2");
        printarray(arr_2);

    }
}
