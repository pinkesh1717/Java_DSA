package Array;

public class referencearray {
    static void change_array(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            arr[i] = 0;
        }
    }

    static void change_val(int a) {
        a = 9999;
    }

    public static void main(String[] arg) {
        int a = 5;
        change_val(a);
        System.out.println(a);
        int[] arr = new int[3];
        arr[0] = 2;
        arr[1] = 3;
        arr[2] = 9;
        change_array(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
