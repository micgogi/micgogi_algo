import java.util.stream.IntStream;

/**
 * @author Micgogi
 * on 6/6/2020  9:37 AM
 * Rahul Gogyani
 */
public class LC698 {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 3, 5, 2, 1};
        int k = 4;
        System.out.println(canPartitionKSubsets(nums,k));
    }

    public static boolean canPartitionKSubsets(int[] nums, int k) {
        int sum = IntStream.of(nums).sum();
        if (k <= 0 || k > nums.length || sum % k != 0) return false;
        return canPartition(0, nums, new boolean[nums.length], k, 0, sum / k);
    }

    public static boolean canPartition(int start, int[] nums, boolean[] used, int k, int bucketSum, int target) {
        if (k == 1) return true;
        if (bucketSum == target) {
            return canPartition(0, nums, used, k - 1, 0, target);
        }



        for (int i = start; i < nums.length; i++) {
            if (!used[i] && bucketSum + nums[i] <= target) {
                used[i] = true;
                if (canPartition(i + 1, nums, used, k, bucketSum + nums[i], target)) {
                    return true;
                }
                used[i] = false;
            }
        }
        return false;
    }
}
