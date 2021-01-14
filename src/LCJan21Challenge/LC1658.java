package LCJan21Challenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/14/2021  5:59 PM
 * Rahul Gogyani
 */
public class LC1658 {
    public static void main(String args[]) {
        int[] nums = {8828, 9581, 49, 9818, 9974, 9869, 9991, 10000, 10000, 10000, 9999, 9993, 9904, 8819, 1231, 6309};
        int x = 134365;
        System.out.println(minOperation(nums, x));


    }

    public static int minOperation(int nums[], int x) {
        int sum = Arrays.stream(nums).sum() - x;
        if (sum < 0)
            return -1;

        if (sum == 0)
            return nums.length;

        int curr = 0;
        int start = 0;
        int res = Integer.MIN_VALUE;
        for (int end = 0; end < nums.length; end++) {
            if (curr < sum) {
                curr += nums[end];
            }
            while (curr >= sum) {
                if (curr == sum) {
                    res = Math.max(res, end - start + 1);
                }
                curr -= nums[start++];
            }
        }
        return res != Integer.MIN_VALUE ? nums.length - res : -1;
    }

}

