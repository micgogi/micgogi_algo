import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/12/2020  10:44 AM
 * Rahul Gogyani
 */
public class C1409 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            if (n == 2) {
                b[0] = x;
                b[1] = y;
                for (int i = 0; i < n; i++) {
                    System.out.print(b[i] + " ");
                }
            } else {
                b[n - 1] = (int) 1e9 + 5;
                for (int i = 0; i < n; i++) {
                    for (int j = i + 1; j < n; j++) {
                        a[i] = x;
                        a[j] = y;
                        int diff = y - x;
                        int dist = j - i;
                        if (diff % dist == 0) {
                            diff = diff / dist;
                            for (int k = i - 1; k >= 0; k--) {
                                a[k] = a[k + 1] - diff;
                            }
                            for (int k = i + 1; k < n; k++) {
                                a[k] = a[k - 1] + diff;
                            }
                            if (a[0] > 0 && a[n - 1] < b[n - 1]) {
                                b = Arrays.copyOf(a, a.length);
                            }
                        }
                    }
                }
                for (int i = 0; i < b.length; i++) {
                    System.out.print(b[i] + " ");
                }
            }
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

