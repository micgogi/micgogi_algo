package LCJan21Challenge;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/18/2021  6:42 PM
 * Rahul Gogyani
 */
public class LC1679 {
    public static void main(String args[]) {
        int[] nums = {65, 78, 75, 73, 84, 65};
        int k = 130;
        System.out.println(maxOperations(nums, k));
    }

    public static int maxOperations(int[] nums, int k) {
        int left = 0;
        int right = nums.length - 1;
        int ans = 0;
        Arrays.sort(nums);
        while (left < right) {
            int sum = nums[left] + nums[right];
            if (sum > k) {
                right--;
            } else if (sum < k) {
                left++;
            } else {
                ans++;
                left++;
                right--;
            }
        }
        return ans;
    }
}

