import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/13/2020  2:39 PM
 * Rahul Gogyani
 */
public class LC57 {
    public static void main(String args[]) {
        int[][] intervals = {{1, 2}, {3, 5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4, 8};
        List<int[]> result = new ArrayList<>();
        int i = 0;
        int start = newInterval[0];
        int end = newInterval[1];
        while (i < intervals.length && intervals[i][1] < start) {
            result.add(intervals[i]);
            i++;
        }
        while (i < intervals.length && intervals[i][0] <= end) {
            start = Math.min(start, intervals[i][0]);
            end = Math.max(end, intervals[i][1]);
            i++;
        }
        result.add(new int[]{start,end});
        while (i<intervals.length){
            result.add(intervals[i]);
            i++;
        }
        System.out.println(Arrays.deepToString(result.toArray()));

    }

}

