import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  11:22 AM
 * Rahul Gogyani
 */
public class C1391 {
    private static final long MOD = (long) (1e9+7);
    public static void main(String args[]) {
        FastReader sc = new FastReader();

            int n = sc.nextInt();
            long p = 1;
            long fact = 1;
            for (int i = 1; i < n; i++) {
                p = (p*2)%MOD;
            }
            for (int i = 1; i <=n ; i++) {
                fact = (fact*i)%MOD;
            }
            System.out.println((fact-p+MOD)%MOD);

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

