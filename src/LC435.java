import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/15/2020  12:46 PM
 * Rahul Gogyani
 */
public class LC435 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        //int t = sc.nextInt();
        int[][] intervals = {{1, 100}, {11, 22}, {1,11}, {2, 101}};
        System.out.println(eraseOverlapIntervals(intervals));

    }

    public static int eraseOverlapIntervals(int[][] intervals) {
        if (intervals.length == 1) return 0;
        Arrays.sort(intervals, (arr1, arr2) -> (Integer.compare(arr1[1], arr2[1])));
        int res = 0;
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] < end) {
                res++;
            } else {
                end = intervals[i][1];
            }
        }


        System.out.println(res);
        System.out.println(Arrays.deepToString(intervals));
        return res;
    }

    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in), 32768);
        }

        String next() {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble() {
            return Double.parseDouble(next());
        }

        String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

}

