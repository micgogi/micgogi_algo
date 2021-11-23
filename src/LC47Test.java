import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/23/2021  6:52 PM
 * Rahul Gogyani
 */
public class LC47Test {
    public static void main(String[] args) {
        LC47Test lc47Test = new LC47Test();
        int[] nums = {1,1,2};
        lc47Test.permutation(nums);
    }


    public List<List<Integer>> permutation(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        backktrack(nums,ans,new ArrayList<>(),new boolean[nums.length]);
        for (List<Integer> r:ans) System.out.println(r);
        return ans;

    }
    public void backktrack(int[] nums, List<List<Integer>> ans, List<Integer> temp,boolean[] used){
        if(temp.size()==nums.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(used[i]||i>0&&nums[i]==nums[i-1]&&!used[i-1])continue;
            used[i] = true;
            temp.add(nums[i]);
            backktrack(nums,ans,temp,used);
            used[i]=false;
            temp.remove(temp.size()-1);
        }
    }
}

