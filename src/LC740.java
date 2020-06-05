import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/5/2020  10:24 AM
 * Rahul Gogyani
 */
public class LC740 {
    public static void main(String[] args) {
        int nums[] = {3,4,2};
        int max =0;
        max = Arrays.stream(nums).max().getAsInt();
        int dp[] = new int[max+1];
        for (int  num: nums)dp[num]+=num;
        dp[dp.length-2]=Math.max(dp[dp.length-2],dp[dp.length-1]);
        for (int i = dp.length-3; i>=1 ; i--) {
            dp[i] = Math.max(dp[i+1],dp[i]+dp[i+2]);
        }
        System.out.println(Math.max(dp[1],dp[2]));
    }
}
