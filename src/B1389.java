import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  3:39 PM
 * Rahul Gogyani
 */
public class B1389 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int z = sc.nextInt();
            long dp[][] ;
            int a[] = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
           dp = new long[n+1][6];
            for (int i = 0; i <n+1; i++) {
                Arrays.fill(dp[i], -1);
            }
            long ans = a[0] + calc(a, 1, k, z, n, dp);
            System.out.println(ans);

        }
    }

    public static long calc(int a[], int i, int k, int z, int n, long dp[][]) {
        if (k == 0 || i >= n || i < 0) {
            return 0;
        }
        if (dp[i][z] != -1) {
            return dp[i][z];
        }
        long val = 0;
        if (i < n) {
            val = Math.max(val, a[i] + calc(a, i + 1, k - 1, z, n, dp));
        }
        if (i >= 0 && z > 0) {
            val = Math.max(val, a[i] + calc(a, i - 1, k - 1, z - 1, n, dp));
        }
        return dp[i][z] = val;
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

