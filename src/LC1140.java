/**
 * @author Micgogi
 * on 10/26/2020  12:44 PM
 * Rahul Gogyani
 */
public class LC1140 {
    public static void main(String args[]) {
        int a[] = {8,15,3,7};
        int[][] dp = new int[a.length][a.length];
        for (int i = 0; i <a.length ; i++) {
            dp[i][i] = a[i];
        }
        for (int i = 0; i < a.length; i++) {
            for (int j =i+1; j < a.length ; j++) {
                if(i<j ){
                    int op1 = a[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
                    int op2 = a[j]+Math.min(dp[i+1][j-1],dp[i][j-2]);
                    dp[i][j] = Math.max(op1,op2);
                }
            }
        }
        System.out.println(dp[0][a.length-1]);
    }
}

