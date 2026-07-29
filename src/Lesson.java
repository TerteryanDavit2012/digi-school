
  public class Lesson {
    public static void main(String[] args) {
        int[][] m = {
                {1, 2, 3, 4},
                {4, 3, 2, 1},
                {2, 1, 4, 3},
                {4, 3, 1, 2}
        };
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i + j >= m.length - 1) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();

        }
        System.out.println();
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m.length; j++) {
                if (i + j < m.length && i <= 1) {
                    System.out.print(m[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    };
}