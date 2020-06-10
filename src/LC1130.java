import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 6/10/2020  12:35 PM
 * Rahul Gogyani
 */
public class LC1130 {
    public static void main(String[] args) {
        int a[] = {6,2,4};
        System.out.println(mctFromLeafValues(a));
    }

    public static int mctFromLeafValues(int[] arr) {
        int n = arr.length;
        int dp[][] = new int[n][n];
        for (int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(dp,0,n-1,arr);
    }
    public static int solve(int[][] dp, int i, int j, int[] arr){
        if(i==j)return 0;
        if(dp[i][j]!=-1)return dp[i][j];
       int  first = Integer.MIN_VALUE;
       int second = Integer.MIN_VALUE;
        for (int k = i; k <=j ; k++) {
            if(arr[k]>=first){
                second=first;
                first=arr[k];
            }else if (arr[k]>second){
                second=arr[k];
            }
        }
        int maxProduct = first*second;
        int minSum = Integer.MAX_VALUE;
        for (int k = i; k <j ; k++) {
            minSum = Math.min(minSum,solve(dp,i,k,arr)+solve(dp,k+1,j,arr));
        }

        return dp[i][j]=minSum+maxProduct;
    }
}
