package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/27/2021  6:57 PM
 * Rahul Gogyani
 */
public class LC16 {


    public static void main(String[] args) {
        int a[] = {-1, 2, 1, -4};
        int target = 1;
        Arrays.sort(a);
        int diff = Integer.MAX_VALUE;
        int close = 0;
        for (int i = 0; i < a.length - 2; i++) {
            int j = i + 1;
            int k = a.length - 1;
            while (j < k) {


                int f = a[i];
                int s = a[j];
                int t = a[k];
                int sum = f + s + t;
                int newDiff = Math.abs(sum - target);
                if (newDiff < diff) {
                    diff = newDiff;
                    close = sum;
                }
                if (sum > target) k--;
                else if (sum < target) j++;
                else {
                    System.out.println(target);
                    break;
                }

            }
        }
        System.out.println(close);
    }
}
