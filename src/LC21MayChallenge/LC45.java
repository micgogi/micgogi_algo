package LC21MayChallenge;

import org.jetbrains.annotations.Contract;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/5/2021  7:48 PM
 * Rahul Gogyani
 */
public class LC45 {
    public static void main(String args[]) {
        System.out.println(jump(new int[]{2, 3, 1, 1, 4}));
    }


    public static int jump(int[] a) {
        int pos = 0, n = a.length, count = 0;
        while (pos < n - 1) {
            count++;
            int range = a[pos], next = a[pos];
            for (int i = 1; i <= a[pos]; i++) {
                if (pos + i >= n - 1) return count;
                if (i + a[pos + i] > range) {
                    range = i + a[pos + i];
                    next = i;
                }
            }
            pos += next;
        }
        return count;
    }
}

