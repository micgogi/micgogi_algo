package july21challenge;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/16/2021  9:57 AM
 * Rahul Gogyani
 */
public class LC611 {
    static public  void main(String args[]) {
        System.out.println(triangleNumber(new int[]{2, 2, 3, 4}));
    }

    public static int triangleNumber(int[] A) {
        Arrays.sort(A);
        int count = 0, n = A.length;
        for (int i = n - 1; i >= 2; i--) {
            int l = 0, r = i - 1;
            while (l < r) {
                if (A[l] + A[r] > A[i]) {
                    count += r - l;
                    r--;
                } else l++;
            }
        }
        return count;
    }
}

