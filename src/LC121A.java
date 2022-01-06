import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 1/6/2022  1:49 PM
 * Rahul Gogyani
 */
public class LC121A {
    public static void main(String args[]) {
        System.out.println(new LC121A().maxPrice(new int[]{7, 1, 5, 3, 6, 4}));
    }

    public int maxPrice(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}

