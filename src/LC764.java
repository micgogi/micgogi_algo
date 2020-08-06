import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/6/2020  12:15 PM
 * Rahul Gogyani
 */
public class LC764 {
    public static void main(String args[]) {
        int N = 5;
        int mines[][] = {{4, 2}};
        System.out.println(orderOfLargestPlusSign(5, mines));

    }

    public static int orderOfLargestPlusSign(int N, int[][] mines) {
        int[][] dp = new int[N][N];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], N);
        }
        for (int min[] : mines) {
            dp[min[0]][min[1]] = 0;
        }
        System.out.println(Arrays.deepToString(dp));
        for (int i = 0; i < N; i++) {
            //left t0 right
            for (int j = 0, l = 0; j < N; j++) {
                dp[i][j] = Math.min(dp[i][j], l = (dp[i][j] == 0 ? 0 : l + 1));
            }
            //right to left
            for (int j = N - 1, r = 0; j >= 0; j--) {
                dp[i][j] = Math.min(dp[i][j], r = (dp[i][j] == 0 ? 0 : r + 1));
            }
            //top to bottom
            for (int j = 0, t = 0; j < N; j++) {
                dp[j][i] = Math.min(dp[j][i], t = (dp[j][i] == 0 ? 0 : t + 1));
            }
            //bottom to top
            for (int j = N - 1, d = 0; j >= 0; j--) {
                dp[j][i] = Math.min(dp[j][i], d = (dp[j][i] == 0 ? 0 : d + 1));
            }

        }
        System.out.println(Arrays.deepToString(dp));
        int res = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;

    }
}

