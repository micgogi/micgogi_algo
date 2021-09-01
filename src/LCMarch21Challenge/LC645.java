package LCMarch21Challenge;

import java.util.Arrays;

/**
  * @author Micgogi
  * on 3/2/2021  1:52 PM
  * Rahul Gogyani
  */

public class LC645 {
    public static void main(String args[]){
        System.out.println(Arrays.toString(findErrorNums(new int[]{1,2,2,3})));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int start = 1;
        int[] count = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            count[nums[i]]+=1;
        }
        System.out.println(Arrays.toString(count));
        for(int i=1;i<count.length;i++){
            if(count[i]==2){
                ans[0] = i;
            }else if(count[i]==0){
                ans[1] = i;
            }
        }
        return ans;
    }
}

