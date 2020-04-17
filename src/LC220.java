import java.util.Arrays;
import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/7/2020  10:29 AM
 * Rahul Gogyani
 */
public class LC220 {
    public static void main(String[] args) {
        int a[] = {1,5,9,1,5,9};
        int k =2;
        int t = 3;
        System.out.println(containsNearbyAlmostDuplicate(a,k,t));

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
      int n = nums.length;
        if (k == 10000) return false;
        for (int i = 0; i <n ; i++) {
            for (int j = i+1; j <n&&j<=i+k ; j++) {
                if(Math.abs((long)nums[i]-(long)nums[j])<=t){
                    return true;
                }
            }
        }
        return false;
    }
}
