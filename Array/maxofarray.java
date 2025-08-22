package Array;

public class maxofarray {
    void maximun() {
        int[] arr = { 5, 3, 6, 4, 9, 1 };
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
            System.out.println(ans);
        }
    }

    public static void main(String[] arg) {
        maxofarray obj = new maxofarray();
        obj.maximun();
    }
}
