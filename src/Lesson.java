public class Lesson {
    public static void main(String[] args) {

        int[] arr = {5, -3, 8, -2, 10, 4, -6, 7, 0, 12};

        int a = 2;
        int b = 8;
        int c = -4;
        int d = 10;
        int k = 2;

        //211
        double sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0)
            System.out.println(sum / count);

        //214
        sum = 0;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0)
            System.out.println(sum / count);

        //215
        int sum1 = 0;
        for (int i = 0; i < arr.length; i += 2)
            sum1 += arr[i];
        System.out.println(sum1);

        //216
        int p = 1;
        for (int i = 0; i < arr.length; i += 2)
            p *= arr[i];
        System.out.println(p);

        //219
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0)
                count++;
        }
        System.out.println(count);

        //221
        sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= a && arr[i] <= b)
                sum1 += arr[i];
        }
        System.out.println(sum1);

        //222
        p = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > c && arr[i] < d)
                p *= arr[i];
        }
        System.out.println(p);

        //223
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a && arr[i] < b)
                count++;
        }
        System.out.println(count);
        //227
        sum = 0;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0)
            System.out.println(sum / count);

//228
        sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % k == 0)
                sum1 += arr[i];
        }
        System.out.println(sum1);

//229
        p = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] - i > 0)
                p *= arr[i];
        }
        System.out.println(p);

//231
        sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                sum1 += arr[i] * arr[i];
        }
        System.out.println(sum1);

//232
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0)
                count++;
        }
        System.out.println(count);

//233
        p = 1;
        sum1 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                p *= arr[i];
                sum1 += arr[i];
            }
        }
        System.out.println(p);
        System.out.println(sum1);

//234
        sum = 0;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0)
            System.out.println(sum / count);

//236
        p = 1;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                p *= arr[i];
                count++;
            }
        }
        System.out.println(count);
        System.out.println(p);

//237
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                count++;
        }
        System.out.println(count);

//238
        sum = 0;
        count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                sum += arr[i];
                count++;
            }
        }
        if (count > 0)
            System.out.println(sum / count);
    }
}