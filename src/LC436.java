import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 8/27/2020  12:53 PM
 * Rahul Gogyani
 */
public class LC436 {
    public static void main(String args[]) {
        int[][] intervals = {{1,2}};
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }
    public static int[] findRightInterval(int[][] intervals) {
        TreeMap<Integer,Integer> map = new TreeMap<>();
        for (int i = 0; i < intervals.length ; i++) {
            map.put(intervals[i][0],i);
        }
        int res[] = new int[intervals.length];
        for (int i = 0; i < intervals.length; i++) {
            res[i] = map.ceilingKey(intervals[i][1])==null?-1:map.get( map.ceilingKey(intervals[i][1]));
        }
        return res;
    }
}

