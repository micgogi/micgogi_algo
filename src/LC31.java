import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/17/2020  5:01 PM
 * Rahul Gogyani
 */
public class LC31 {
    public static void main(String args[]) {
        int a[] = {65, 78, 75, 73, 84, 65};
        nextPermutation(a);
        System.out.println(Arrays.toString(a));

    }

    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int k, l;
        //Find the largest index k such that nums[k] < nums[k + 1]. If no such index exists, just reverse nums and done.
        for (k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) break;
        }
        if (k < 0) {
            reverse(nums, 0, n - 1);
        } else {
            //Find the largest index l > k such that nums[k] < nums[l].
            //Swap nums[k] and nums[l].
            //Reverse the sub-array nums[k + 1:].
            for (l = n - 1; l > k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            }
            swap(nums, k, l);
            reverse(nums, k + 1, n - 1);
        }
    }

    static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }

    static void swap(int[] nums, int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
}

