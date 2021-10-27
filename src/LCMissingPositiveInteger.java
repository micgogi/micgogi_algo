import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 10/27/2021  4:26 PM
 * Rahul Gogyani
 */
public class LCMissingPositiveInteger {
    public static void main(String args[]) {
        System.out.println(missingPositiveInteger(new int[]{3, 4, -1, 1}));
    }

    public static int missingPositiveInteger(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            while (a[i] > 0 && a[i] <= n && a[a[i] - 1] != a[i]) {
                int temp = a[a[i] - 1];
                a[a[i] - 1] = a[i];
                a[i] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (a[i] != i + 1) {
                return i + 1;
            }
        }
        return n + 1;
    }


}

