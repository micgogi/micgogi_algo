import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  3:22 PM
 * Rahul Gogyani
 */
public class LC188 {
    public static void main(String args[]) {
        int a[] = {2,4,1};
        int k = 2;
        System.out.println(maxProfit(k,a));
        System.out.println(maxProfitMod(k,a));

    }
    //this is slow
    //TC O(k*number of days^2)
    // recurrence formula T[i][j] = max(T[i][j-1], max(prices[j] - prices[m] + T[i-1][m])) where m is 0...j-1
    public static int maxProfit(int k, int[] prices) {
        if (k == 0 || prices.length == 0) {
            return 0;
        }
        int dp[][] = new int[k + 1][prices.length];
        for (int i = 1; i < prices.length; i++) {
            for (int j = 1; j <= k; j++) {
                int max = 0;
                for (int m = 0; m <= j - 1; m++) {
                    max = Math.max(max, prices[j] - prices[m] + dp[i - 1][m]);
                }
                dp[i][j] = Math.max(dp[i][j - 1], max);
            }
        }
        return dp[k][prices.length-1];
    }
    // TC O(k* no of days
    //T[i][j] = max(T[i][j-1], prices[j] + maxDiff)
    // maxDiff = max(maxDiff, T[i-1][j] - prices[j])
    public static int maxProfitMod(int k, int[] prices){
        if(k==0||prices.length==0){
            return 0;
        }
        // no of transactions is greater than days
        if(k>=prices.length){
            return solve(prices);
        }
        int dp[][] = new int[k+1][prices.length];
        for (int i = 1; i <=k ; i++) {
            int maxDiff = -prices[0];
            for (int j = 1; j <prices.length ; j++) {
                dp[i][j] = Math.max(dp[i][j-1],prices[j]+maxDiff);
                maxDiff = Math.max(maxDiff, dp[i-1][j]-prices[j]);
            }
        }
        return dp[k][prices.length-1];
    }
    public static int solve(int a[]){
        int profit = 0;
        for (int i =1; i <a.length ; i++) {
            if(a[i]>a[i-1]){
                profit+=a[i]-a[i-1];
            }
        }
        return profit;
    }



}

