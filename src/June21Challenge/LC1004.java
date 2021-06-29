package June21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/29/2021  7:45 PM
 * Rahul Gogyani
 */
public class LC1004 {
    public static void main(String args[]) {
        System.out.println(longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }

    public static int longestOnes(int[] nums, int k) {
        int i=0,j;
        for ( j= 0; j <nums.length ; j++) {
            if(nums[j]==0)k--;
            if(k<0 &&nums[i++]==0)k++;
        }
        return j-i;
    }

}

