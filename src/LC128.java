import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/23/2021  12:43 PM
 * Rahul Gogyani
 */
public class LC128 {
    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentNum = nums[i];
            int count = 0;
            if (!set.contains(currentNum - 1)) {

                while (set.contains(currentNum)) {
                    count++;
                    currentNum++;
                    ans = Math.max(ans, count);
                }
            }
        }
        System.out.println(ans);
    }

}

