package DP;

/**
 * @author Micgogi
 * on 4/27/2020  2:28 PM
 * Rahul Gogyani
 */
public class LC201 {
    public static void main(String[] args) {
        int a[][] = {{1,0,1,0,0},
                {1,0,1,1,1},
                {1,1,1,1,1},
                {1,0,0,1,0}};

        int dp[][] = new int[a.length][a[0].length];
        int max=0;
        for (int i = 0; i <a.length; i++) {
            dp[i][0]= dp[i][0];
            if(dp[i][0]==1){
                max=1;
            }
        }
        for (int j = 0; j <a[0].length ; j++) {
            dp[0][j]=dp[0][j];
            if(dp[0][j]==1){
                max=1;
            }
        }
        for (int i = 1; i <a.length ; i++) {
            for (int j = 1; j <a[0].length ; j++) {
                if(a[i][j]==0)continue;

                int t = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                dp[i][j]=t+1;
                if(dp[i][j]>max)max=dp[i][j];



            }
        }

        System.out.println(max*max);
    }
}
