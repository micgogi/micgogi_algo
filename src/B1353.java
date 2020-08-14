import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/14/2020  4:07 PM
 * Rahul Gogyani
 */
public class B1353 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            Integer a[] = new Integer[n];
            Integer b[] = new Integer[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }


            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }
            Arrays.sort(a);
            Arrays.sort(b, Collections.reverseOrder());
            int totalsum = 0;
            for (int i = 0; i < n; i++) {
                if(i<k)totalsum+=Math.max(a[i],b[i]);
                else totalsum+=a[i];
            }
            System.out.println(totalsum);

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

