import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/29/2021  7:05 PM
 * Rahul Gogyani
 */
public class LC213HouseRobber2 {
    public static void main(String args[]) {
        System.out.println(new LC213HouseRobber2().rob(new int[]{2, 3, 2}));
    }

    public int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] dp1 = new int[nums.length + 1];
        dp1[0] = 0;
        dp1[1] = nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            dp1[i + 1] = Math.max(dp1[i - 1] + nums[i], dp1[i]);
        }
        System.out.println(Arrays.toString(dp1));
        int[] dp2 = new int[nums.length + 1];
        dp2[0] = 0;
        dp2[2] = nums[1];
        for (int i = 2; i < nums.length; i++) {
            dp2[i + 1] = Math.max(dp2[i - 1] + nums[i], dp2[i]);
        }
        System.out.println(Arrays.toString(dp2));


        return Math.max(dp1[nums.length - 1], dp2[nums.length]);

    }
}

