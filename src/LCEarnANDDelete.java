import java.util.Arrays;

/**
 * @author Micgogi
 * on 11/1/2021  3:46 PM
 * Rahul Gogyani
 */
public class LCEarnANDDelete {
    public static void main(String args[]) {
        System.out.println(deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }

    public static int deleteAndEarn(int[] nums) {
        // 2,2,3,3,3,4
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int n = nums.length;

        int max = 0;
        max = Arrays.stream(nums).max().getAsInt();
        int[] dp = new int[max + 1];
        for (int num : nums) {
            dp[num] += num;

        }

        dp[dp.length-2] = Math.max(dp[dp.length-2],dp[dp.length-1]);
        for (int i = dp.length-3; i >=1 ; i--) {
            dp[i] = Math.max(dp[i+1],dp[i]+dp[i+2]);
        }

        return Math.max(dp[1],dp[2]);


    }
}

