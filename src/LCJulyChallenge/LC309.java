package LCJulyChallenge;

/**
 * @author Micgogi
 * on 7/29/2020  1:41 PM
 * Rahul Gogyani
 */
public class LC309 {
    public static void main(String args[]) {
        int prices[] = {1,4,2};
        System.out.println(maxProfit(prices));
        System.out.println(maxProfit1(prices));

    }
    public static int maxProfit(int[] prices) {
        if(prices.length<=1)return 0;
        int dp[][] = new int[prices.length][2];
        if(prices.length==2&&prices[0]>prices[1]){
            return 0;

        }
        if (prices.length == 2 && prices[1]>prices[0]) {
            return prices[1]-prices[0];
        }
        dp[0][0] = -prices[0];//buy
        dp[0][1] = 0;
        dp[1][0] = -Math.min(prices[1],prices[0]);
        dp[1][1] = Math.max(0,prices[1]-prices[0]);
        for (int i = 2; i <prices.length ; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-2][1]-prices[i]);
            dp[i][1] = Math.max(dp[i-1][1],dp[i-1][0]+prices[i]);
        }
        return dp[prices.length-1][1];
    }
    //Another Approach using state machines constant space
    public static int maxProfit1(int[] prices){
        if(prices.length<=1)return 0;
        int s0 =0;//sell
        int s1 = -prices[0];//buy
        int s2=0;//rest;
        for (int i = 1; i <prices.length ; i++) {
            int last_s2 = s2;
            s2 = s1+prices[i];
            s1 = Math.max(s1,s0-prices[i]);
            s0 = Math.max(s0,last_s2);
        }
        return Math.max(s0,s2);
    }


}

