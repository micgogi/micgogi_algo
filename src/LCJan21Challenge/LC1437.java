package LCJan21Challenge;

/**
 * @author Micgogi
 * on 1/25/2021  6:18 PM
 * Rahul Gogyani
 */
public class LC1437 {
    public static void main(String args[]) {
        int[] nums = {1,1,1,1,1,1};
        int k = 0;

        System.out.println(kLengthApart(nums,k));
    }
    public static boolean kLengthApart(int[] nums, int k) {
        int count = k;
        for(int n: nums){
            if(n==1){
                if(count>k)return false;
                count =0;
            }else{
                count++;
            }
        }
        return true;
    }

}

