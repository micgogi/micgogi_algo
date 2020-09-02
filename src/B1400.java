import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/2/2020  11:47 AM
 * Rahul Gogyani
 */
public class B1400 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            long p = sc.nextLong(), f = sc.nextLong(), cnts = sc.nextLong(), cntw = sc.nextLong(), s = sc.nextLong(), w = sc.nextLong();
            if (s > w) {
                long temp = s;
                s = w;
                w = temp;
                long temp1 = cnts;
                cnts = cntw;
                cntw = temp1;
            }
            long ans = 0;
            for (int i = 0; i <=cnts; i++) {
                if (i * s > p) continue;
                long sf = i;
                long ss = Math.min(f / s, cnts - i);
                long left_f = p - (sf * s);
                long left_s = f - (ss * s);
                long wf = Math.min(cntw, left_f / w);
                long ws = Math.min(left_s / w, cntw - wf);
                ans = Math.max(ans, sf + ss + wf + ws);
            }
            System.out.println(ans);
        }
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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

