import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2021  9:38 AM
 * Rahul Gogyani
 */
public class LC56Test {
    public static void main(String args[]) {
        System.out.println(Arrays.deepToString(new LC56Test().merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0 || intervals.length == 1) return intervals;
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] currInt = intervals[0];
        ans.add(currInt);
        for (int[] intr : intervals) {
            int currEnd = currInt[1];
            int nextBegin = intr[0];
            int nextEnd = intr[1];
            if (nextBegin <= currEnd) {
                currInt[1] = Math.max(currEnd, nextEnd);
            } else {
                currInt = intr;
                ans.add(currInt);
            }
        }
        return ans.toArray(new int[ans.size()][]);


    }

}

