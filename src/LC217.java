import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/7/2020  9:55 AM
 * Rahul Gogyani
 */
public class LC217 {
    public static void main(String[] args) {
        int a[] = {1,2,3,1};
        HashMap<Integer,Integer> hm = new HashMap<>();
        System.out.println(containsDuplicate(a));

    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
            if(hm.containsKey(nums[i])){
                return true;
            }
            hm.put(nums[i],1);
        }
        return false;

    }

//opt
    public static boolean containsDuplicateOpt(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for (int num:nums) {
            if (i < nums.length && nums[i] == nums[i + 1]) {
                return true;
            }
            i++;
        }
        return false;
    }
}
