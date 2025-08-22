package Array;

public class arrayExample {
    void multiarrays() {
        int[][] arr = { { 44, 55, 66 }, { 65, 54, 43 }, { 90, 80, 70 } };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }

    void demoArrays() {
        int[] ages = new int[3];
        float[] weight = new float[3];
        String[] names = new String[3];

        ages[0] = 45;
        ages[1] = 55;
        ages[2] = 65;

        weight[0] = 75.0f;
        weight[1] = 69.9f;
        weight[2] = 65.5f;

        names[0] = "Hanuman";
        names[1] = "Shyam";
        names[2] = "Ram";

        for (int i = 0; i < ages.length; i++) {
            System.out.println(ages[i]);
        }

        for (int age : ages) {
            System.out.println(age);
        }

        int i = 0;
        while (i < 3) {
            System.out.println(ages[i]);
            i = i + 1;
        }

        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);

        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
    }

    public static void main(String[] args) {
        arrayExample obj = new arrayExample();
        obj.multiarrays();
        obj.demoArrays();
    }
}
