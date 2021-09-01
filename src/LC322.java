import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/7/2020  2:10 PM
 * Rahul Gogyani
 */
public class LC322 {
    public static void main(String[] args) {
        int coins[] = {1, 2, 5};
        int amount = 11;
        int dp[] = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int coin : coins) {
                if (i >= coin && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.max(dp[i - coin] + 1, dp[i]);
                }
            }
        }
        System.out.println(dp[amount] != Integer.MAX_VALUE ? -1 : dp[amount]);
    }
}
