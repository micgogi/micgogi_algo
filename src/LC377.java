import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/12/2020  2:21 PM
 * Rahul Gogyani
 */
public class LC377 {

    static int[] dp;

    public static void main(String args[]) {
        int a[] = {1, 2, 3};
        int target = 4;
        dp = new int[target + 1];
        Arrays.fill(dp, -1);
        dp[0] = 1;
        System.out.println(getSum(a, target));

    }

    public static int getSum(int[] nums, int target) {
        if (dp[target] != -1) {
            return dp[target];
        }
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            if (target >= nums[i]) {
                res += getSum(nums, target - nums[i]);
            }
        }
        return dp[target] = res;
    }


}

