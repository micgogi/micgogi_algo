import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/10/2020  8:23 PM
 * Rahul Gogyani
 */
public class B1399 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];
            int mina = Integer.MAX_VALUE;
            int minb = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
                if (a[i] < mina) mina = a[i];
            }
            for (int i = 0; i < b.length; i++) {
                b[i] = sc.nextInt();
                if (b[i] < minb) minb = b[i];
            }
            long res = 0;
            for (int i = 0; i < n; i++) {
                res += Math.max(a[i] - mina, b[i] - minb);
            }
            System.out.println(res);
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
    }

}

