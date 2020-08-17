import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  9:59 AM
 * Rahul Gogyani
 */
public class LC121Pract {
    public static void main(String args[]) {
        int a[] = {7, 1, 5, 3, 6, 4};
        int cur = 0;
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            cur += a[i] - a[i - 1];
            cur = Math.max(0, cur);
            max = Math.max(cur, max);
        }
        System.out.println(max);
    }
}

