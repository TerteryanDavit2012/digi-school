public class Lesson {
    public static void main(String[] args) {

        int a = 20;
        int x = 10, y = 15, z = 5;
        //21
        if (x > z && x > y) {
            System.out.println(x);
        } else if (y > z && y > x) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
        //22
        if (x < z && x < y) {
            System.out.println(x);
        } else if (y < z && y < x) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }
        //23
        if (x == 1 || y == 1 || z == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //24
        if ((x == 2 && y == 2) || (x == 2 && z == 2) || (z == 2 && y == 2)) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //25
        if ((x + y >= z) || (x + z >= y) || (z + y >= x)) {
            System.out.println(y = 1);
        } else
            System.out.println(y = 2);
        //26
        if (x % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if (y % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        if (z % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }
        y = 15;
        //27
        if (y - x == z - y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //28
        if (y * y == x * z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //29
        if (x <= y && y <= z)
            System.out.println(x + " " + y + " " + z);

        if (x <= z && z <= y)
            System.out.println(x + " " + z + " " + y);

        if (y <= x && x <= z)
            System.out.println(y + " " + x + " " + z);

        if (y <= z && z <= x)
            System.out.println(y + " " + z + " " + x);

        if (z <= x && x <= y)
            System.out.println(z + " " + x + " " + y);

        if (z <= y && y <= x)
            System.out.println(z + " " + y + " " + x);
        //30
        if (x >= y && y >= z)
            System.out.println(x + " " + y + " " + z);

        if (x >= z && z >= y)
            System.out.println(x + " " + z + " " + y);

        if (y >= x && x >= z)
            System.out.println(y + " " + x + " " + z);

        if (y >= z && z >= x)
            System.out.println(y + " " + z + " " + x);

        if (z >= x && x >= y)
            System.out.println(z + " " + x + " " + y);
        if (z >= y && y >= x)
            System.out.println(z + " " + y + " " + x);
        //31
        if (x > z && x > y && x > a) {
            System.out.println(x);
        } else if (y > z && y > x && y > a) {
            System.out.println(y);
        } else if (y > z && y > x && x > a) {
            System.out.println(z);
        } else {
            System.out.println(a);
            //32
            if (x < z && x < y && x < a) {
                System.out.println(x);
            } else if (y < z && y < x && y < a) {
                System.out.println(y);
            } else if (z < x && z < y && z < a) {
                System.out.println(z);
            } else {
                System.out.println(a);
            }
            //33
            if (x == 1 || y == 1 || z == 1 || a == 1) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //34
            if (x + y == z + a || x + z == y + a || x + a == y + z) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //35
            if (x == y + z + a || y == x + z + a || z == x + y + a || a == x + y + z) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //36
            if (x % 2 == 1 && y % 2 == 1) {
                System.out.println(2);
            } else if (x % 2 == 1 && z % 2 == 1) {
                System.out.println(2);
            } else if (x % 2 == 1 && a % 2 == 1) {
                System.out.println(2);
            } else {
                System.out.println(1);
            }
            //37
            if ((y - a ==  - b) && (c - y == d - c)) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //38
            if (x != 0 && y != 0 && z != 0 &&
                    y * y == x * z &&
                    z * z == y * a) {
                System.out.println(true);
            } else {
                System.out.println(false);
            }
            //39
            if (a <= x && x <= y && y <= z) {
                System.out.println(a + " " + x + " " + y + " " + z);
            }
            if (a <= x && x <= z && z <= y) {
                System.out.println(a + " " + x + " " + z + " " + y);
            }
            if (a <= y && y <= x && x <= z) {
                System.out.println(a + " " + y + " " + x + " " + z);
            }
            if (a <= y && y <= z && z <= x) {
                System.out.println(a + " " + y + " " + z + " " + x);
            }
            if (a <= z && z <= x && x <= y) {
                System.out.println(a + " " + z + " " + x + " " + y);
            }
            if (a <= z && z <= y && y <= x) {
                System.out.println(a + " " + z + " " + y + " " + x);
            }
            if (x <= a && a <= y && y <= z) {
                System.out.println(x + " " + a + " " + y + " " + z);
            }
            if (x <= a && a <= z && z <= y) {
                System.out.println(x + " " + a + " " + z + " " + y);
            }
            if (x <= y && y <= a && a <= z) {
                System.out.println(x + " " + y + " " + a + " " + z);
            }
            if (x <= y && y <= z && z <= a) {
                System.out.println(x + " " + y + " " + z + " " + a);
            }
            if (x <= z && z <= a && a <= y) {
                System.out.println(x + " " + z + " " + a + " " + y);
            }
            if (x <= z && z <= y && y <= a) {
                System.out.println(x + " " + z + " " + y + " " + a);
            }
            if (y <= a && a <= x && x <= z) {
                System.out.println(y + " " + a + " " + x + " " + z);
            }
            if (y <= a && a <= z && z <= x) {
                System.out.println(y + " " + a + " " + z + " " + x);
            }
            if (y <= x && x <= a && a <= z) {
                System.out.println(y + " " + x + " " + a + " " + z);
            }
            if (y <= x && x <= z && z <= a) {
                System.out.println(y + " " + x + " " + z + " " + a);
            }
            if (y <= z && z <= a && a <= x) {
                System.out.println(y + " " + z + " " + a + " " + x);
            }
            if (y <= z && z <= x && x <= a) {
                System.out.println(y + " " + z + " " + x + " " + a);
            }
            if (z <= a && a <= x && x <= y) {
                System.out.println(z + " " + a + " " + x + " " + y);
            }
            if (z <= a && a <= y && y <= x){
                System.out.println(z + " " + a + " " + y + " " + x);
            }
            if (z <= x && x <= a && a <= y) {
                System.out.println(z + " " + x + " " + a + " " + y);
            }
            if (z <= x && x <= y && y <= a) {
                System.out.println(z + " " + x + " " + y + " " + a);
            }
            if (z <= y && y <= a && a <= x) {
                System.out.println(z + " " + y + " " + a + " " + x);
            }
            if (z <= y && y <= x && x <= a) {
                System.out.println(z + " " + y + " " + x + " " + a);
            }
            //40
            if (a >= x && x >= y && y >= z) {
                System.out.println(a + " " + x + " " + y + " " + z);
            }
            if (a >= x && x >= z && z >= y) {
                System.out.println(a + " " + x + " " + z + " " + y);
            }
            if (a >= y && y >= x && x >= z) {
                System.out.println(a + " " + y + " " + x + " " + z);
            }
            if (a >= y && y >= z && z >= x) {
                System.out.println(a + " " + y + " " + z + " " + x);
            }
            if (a >= z && z >= x && x >= y) {
                System.out.println(a + " " + z + " " + x + " " + y);
            }
            if (a >= z && z >= y && y >= x) {
                System.out.println(a + " " + z + " " + y + " " + x);
            }
            if (x >= a && a >= y && y >= z) {
                System.out.println(x + " " + a + " " + y + " " + z);
            }
            if (x >= a && a >= z && z >= y) {
                System.out.println(x + " " + a + " " + z + " " + y);
            }
            if (x >= y && y >= a && a >= z) {
                System.out.println(x + " " + y + " " + a + " " + z);
            }
            if (x >= y && y >= z && z >= a) {
                System.out.println(x + " " + y + " " + z + " " + a);
            }
            if (x >= z && z >= a && a >= y) {
                System.out.println(x + " " + z + " " + a + " " + y);
            }
            if (x >= z && z >= y && y >= a) {
                System.out.println(x + " " + z + " " + y + " " + a);
            }
            if (y >= a && a >= x && x >= z) {
                System.out.println(y + " " + a + " " + x + " " + z);
            }
            if (y >= a && a >= z && z >= x) {
                System.out.println(y + " " + a + " " + z + " " + x);
            }
            if (y >= x && x >= a && a >= z) {
                System.out.println(y + " " + x + " " + a + " " + z);
            }
            if (y >= x && x >= z && z >= a) {
                System.out.println(y + " " + x + " " + z + " " + a);
            }
            if (y >= z && z >= a && a >= x) {
                System.out.println(y + " " + z + " " + a + " " + x);
            }
            if (y >= z && z >= x && x >= a) {
                System.out.println(y + " " + z + " " + x + " " + a);
            }
            if (z >= a && a >= x && x >= y) {
                System.out.println(z + " " + a + " " + x + " " + y);
            }
            if (z >= a && a >= y && y >= x){
                System.out.println(z + " " + a + " " + y + " " + x);
            }
            if (z >= x && x >= a && a >= y) {
                System.out.println(z + " " + x + " " + a + " " + y);
            }
            if (z >= x && x >= y && y >= a) {
                System.out.println(z + " " + x + " " + y + " " + a);
            }
            if (z >= y && y >= a && a >= x) {
                System.out.println(z + " " + y + " " + a + " " + x);
            }
            if (z >= y && y >= x && x >= a) {
                System.out.println(z + " " + y + " " + x + " " + a);
            }

        }
    }
}