package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Random;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/20/2021  6:03 PM
 * Rahul Gogyani
 */
public class LC384 {
    int[] nums;
    Random random;
    public LC384(int[] nums) {
        this.nums = nums;
        random  = new Random();
    }

    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return nums;
    }

    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        if(nums==null)return null;
        int[] a = nums.clone();
        for (int i = 0; i <a.length ; i++) {
            int j = random.nextInt(i+1);
            swap(a,i,j);
        }
        return a;
    }
    public void swap(int[] a , int i , int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String args[]) {
        LC384 lc = new LC384(new int[]{1,2,3});
        System.out.println(Arrays.toString(lc.shuffle()));

    }
}

