import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/1/2021  4:23 PM
 * Rahul Gogyani
 */
public class MaxSUbSum {
    public static void main(String args[]) {
        System.out.println(maxSubSUm(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

   public static int maxSubSUm(int[] nums){
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i],nums[i]+currSum);
            maxSum = Math.max(maxSum,currSum);
        }
        return maxSum;
   }

}

