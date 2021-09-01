package august21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/16/2021  7:51 PM
 * Rahul Gogyani
 */
public class LC303 {
    int[] prefsum;

    public LC303(int[] nums) {
        prefsum = new int[nums.length];
        if (nums.length == 0) return;
        prefsum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prefsum[i] = nums[i] + prefsum[i - 1];
        }
    }

    public int sumRange(int i, int j) {
        if (i == 0) {
            return prefsum[j];
        } else {
            return prefsum[j] - prefsum[i - 1];
        }

    }

    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        LC303 lc = new LC303(a);
        System.out.println(lc.sumRange(0, 2));
        System.out.println(lc.sumRange(1, 3));
    }


}
