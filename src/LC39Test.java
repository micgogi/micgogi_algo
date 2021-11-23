import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/23/2021  7:23 PM
 * Rahul Gogyani
 */
public class LC39Test {
    public static void main(String[] args) {
        LC39Test lc39Test = new LC39Test();
        int[] nums = {2,3,6,7};
        lc39Test.combinationSum(nums,7);
    }
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);

        backTrack(nums,new ArrayList<>(),target,0,res,0);
        for (List<Integer> l:res) System.out.println(l);
        return res;

    }
    public void backTrack(int[] num,List<Integer> temp,int target,int sum,List<List<Integer>> ans,int start){
        if(target==sum){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>target)return;
        for (int i = start; i <num.length ; i++) {
            temp.add(num[i]);
            backTrack(num,temp,target,sum+num[i],ans,i);
            temp.remove(temp.size()-1);
        }

    }

}

