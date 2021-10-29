import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/29/2021  6:40 PM
 * Rahul Gogyani
 */
public class LC198HouseRobber {
    public static void main(String args[]) {
        System.out.println(new LC198HouseRobber().rob(new int[]{1,2,3,1}));
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
       if (nums.length == 2) return Math.max(nums[0], nums[1]);
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        System.out.println(Arrays.toString(dp));
        return dp[nums.length - 1];
    }
}

