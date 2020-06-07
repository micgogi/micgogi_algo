/**
 * @author Micgogi
 * on 6/7/2020  1:19 PM
 * Rahul Gogyani
 */
public class LC518 {
    public static void main(String[] args) {
        int coins[] = {1,2,5};
        int amount = 5;
        int dp[][] = new int[coins.length+1][amount+1];
        for (int i = 0; i <=amount ; i++) {
            dp[0][i]=0;
        }
        for (int i = 0; i <=coins.length ; i++) {
            dp[i][0]=1;

        }
        for (int i = 1; i <=coins.length ; i++) {
            for (int j = 1; j <=amount ; j++) {
                if(coins[i-1]<=j){
                    dp[i][j]=dp[i-1][j]+dp[i][j-coins[i-1]];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        System.out.println(dp[coins.length][amount]);
    }
}
