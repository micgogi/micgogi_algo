package June21Challenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 6/18/2021  7:46 PM
 * Rahul Gogyani
 */
public class LC307 {
    public static void main(String args[]) {
        LC307 lc307 = new LC307(new int[]{7,2,7,2,0});
       lc307.update(4,6);
       lc307.update(0,2);
       lc307.update(0,9);
        System.out.println(lc307.sumRange(4,4));
        lc307.update(3,8);
        System.out.println(lc307.sumRange(0,4));
    }
    int[] nums;
    int[] presum;
    public LC307(int[] nums) {
        this.nums = nums;
        this.presum = new int[nums.length];
        presum[0] = nums[0];
        for (int i = 1; i <nums.length ; i++) {
            presum[i]=nums[i]+presum[i-1];
        }
    }
    Map<Integer,Integer> map = new HashMap<>();;
    public void update(int index, int val) {
        int diff = val -nums[index];
        nums[index] = val;
        map.putIfAbsent(index,diff);
    }

    public int sumRange(int left, int right) {
        if(left==0){
            return presum[right];
        }else{
            return presum[right]-presum[left-1];
        }
    }
}

