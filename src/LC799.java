

/**
 * @author Micgogi
 * on 10/26/2020  1:23 PM
 * Rahul Gogyani
 */
public class LC799 {
    public static void main(String args[]) {
        System.out.println(champagneTower(100000009, 33, 17));
    }

    public static double champagneTower(int poured, int query_row, int query_glass) {
        double[][] a = new double[101][101];
        a[0][0] = poured;
        for (int i = 0; i <= query_row; i++) {
            for (int j = 0; j <= i; j++) {
                double q = (a[i][j] - 1.0) / 2;
                if (q > 0) {
                    a[i + 1][j] += q;
                    a[i + 1][j + 1] += q;
                }
            }
        }
        return Math.min(1, a[query_row][query_glass]);
    }
}

