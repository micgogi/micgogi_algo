import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 9/18/2021  11:17 AM
 * Rahul Gogyani
 */
public class LC1235 {
    public static void main(String args[]) {
        System.out.println(jobSchedling(new int[]{1, 2, 3, 3}, new int[]{3, 4, 5, 6}, new int[]{50, 10, 40, 70}));
    }

    public static int jobSchedling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;

        int[][] job = new int[n][3];
        for (int i = 0; i < n; i++) {
            job[i] = new int[]{startTime[i], endTime[i], profit[i]};
        }
        Arrays.sort(job, (a, b) -> a[1] - b[1]);
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] j : job) {
            int cur = dp.floorEntry(j[0]).getValue() + j[2];
            if (cur > dp.lastEntry().getValue()) {
                dp.put(j[1], cur);
            }

        }
        return dp.lastEntry().getValue();
    }
}

