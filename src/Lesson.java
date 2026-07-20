public class Lesson {
    public static void main(String[] args) {

        int[] arr = {12, 5, 7, 15, 20, 9, 4, 18, 11, 25};
        int m = 5;
        int n = 4;

        // 240
        int count240 = 0;
        for (int x : arr) {
            if (x % 7 == 0) {
                count240++;
            }
        }
        System.out.println(count240);

        // 241
        int sum241 = 0;
        for (int x : arr) {
            if (x % n == 0) {
                sum241 += x;
            }
        }
        System.out.println(sum241);

        // 242
        int result242 = 1;
        for (int x : arr) {
            if (x % m == 0) {
                result242 *= x;
            }
        }
        System.out.println(result242);

        // 243
        int count243 = 0;
        for (int x : arr) {
            if (x % n == 0) {
                count243++;
            }
        }
        System.out.println(count243);

        // 244
        int result244 = 1;
        for (int x : arr) {
            if (x % 5 == 2) {
                result244 *= x;
            }
        }
        System.out.println(result244);

        // 245
        int sum245 = 0;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] + i) % 3 == 0) {
                sum245 += arr[i] * arr[i];
            }
        }
        System.out.println(sum245);

        // 246
        int sum246 = 0;
        int count246 = 0;
        for (int i = 0; i < arr.length; i++) {
            int j = 1;
            while (j * j < arr.length) {
                if (i == j * j) {
                    sum246 += arr[i];
                    count246++;
                }
                j++;
            }
        }
        if (count246 > 0)
            System.out.println((double) sum246 / count246);

        // 247
        int sum247 = 0;
        int count247 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > i) {
                sum247 += arr[i] * arr[i];
                count247++;
            }
        }
        if (count247 > 0)
            System.out.println(Math.sqrt((double) sum247 / count247));

        // 248
        int sum248 = 0;
        for (int i = 0; i < arr.length; i++) {
            int s = arr[i] + i;
            if ((s * s) % n == 0) {
                sum248 += arr[i];
            }
        }
        System.out.println(sum248);

        // 249
        int count249 = 0;
        for (int i = 0; i < arr.length; i++) {
            int d = arr[i] - i;
            if (d < 0) d = -d;
            if (d > n) {
                count249++;
            }
        }
        System.out.println(count249);

        // 250
        int result250 = 1;
        for (int i = 0; i < arr.length; i++) {
            if ((arr[i] * i) % 3 == 2) {
                result250 *= arr[i] * arr[i];
            }
        }
        System.out.println(result250);

        // 251
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        // 262
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
        int[] arr1 = {12, -5, 7, 15, 20, -9, 4, 18, 11, 25};


        int[] arr2 = {12, -5, 7, 15, 20, -9, 4, 18, 11, 25};

        //254
        int max1 = arr2[0];
        int min1 = arr2[0];

        for (int x : arr2) {
            if (x > max1) max1 = x;
            if (x < min1) min1 = x;
        }
        System.out.println(max1 * min1);

        //255
        int maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr2[i] > arr2[maxIndex]) {
                maxIndex = i;
            }
        }
        System.out.println(arr2[maxIndex] + maxIndex);

        //256
        int minIndex = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[minIndex]) {
                minIndex = i;
            }
        }
        System.out.println(arr2[minIndex] + minIndex);

        //257
        int firstMax = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] > arr2[firstMax]) {
                firstMax = i;
            }
        }
        System.out.println(firstMax);

        //258
        int lastMax = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] >= arr2[lastMax]) {
                lastMax = i;
            }
        }
        System.out.println(lastMax);

        //259
        int firstMin = 0;
        for (int i = 1; i < arr2.length; i++) {
            if (arr2[i] < arr2[firstMin]) {
                firstMin = i;
            }
        }
        System.out.println(firstMin);

        //260
        int lastMin = 0;
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] <= arr2[lastMin]) {
                lastMin = i;
            }
        }
        System.out.println(lastMin);

        int[] X = {2, -4, 6, 8, -10, 7};
        int[] Y = {5, -3, 9, 4, 2, 1};

        //261
        double sumX = 0;
        double sumY = 0;

        for (int x : X) sumX += x;
        for (int y : Y) sumY += y;

        double avgX = sumX / X.length;
        double avgY = sumY / Y.length;

        System.out.println(avgX * avgY);

        //263
        int positive = 0;
        for (int x : X)
            if (x > 0) positive++;

        for (int y : Y)
            if (y > 0) positive++;

        System.out.println(positive);

        //264
        int negX = 0;
        int negY = 0;

        for (int x : X)
            if (x < 0) negX++;

        for (int y : Y)
            if (y < 0) negY++;

        System.out.println(negX);
        System.out.println(negY);

        //265
        int sum = 0;
        int product = 1;

        for (int x : X) sum += x;
        for (int y : Y) product *= y;

        System.out.println((double) sum / product);

        //266
        int oddSum = 0;
        int evenSum = 0;

        for (int x : X)
            if (x % 2 != 0) oddSum += x;

        for (int y : Y)
            if (y % 2 == 0) evenSum += y;

        System.out.println(oddSum - evenSum);

        //267
        int sum7 = 0;

        for (int x : X)
            if (x % 7 == 0) sum7 += x;

        for (int y : Y)
            if (y % 7 == 0) sum7 += y;

        System.out.println(sum7);

        //268
        int n1 = 3;
        int count = 0;

        for (int x : X)
            if (x % n1 == 0) count++;

        for (int y : Y)
            if (y % n1 == 0) count++;

        System.out.println(count);

        //269
        int total = 0;

        for (int i = 0; i < X.length; i++)
            if (i % 2 == 0) total += X[i];

        for (int i = 0; i < Y.length; i++)
            if (i % 2 != 0) total += Y[i];

        System.out.println(total);

        //270
        int squareSum = 0;

        for (int x : X)
            squareSum += x * x;

        for (int y : Y)
            squareSum += y * y;

        System.out.println(squareSum);
    }
}

