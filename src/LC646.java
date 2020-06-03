import java.sql.Time;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/3/2020  8:21 AM
 * Rahul Gogyani
 */
public class LC646 {
    public static void main(String[] args) {
        int[][] pairs = {{1, 2}, {2, 3}, {3, 4}};
        System.out.println(slow(pairs));
        System.out.println(fast(pairs));

    }
    //Time complexity O(n*logn)
    public static int fast(int[][] pairs) {
        int len = 0;
        Arrays.sort(pairs, (a, b) -> a[1] - b[1]);
        int pre = Integer.MIN_VALUE;
        for (int num[] : pairs) {
            if (num[0] > pre) {
                len++;
                pre = num[1];
            } else if (num[1] < pre) {
                pre = num[1];
            }
        }
        return len;
    }

    //Time complexity O(n*n)
    public static int slow(int[][] pairs) {
        Arrays.sort(pairs, (a, b) -> a[0] - b[0] + a[1] - b[1]);
        System.out.println(Arrays.deepToString(pairs));
        int dp[] = new int[pairs.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < pairs.length; i++) {
            for (int j = 0; j < i; j++) {
                int c[] = pairs[i];
                int d[] = pairs[j];
                if (d[1] < c[0] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                }
            }
        }
        int max = Arrays.stream(dp).max().getAsInt();
        System.out.println(max);
        return max;
    }
}
