package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/23/2021  6:26 PM
 * Rahul Gogyani
 */
public class LC915 {
    public static void main(String args[]) {
        System.out.println(partitionDisjoint(new int[]{5, 0, 3, 8, 6}));
    }

    public static int partitionDisjoint(int[] nums) {
        int[] maxLeft = new int[nums.length];
        int[] minRight = new int[nums.length];
        int maxL = nums[0];
        for (int i = 0; i < nums.length; i++) {
            maxL = Math.max(maxL, nums[i]);
            maxLeft[i] = maxL;
        }

        int minR = nums[nums.length - 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            minR = Math.min(minR, nums[i]);
            minRight[i] = minR;
        }

        for (int i = 1; i < nums.length; i++) {
            if (maxLeft[i - 1] <= minRight[i]) return i;
        }

        return -1;
    }
}

