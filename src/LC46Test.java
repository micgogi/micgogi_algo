import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/23/2021  6:30 PM
 * Rahul Gogyani
 */
public class LC46Test {
    public static void main(String[] args) {
        LC46Test lc46Test = new LC46Test();
        int[] nums = {1,2,3};
        lc46Test.permutation(nums);
    }


    public List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        backktrack(nums,ans,new ArrayList<>());
        for (List<Integer> r:ans) System.out.println(r);
        return ans;

    }
    public void backktrack(int[] nums, List<List<Integer>> ans, List<Integer> temp){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(temp.contains(nums[i])) continue;
            temp.add(nums[i]);
            backktrack(nums,ans,temp);
            temp.remove(temp.size()-1);
        }
    }
}

