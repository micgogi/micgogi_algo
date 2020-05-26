package LCMayChallenge;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 4/13/2020  2:27 PM
 * Rahul Gogyani
 */
public class LC525 {
    public static void main(String[] args) {
        int a[] = {0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(a));
    }

    public static int findMaxLength(int[] nums) {
        int sum = 0;
        int max = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
               sum--;
            } else {
                sum++;
            }
            if(map.containsKey(sum)){
                max = Math.max(max,i-map.get(sum));
            }else{
                map.put(sum,i);
            }
        }
        return max;
    }
}
