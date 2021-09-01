package july21challenge;

/**
 * @author Micgogi
 * on 7/8/2021  1:32 PM
 * Rahul Gogyani
 */
public class LC718 {
    public static void main(String args[]) {
        System.out.println(findLength(new int[]{1, 2, 3, 4, 5}, new int[]{2, 1, 3, 4, 5}));
    }

    public static int findLength(int[] nums1, int[] nums2) {
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        int ans = 0;
        for (int i = 1; i <= nums1.length; i++) {
            for (int j = 1; j <= nums2.length; j++) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }

}

