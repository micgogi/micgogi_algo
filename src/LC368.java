import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Micgogi
 * on 6/2/2020  7:17 PM
 * Rahul Gogyani
 */
public class LC368 {
    public static void main(String[] args) {
        int a[] = {1,2};
        System.out.println(largestDivisibleSubset(a));

    }

    public static List<Integer> largestDivisibleSubset(int[] nums) {
      Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        if(nums.length==1){
            list.add(nums[0]);
            return list;
        }
        int dp[] = new int[nums.length];
        int parent[] = new int[nums.length];
        Arrays.fill(parent,-1);
        Arrays.fill(dp,1);
        int maxIndex = -1;
        int maxLength = 0;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] % nums[j] == 0 && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                    parent[i] = j;
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
                maxIndex = i;
            }
        }

        while (maxIndex != -1) {
            list.add(nums[maxIndex]);
            maxIndex = parent[maxIndex];
        }


        return list;
    }
}
