import java.util.Scanner;

/**
 * @author Micgogi
 * on 5/2/2020  10:18 PM
 * Rahul Gogyani
 */
public class PP2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        int[] c = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            c[i] = scanner.nextInt();
        }

        int[][] costs = new int[n + 1][m + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                costs[i][j] = scanner.nextInt();
            }
        }

        System.out.println(minPaint(n, m, k, c, costs));
    }

    private static long minPaint(
            int numTrees,
            int numColors,
            int target,
            int[] initialColors,
            int[][] costs) {

        // dp[i][j][k] = minimum cost to color first i trees with beauty j,
        //               if the ith tree has color k
        long[][][] dp = new long[numTrees + 1][target + 1][numColors + 1];

        for (int i = 0; i <= numTrees; i++) {
            for (int j = 0; j <= target; j++) {
                for (int k = 0; k <= numColors; k++) {
                    dp[i][j][k] = Long.MAX_VALUE;
                }
            }
        }

        // Base case
        for (int k = 1; k <= numColors; k++) {
            dp[0][0][k] = 0;
        }

        // Recursive case
        for (int i = 1; i <= numTrees; i++) {
            for (int j = 1; j <= target; j++) {
                for (int k = 1; k <= numColors; k++) {
                    for (int l = 1; l <= numColors; l++) {
                        if (initialColors[i] != 0 && k == initialColors[i]) {
                            if (k == l && i != 1) {
                                dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j][l]);
                            } else {
                                dp[i][j][k] = Math.min(dp[i][j][k], dp[i - 1][j - 1][l]);
                            }
                        } else if (initialColors[i] == 0) {
                            if (k == l && i != 1) {
                                long newCost = dp[i - 1][j][l] == Long.MAX_VALUE
                                        ? Long.MAX_VALUE : dp[i - 1][j][l] + costs[i][k];
                                dp[i][j][k] = Math.min(dp[i][j][k], newCost);
                            } else {
                                long newCost = dp[i - 1][j - 1][l] == Long.MAX_VALUE
                                        ? Long.MAX_VALUE : dp[i - 1][j - 1][l] + costs[i][k];
                                dp[i][j][k] = Math.min(dp[i][j][k], newCost);
                            }
                        }
                    }
                }
            }
        }

        // Answer is min(dp[numTrees][target])
        long answer = Long.MAX_VALUE;
        for (int k = 1; k <= numColors; k++) {
            answer = Math.min(answer, dp[numTrees][target][k]);
        }

        return answer == Long.MAX_VALUE ? -1 : answer;
    }

}
