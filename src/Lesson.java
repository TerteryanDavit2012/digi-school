public class Lesson {
    public static void main(String[] args) {

        // 1
        int[] arr1 = new int[2];

        arr1[0] = 5;
        arr1[1] = 10;

        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }

        // 2
        int[] arr2 = new int[1000];

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        System.out.println();

        // 3
        int[] arr3 = new int[20];
        int index = 0;

        for (int i = -19; i <= 19; i += 2) {
            arr3[index] = i;
            index++;
        }

        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }

        System.out.println();

        // 4
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 5 == 0) {
                System.out.print(arr2[i] + " ");
            }
        }

        System.out.println();

        // 5
        double[] arr5 = {10.5, 24.12, 50.3, 100.5, 300.8, 467.23, 500.0};

        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] >= 24.12 && arr5[i] <= 467.23) {
                System.out.println(arr5[i]);
            }
        }

        // 6
        int count = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] % 2 == 0) {
                count++;
            }
        }

        System.out.println(count);

        // 7
        int n = 2;

        if (n >= 1 && n <= 20) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " x " + i + " = " + (n * i));
            }
        }
    }
}