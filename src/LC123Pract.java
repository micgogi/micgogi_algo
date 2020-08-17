import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  12:21 PM
 * Rahul Gogyani
 */
public class LC123Pract {
    public static void main(String args[]) {
        int[] prices = {3, 3, 5, 0, 0, 3, 1, 4};
        System.out.println(maxProfit(prices));

    }

    public static int maxProfit(int[] prices) {
        int k =2;
        int dp[][] = new int[3][prices.length];
        for (int i = 1; i <=2 ; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j <prices.length ; j++) {

                dp[i][j] = Math.max(dp[i][j-1],maxDiff+prices[j]);
                maxDiff = Math.max(maxDiff,dp[i-1][j]-prices[j]);
            }

        }
        return dp[k][prices.length-1];
    }


}

