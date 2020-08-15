import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/15/2020  11:26 AM
 * Rahul Gogyani
 */
public class C1326 {
    private static final int MOD = 998244353;

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        long sum = 0;
        int prev = -1;
        long ways = 1;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if (a[i] > n - k) {
                sum += a[i];
                if (prev != -1) {
                    ways = (ways * (i - prev)) % MOD;
                }
                prev = i;
            }
        }
        System.out.println(sum+" "+ways);

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

