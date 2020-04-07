import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/7/2020  10:29 AM
 * Rahul Gogyani
 */
public class LC220 {
    public static void main(String[] args) {
        int a[] = {-1,2147483647};
        int k =1;
        int t = 2147483647;
        System.out.println(containsNearbyAlmostDuplicate(a,k,t));

    }

    public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if(Math.abs(nums[i]-nums[j])<=t&&Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }
}
