import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/2/2021  11:55 AM
 * Rahul Gogyani
 */
public class LC174T {
    public static void main(String args[]) {
        System.out.println(calculateMinimumHP(new int[][]{{-2,-3,3},{-5,-10,1},{10,30,-5}}));
    }

   public static int calculateMinimumHP(int[][] a){
       int m = a.length;
       int n = a[0].length;
       int dp[][] = new int[m+1][n+1];
       for(int b[]:dp){
           Arrays.fill(b, Integer.MAX_VALUE);
       }
       dp[m][n-1] = 1;
       dp[m-1][n] = 1;
       //System.out.println(Arrays.deepToString(dp));
       for (int i = m-1; i >=0 ; i--) {
           for (int j = n-1; j >=0 ; j--) {
               dp[i][j]=Math.max(1,Math.min(dp[i+1][j],dp[i][j+1])-a[i][j]);
           }
       }
       System.out.println(Arrays.deepToString(dp));
       return dp[0][0];
   }
}

