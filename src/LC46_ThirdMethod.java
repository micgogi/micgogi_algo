import java.util.ArrayList;
import java.util.List;

/**
 * @author Micgogi
 * on 4/14/2020  9:56 AM
 * Rahul Gogyani
 */
public class LC46_ThirdMethod {
    public static void main(String[] args) {
        int nums[] = {1,2,3};
        System.out.println(permute(nums));
    }

    public static List<List<Integer>> permute(int nums[]){
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), nums);
        return list;
    }

    private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums){
        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
        }else{
            for (int i = 0; i <nums.length ; i++) {
                if(tempList.contains(nums[i]))continue;
                tempList.add(nums[i]);
                backtrack(list,tempList,nums);
                tempList.remove(tempList.size()-1);

            }
        }
    }
}
