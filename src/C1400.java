import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/2/2020  10:41 AM
 * Rahul Gogyani
 */
public class C1400 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            char[] c = sc.next().toCharArray();
            int x = sc.nextInt();
            int n = c.length;
            char[] ans = new char[n];
            Arrays.fill(ans, '1');
            for (int i = 0; i < n; i++) {
                if (c[i] == '0') {
                    if (check(i - x, n)) ans[i - x] = '0';
                    if (check(i + x, n)) ans[i + x] = '0';
                }
            }
            boolean flag = false;
            for (int i = 0; i < n; i++) {
                if (c[i] == '1') {
                    if (check(i - x, n) && ans[i - x] == '1') continue;
                    if (check(i + x, n) && ans[i + x] == '1') continue;
                    flag = true;
                }
            }
            if(flag) System.out.println(-1);
            else System.out.println(ans);
        }
    }

    public static boolean check(int x, int n) {
        return x >= 0 && x < n;
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

