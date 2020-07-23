import java.util.HashMap;
import java.util.Map;

/**
 * @author Micgogi
 * on 4/6/2020  9:52 AM
 * Rahul Gogyani
 */
public class LC523 {
    public static void main(String[] args) {
        int a[] = {23, 2, 4, 6, 7};
        int k =6;
       // System.out.println(checkSubarraySum(a,k));
        System.out.println(checkSubarraySumOp(a,k));

    }
//
    public static boolean checkSubarraySum(int[] a, int k) {

        for (int i = 0; i <a.length ; i++) {
            int currSum=a[i];
            for (int j = i+1; j <a.length ; j++) {
                currSum+=a[j];
                if(currSum==0&&k==0)return true;
                if(k==0&&currSum!=0)return false;
                if(k!=0&&currSum%k==0){
                    return true;
                }

            }
        }
        return false;
    }

    //optimized

    public static boolean checkSubarraySumOp(int[] nums, int k) {
       Map<Integer,Integer> map = new HashMap<>();
       int sum =0;
        for (int i = 0; i <nums.length ; i++) {
            sum+=nums[i];
            if(k!=0)sum%=k;
            Integer prev = map.get(sum);
            if(prev!=null){
                if(i-prev>1)return true;
            }else{
                map.put(sum,i);
            }
        }
        return false;
    }
}
