package June21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/17/2021  7:55 PM
 * Rahul Gogyani
 */
public class LC795 {
    public static void main(String args[]) {
        System.out.println(numSubarrayBoundedMax(new int[]{2,1,4,3},2,3));
    }
    public static int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int l =-1;
        int r = -1;
        int ans =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>right)l=i;
            if(nums[i]>=left)r=i;

            ans+=r-l;
        }
        return ans;
    }


}

