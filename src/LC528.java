import jdk.nashorn.internal.runtime.regexp.joni.constants.Arguments;

import java.util.Random;

/**
 * @author Micgogi
 * on 6/5/2020  2:08 PM
 * Rahul Gogyani
 */
public class LC528 {
    private int[] sum;
    private Random random;

    public LC528(int[] w) {
        random = new Random();
        sum = new int[w.length];
        sum[0] = w[0];
        for (int i = 1; i < w.length; i++) {
            sum[i] += w[i] + sum[i - 1];
        }
    }


//Given an array w of positive integers, where w[i] describes the weight of
//index i, write a function pickIndex which randomly picks an index in
//proportion to its weight.
//
//Note:
//
//1 <= w.length <= 10000
//1 <= w[i] <= 10^5
//pickIndex will be called at most 10000 times.
//Example 1:
//
//Input:
//["Solution","pickIndex"]
//[[[1]],[]]
//Output: [null,0]
//Example 2:
//
//Input:
//["Solution","pickIndex","pickIndex","pickIndex","pickIndex","pickIndex"]
//[[[1,3]],[],[],[],[],[]]
//Output: [null,0,1,1,1,0]
//Explanation of Input Syntax:
//
//The input is two lists: the subroutines
// called and their arguments. Solution's
// constructor has one argument, the array w.
// pickIndex has no arguments.
// Arguments are always wrapped with a list, even if there aren't any.


    /**
     * Your Solution object will be instantiated and called as such:
     * Solution obj = new Solution(w);
     * int param_1 = obj.pickIndex();
     */
    public int pickIndex() {
        int pos = random.nextInt(sum[sum.length - 1]);
        int l = 0, r = sum.length - 1;
        while (l < r) {
            int m = l + (r - l) / 2;
            if (sum[m] <= pos) l = m + 1;
            else r = m;
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
