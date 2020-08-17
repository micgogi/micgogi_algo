import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/17/2020  5:02 PM
 * Rahul Gogyani
 */
public class B1392 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n];
            long d = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                d = Math.max(d, a[i]);
            }
            int noOfOperations = 0;
            if (k % 2 == 0) {
                noOfOperations = 2;
            } else {
                noOfOperations = 1;
            }
            long nextD = Long.MIN_VALUE;
            for (int j = 0; j < a.length; j++) {
                a[j] = d - a[j];
               nextD= Math.max(nextD,a[j]);
            }
            if(noOfOperations==2){
                for (int i = 0; i <a.length ; i++) {
                    a[i] = nextD-a[i];
                }
            }
            for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
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
    }

}

