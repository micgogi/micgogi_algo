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
        if(nums.length < 2) return false;
        for(int i=1; i< nums.length; i++){
            if(nums[i] == 0 && nums[i-1] == 0){
                return true;
            }
        }
        if(k == 0) return false;

        Map<Integer,Integer> remToPos = new HashMap<>();
        int remainderSoFar = 0;
        for(int i=0; i < nums.length; i++){
            remainderSoFar = (remainderSoFar + nums[i])%k;
            if(remainderSoFar == 0 && i>0) return true;
            if(remToPos.containsKey(remainderSoFar) && remToPos.get(remainderSoFar) < i-1){
                return true;
            }
            remToPos.put(remainderSoFar,i);
        }
        return false;
    }
}
