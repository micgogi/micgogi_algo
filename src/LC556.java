import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/23/2020  6:29 PM
 * Rahul Gogyani
 */
public class LC556 {
    public static void main(String args[]) {
        int num = 65787573;
        System.out.println(nextGreaterElement(num));
    }
    public static int nextGreaterElement(int n) {
       String ele = ""+n;
       int num[] = new int[ele.length()];
        for (int i = 0; i <ele.length(); i++) {
            num[i] = Integer.parseInt(""+ele.charAt(i));
        }
        System.out.println(Arrays.toString(num));
        nextPermutation(num);
        System.out.println(Arrays.toString(num));
        int result = 0;
        int temp =1;
        for (int i = num.length-1; i >=0 ; i--) {
            result+=num[i]*temp;
            temp*=10;
        }

        return result<=n?-1:result;


    }
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int k, l;
        //Find the largest index k such that nums[k] < nums[k + 1]. If no such index exists, just reverse nums and done.
        for (k = n - 2; k >= 0; k--) {
            if (nums[k] < nums[k + 1]) break;
        }
        if (k < 0) {
            reverse(nums, 0, n - 1);
        } else {
            //Find the largest index l > k such that nums[k] < nums[l].
            //Swap nums[k] and nums[l].
            //Reverse the sub-array nums[k + 1:].
            for (l = n - 1; l > k; l--) {
                if (nums[l] > nums[k]) {
                    break;
                }
            }
            swap(nums, k, l);
            reverse(nums, k + 1, n - 1);
        }
    }

    static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            swap(nums, s, e);
            s++;
            e--;
        }
    }

    static void swap(int[] nums, int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
}

