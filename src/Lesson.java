public class Lesson {
    public static void main(String[] args) {
                int n3 = 357;
                int n4 = 4567;
                int k = 200;

                int x = n3 / 100;
                int y = (n3 / 10) % 10;
                int z = n3 % 10;

                //51
                boolean a = (z == x + y);
                System.out.println(a);

                //52
                boolean b = (x == y || x == z || y == z);
                System.out.println(b);

                //53
                if (n3 > k) {
                    System.out.println((double)n3 / (x + y + z));
                }
                else {
                    System.out.println((double)z / n3);
                }

                //54
                int max = x;
                if (y > max) {
                    max = y;
                }
                if (z > max) {
                    max = z;
                }
                System.out.println(max);

                //55
                int min = x;
                if (y < min) {
                    min = y;
                }
                if (z < min) {
                    min = z;
                }
                System.out.println(min);

                //56
                if (z > y) {
                    System.out.println((double)(x + y + z) / n3);
                }
                else {
                    System.out.println(n3);
                }

                //57
                if (n3 > 300) {
                    System.out.println((double)y / z);
                }
                else {
                    System.out.println((double)x / z);
                }

                //58
                char f;
                if (x + y < 5) {
                    f = 'a';
                }
                else {
                    f = 'b';
                }
                System.out.println(f);

                int a4 = n4 / 1000;
                int b4 = (n4 / 100) % 10;
                int c4 = (n4 / 10) % 10;
                int d4 = n4 % 10;

                //61
                boolean c = (c4 + d4 == a4 + b4);
                System.out.println(c);

                //62
                if (n4 < 5000) {
                    System.out.println((double)n4 / (d4 + b4));
                }
                else {
                    System.out.println((double)n4 / (a4 + c4));
                }

                //63
                if (a4 == 1 || b4 == 1 || c4 == 1 || d4 == 1) {
                    System.out.println(1);
                }
                else {
                    System.out.println(0);
                }

                //64
                char s;
                if (c4 + d4 == 5) {
                    s = 's';
                }
                else {
                    s = 'd';
                }
                System.out.println(s);

                //65
                if (c4 * d4 == 12) {
                    System.out.println("y=12");
                }
                else {
                    System.out.println("y=0");
                }

                //66
                if (a4 == 4 || d4 == 4) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

                //67
                int sum = a4 + b4 + c4 + d4;
                if (n4 == sum * sum) {
                    System.out.println("YES");
                }
                else {
                    System.out.println("NO");
                }

                //68
                if (d4 > c4) {
                    System.out.println(d4 * b4);
                }
                else {
                    System.out.println(1);
                }

                //69
                int q;
                if (a4 + b4 + c4 + d4 > 20) {
                    q = 1;
                }
                else {
                    q = 0;
                }
                System.out.println(q);

                //70
                if (a4 * b4 * c4 * d4 > 200) {
                    q = a4 * b4 * c4 * d4;
                }
                else {
                    q = 1;
                }
                System.out.println(q);
            }
        }