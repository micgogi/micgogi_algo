import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.HashMap;
import java.util.stream.IntStream;

/**
 * @author Micgogi
 * on 6/6/2020  12:15 PM
 * Rahul Gogyani
 */
public class LC416 {
    public static void main(String[] args) {
        int a[] = {1,5,11,5};
        System.out.println(canPartition(a));

    }
    public static boolean canPartition(int[] nums) {
        int total = IntStream.of(nums).sum();
        if(total%2!=0)return false;
        return canPartition(nums,0,0,total, new HashMap<String, Boolean>());
    }
    public static boolean canPartition(int nums[], int index, int sum,int total, HashMap<String, Boolean> states){
        String current = index+""+sum;
        if(states.containsKey(current)){
            return states.get(current);
        }
        if(sum*2==total){
            return  true;
        }
        if(sum>total/2||index>=nums.length){
            return false;
        }
        boolean partition = canPartition(nums,index+1,sum+nums[index],total,states)||
                canPartition(nums,index+1,sum,total,states);
        states.put(current,partition);
        return partition;

    }
}
