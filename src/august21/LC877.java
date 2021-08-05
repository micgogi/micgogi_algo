package august21;

/**
 * @author Micgogi
 * on 8/5/2021  7:40 PM
 * Rahul Gogyani
 */
public class LC877 {
    public static void main(String args[]) {
        int piles[] = {5, 3, 4, 5};
        System.out.println(stoneGame(piles));
    }

    // using dp
    public static boolean stoneGame(int[] piles) {
        int n = piles.length;
        int[][] dp = new int[piles.length][piles.length];
        for (int i = 0; i < n; i++) {
            dp[i][i] = piles[i];
        }
        for (int d = 1; d < n; d++) {
            for (int i = 0; i < n - d; i++) {
                dp[i][i + d] = Math.max(piles[i] - dp[i + 1][i + d], piles[i + d] - dp[i][i + d - 1]);
            }
        }
        return dp[0][n - 1] > 0;
    }

    //or just return true
    public static boolean stoneGame1(int[] piles) {
        return true;
    }
}



