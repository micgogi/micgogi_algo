/**
 * @author Micgogi
 * on 1/11/2022  3:53 PM
 * Rahul Gogyani
 */
public class LC70Test {
    public static void main(String[] args) {
        System.out.println(new LC70Test().climbStairs(5));
    }

    public int climbStairs(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;
        int[] dp = new int[n + 1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

