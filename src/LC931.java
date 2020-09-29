
/**
 * @author Micgogi
 * on 6/12/2020  11:55 AM
 * Rahul Gogyani
 */
public class LC931 {
    public static void main(String[] args) {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int r = a.length;
        int c = a[0].length ;
        int dp[][] = new int[r][c+2];

        for (int i = 1; i <=c ; i++) {
        dp[0][i]=a[0][i-1];
        }
        for (int i = 0; i <r ; i++) {
            dp[i][0]= Integer.MAX_VALUE;
            dp[i][c+1]= Integer.MAX_VALUE;
        }

        for (int i = 1; i <r ; i++) {
            for (int j = 1; j <=c ; j++) {
                dp[i][j]= a[i][j-1]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i-1][j+1]));
                
            }

        }
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <=c ; i++) {
            min = Math.min(min,dp[r-1][i]);
        }
        System.out.println(min);
    }
}
