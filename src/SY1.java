import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/23/2020  3:33 PM
 * Rahul Gogyani
 */
public class SY1 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = sc.readArray(n);
            int maxInc = 1, incLen = 1;
            for (int i = 1; i < a.length; i++) {
                if (a[i] >= a[i - 1]) incLen++;
                else {
                    if (maxInc < incLen) {
                        maxInc = incLen;
                    }
                    incLen = 1;
                }
            }
            if (maxInc < incLen) {
                maxInc = incLen;
            }
            int maxDec = 1, lenDec = 1;
            for (int i = 1; i < a.length; i++) {
                if (a[i] <= a[i - 1]) lenDec++;
                else {
                    if (maxDec < lenDec) {
                        maxDec = lenDec;
                    }
                    lenDec = 1;
                }
            }
            if (maxDec < lenDec) {
                maxDec = lenDec;
            }
            System.out.println(Math.max(maxDec, maxInc));
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

