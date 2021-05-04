package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/4/2021  6:29 PM
 * Rahul Gogyani
 */
public class LC665 {
    public static void main(String args[]) {
        System.out.println(checkPossibility(new int[]{4, 2, 3}));
    }

    public static boolean checkPossibility(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                count++;
                if (i > 0 && nums[i + 1] < nums[i - 1]) nums[i + 1] = nums[i];
                else nums[i] = nums[i + 1];
            }
        }
        return count <= 1;
    }

}

