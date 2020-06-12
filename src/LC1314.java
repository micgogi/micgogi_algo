import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/12/2020  10:35 AM
 * Rahul Gogyani
 */
public class LC1314 {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int m = mat.length;
        int n = mat[0].length;
        int sum[][] = new int[m+1][n+1];
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                sum[i][j] = mat[i - 1][j - 1] + sum[i - 1][j] + sum[i][j - 1] - sum[i - 1][j - 1];
            }
        }
        int k = 1;
        int[][] ans = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int r1 = Math.max(0, i - k), c1 = Math.max(0, j - k);
                int r2 = Math.min(m - 1, i + k), c2 = Math.min(n - 1, j + k);
                r1++;
                c1++;
                r2++;
                c2++;
                ans[i][j] = sum[r2][c2] - sum[r2][c1 - 1] - sum[r1 - 1][c2] + sum[r1 - 1][c1 - 1];


            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
