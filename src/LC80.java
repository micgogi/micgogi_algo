import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/15/2020  11:18 AM
 * Rahul Gogyani
 */
public class LC80 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[] = {1,1,1,2,2,3};
        int i=2;
        for (int j = 2; j <a.length ; j++) {
            if(a[j]!=a[i-2]){
                a[i++]= a[j];
            }
        }

        System.out.println(Arrays.toString(a));
        System.out.println(i);
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

