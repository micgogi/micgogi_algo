/**
 * @author Micgogi
 * on 6/11/2020  10:07 AM
 * Rahul Gogyani
 */
public class LC221Pract {
    public static void main(String[] args) {
        int sq[][] = {{1,0,1,0,0},{1,0,1,1,1},{1,1,1,1,1},{1,0,0,1,0}};
        int dp[][] = new int[sq.length][sq[0].length];
        int max=0;
        for (int i = 0; i <sq.length ; i++) {
            if(sq[i][0]==0)continue;
            max=1;
            dp[i][0]=1;
        }
        for (int i = 0; i <sq[0].length ; i++) {
            if(sq[0][i]==0)continue;
            max=1;
            dp[0][i]=1;
        }
        for (int i = 1; i <sq.length ; i++) {
            for (int j = 1; j <sq[i].length ; j++) {
                if(sq[i][j]==0)continue;
                dp[i][j]=sq[i][j]+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                if(dp[i][j]>max)max=dp[i][j];
            }
        }
        System.out.println(max* max);
    }
}
