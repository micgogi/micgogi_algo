import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/18/2020  11:02 AM
 * Rahul Gogyani
 */
public class D1391 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        // int t = sc.nextInt();

        int n = sc.nextInt();
        int m = sc.nextInt();
        char in[];
        int[][] grid = new int[n][m];
        for (int i = 0; i < n; i++) {
            in = sc.next().toCharArray();
            for (int j = 0; j < m; j++) {
                grid[i][j] = in[j] - '0';
            }
        }
        if (n >= 4 && m >= 4) {
            System.out.println(-1);
        } else if (n == 1 || m == 1) {
            System.out.println(0);
        } else if (n == 2) {
            boolean[] ff = new boolean[m];
            for (int i = 0; i < m; i++) {
                if ((grid[0][i] + grid[1][i]) % 2 == 0) {
                    ff[i] = true;
                }
            }
            int c1 = 0, c2 = 0;
            for (int i = 0; i < ff.length; i++) {
                if (ff[i] && i % 2 == 0) {
                    c1++;
                } else if (ff[i] && i % 2 == 1) {
                    c2++;
                } else if (!ff[i] && i % 2 == 0) {
                    c2++;
                } else {
                    c1++;
                }
            }
            System.out.println(Math.min(c1, c2));
        } else if (n == 3) {
            int even_odd = 0;
            int odd_even = 0;
            int even_even = 0;
            int odd_odd = 0;
            for (int i = 0; i < m; i++) {
                int z1 = 0;
                int z2 = 0;
                if (grid[0][i] == 1) {
                    z1++;
                }
                if (grid[1][i] == 1) {
                    z1++;
                    z2++;
                }
                if (grid[2][i] == 1) {
                    z2++;
                }
                if ((z1 % 2 == i % 2 || z2 % 2 == i % 2)) {
                    even_even++;
                }
                if ((z1 % 2 == i % 2 || z2 % 2 != i % 2)) {
                    even_odd++;
                }
                if ((z1 % 2 != i % 2 || z2 % 2 == i % 2)) {
                    odd_even++;
                }
                if ((z1 % 2 != i % 2 || z2 % 2 != i % 2)) {
                    odd_odd++;
                }
            }
            int ans[] = {even_even, odd_even, even_odd, odd_odd};
            System.out.println(Arrays.stream(ans).min().getAsInt());
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

