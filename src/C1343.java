import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2020  4:21 PM
 * Rahul Gogyani
 */
public class C1343 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
            }
            int i=0;
            long sum =0;

            while (i<n){
                int cur = a[i];
                if(cur<0){
                    int max = cur;
                    while (i<n&&a[i]<0){
                        max = Math.max(max,a[i]);
                        i++;
                    }
                    sum+=max;
                }else{
                    int max = cur;
                    while (i<n&&a[i]>0){
                        max = Math.max(max,a[i]);
                        i++;
                    }
                    sum+=max;
                }

            }
            System.out.println(sum);
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

