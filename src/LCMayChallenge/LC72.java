package LCMayChallenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 5/26/2020  10:27 AM
 * Rahul Gogyani
 */
public class LC72 {
    public static void main(String[] args) {
        String s1 = "horse";
        String s2 = "ros";
        int dp[][] = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 1; i <= s1.length(); i++) {
            dp[i][0] = 1 + dp[i - 1][0];
        }
        for (int i = 1; i <= s2.length(); i++) {
            dp[0][i] = 1 + dp[0][i - 1];
        }
        for (int i = 1; i <= s1.length(); i++) {
            for (int j = 1; j <= s2.length(); j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i-1][j-1]) + 1;
                }
            }
        }
        System.out.println(Arrays.deepToString(dp));
       // System.out.println(dp[s1.length()][s2.length()]);
    }
}
