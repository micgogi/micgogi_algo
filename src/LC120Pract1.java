import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/18/2020  11:36 AM
 * Rahul Gogyani
 */
public class LC120Pract1 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[][] = {{2,0,0,0},{3,4,0,0},{6,5,7,0},{4,1,8,3}};
        int dp[][] = new int[a.length][a.length];
        int last[] = a[a.length-1];
        for (int i = 0; i <a.length; i++) {
            dp[a.length-1][i]=last[i];
        }
        for (int i = a.length-2; i >=0 ; i--) {

            for (int j = 0; j <a[i].length-1 ; j++) {
                dp[i][j] = a[i][j]+Math.min(dp[i+1][j],dp[i+1][j+1]);
            }
        }
        System.out.println(Arrays.deepToString(dp));
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

