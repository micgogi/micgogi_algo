package DP;

/**
 * @author Micgogi
 * on 6/8/2020  10:09 AM
 * Rahul Gogyani
 */
public class MatrixChainMultiplication {
    public static void main(String[] args) {
        int a[] = {4,2,3,5,3};
        int q=0;
        int dp[][]  = new int[a.length][a.length];
        for (int l = 2; l <a.length ; l++) {
            for (int i = 0; i <a.length-l ; i++) {
                int j = i+l;

                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i+1; k <j ; k++) {

                    q  = dp[i][k]+dp[k][j]+a[i]*a[k]*a[j];
                    if(q<dp[i][j]){
                        dp[i][j] = q;
                    }
                }
            }
        }
        System.out.println(dp[0][a.length-1]);
    }
}
