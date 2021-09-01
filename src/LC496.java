import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author Micgogi
 * on 12/23/2020  4:33 PM
 * Rahul Gogyani
 */
public class LC496 {
    public static void main(String args[]) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
       // System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
        System.out.println(Arrays.toString(nextGreaterElement1(nums1,nums2)));
    }
    //O(n*n)
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            int index = -1;
            for (int j = 0; j < nums2.length ; j++) {
                if(nums1[i]==nums2[j]){
                    index = j;
                    break;
                }
            }
            for (int j = index; index>-1 && j < nums2.length ; j++) {
                if(nums2[j]>nums1[i]){
                    nums1[i] = nums2[j];
                    found = true;
                    break;
                }
            }

            if(!found)nums1[i] =-1;
        }
        //System.out.println(Arrays.toString(nums1));
        return nums1;
    }

    //O(n)
    public static int[] nextGreaterElement1(int[] nums1, int[] nums2){
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num:nums2){
            while (!stack.isEmpty() && stack.peek()<num){
                map.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for (int i = 0; i < nums1.length ; i++) {
            nums1[i] = map.getOrDefault(nums1[i],-1);
        }
        return nums1;

    }
}

