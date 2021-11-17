import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/17/2021  4:51 PM
 * Rahul Gogyani
 */
public class D1607 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            Long a[] = new Long[n];
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextLong();
            }
            String s = sc.nextLine();
            List<Long> blue = new ArrayList<>();
            List<Long> red = new ArrayList<>();
            for (int i = 0; i < a.length; i++) {
                if (s.charAt(i) == 'B') blue.add(a[i]);
                else red.add(a[i]);
            }
            Collections.sort(blue);
            Collections.sort(red);
            boolean flag = true;
            int current = 1;
            for (int i = 0; i < blue.size(); i++) {
                if (blue.get(i) < current) {
                    flag = false;

                }
                current++;
            }
            for (int i = 0; i < red.size(); i++) {
                if (red.get(i) > current) {
                    flag = false;

                }
                current++;
            }
            System.out.println(flag ? "YES" : "NO");


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

