

import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/21/2020  2:27 PM
 * Rahul Gogyani
 */
public class LC174 {
    public static void main(String[] args) {
        int a[][] = {
                {-2,-3,3},
                {-5,-10,1},
                {10,30,-5}};
        int m = a.length;
        int n = a[0].length;
        int dp[][] = new int[m+1][n+1];
        for(int b[]:dp){
            Arrays.fill(b, Integer.MAX_VALUE);
        }
        dp[m][n-1] = 1;
        dp[m-1][n] = 1;
        System.out.println(Arrays.deepToString(dp));
        for (int i = m-1; i >=0 ; i--) {
            for (int j = n-1; j >=0 ; j--) {
                dp[i][j]=Math.max(1,Math.min(dp[i+1][j],dp[i][j+1])-a[i][j]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
    }
}
