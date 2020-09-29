

import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/7/2020  10:16 AM
 * Rahul Gogyani
 */
public class LC219 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1,2,3};
        int k = 2;
        System.out.println(containsNearbyDuplicate(a,k));
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(hashMap.containsKey(nums[i])){
                int j = hashMap.get(nums[i]);
                int diff = Math.abs(i-j);
                if(diff<=k){
                    return true;
                }
            }
            hashMap.put(nums[i],i);
        }

        return false;
    }
}
