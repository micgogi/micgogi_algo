import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 1/6/2022  1:37 PM
 * Rahul Gogyani
 */
public class LC746Test {
    public static void main(String args[]) {
        System.out.println(new LC746Test().mincost(new int[]{10, 15, 20}));
    }
//10 15 20
    //

    public int mincost(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 2; i <= cost.length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
      //  System.out.println(Arrays.toString(dp));
        return dp[dp.length - 1];
    }
}

