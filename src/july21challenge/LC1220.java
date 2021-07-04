package july21challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/4/2021  1:07 PM
 * Rahul Gogyani
 */
public class LC1220 {
    public static void main(String args[]) {
        System.out.println(countVowelPermutation(158));
    }

    public static int countVowelPermutation(int n) {
        long a = 1, e = 1, i = 1, o = 1, u = 1;

        final int mod = (int)1e9+7;
        for (int j = 1; j <n; j++) {
            long aNew = (e + i + u) % mod;
            long eNew = (a + i) % mod;
            long iNew = (e + o) % mod;
            long oNew = (i) % mod;
            long uNew = (i + o) % mod;
            a = aNew;
            e = eNew;
            i = iNew;
            o = oNew;
            u = uNew;
        }

        return (int)  ((a + e + i + o + u) % mod);
    }
}

