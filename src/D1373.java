import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/3/2020  1:21 PM
 * Rahul Gogyani
 */
public class D1373 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            long a[] = new long[n];
            long evenSum=0;
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextLong();
                if(i%2==0)evenSum+=a[i];
            }
            long maxDiffSum=0;
            long prefixSum =0;
            for (int i = 1; i <n ; i+=2) {
                prefixSum = Math.max(prefixSum+a[i]-a[i-1],0);
                maxDiffSum = Math.max(maxDiffSum,prefixSum);
            }
            prefixSum = 0;
            for (int i = 1; i <n-1 ; i+=2) {
                prefixSum = Math.max(prefixSum+a[i]-a[i+1],0);
                maxDiffSum = Math.max(maxDiffSum,prefixSum);

            }
            System.out.println(evenSum+maxDiffSum);

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
