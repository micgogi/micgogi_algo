import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/30/2021  5:08 PM
 * Rahul Gogyani
 */
public class A1592 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        long t = sc.nextLong();
        while (t-- != 0) {
            int n = sc.nextInt();
            long H = sc.nextLong();

            Long a[] = new Long[n];

            for (int i = 0; i < n; i++) {
                a[i]=sc.nextLong();
            }
            Arrays.sort(a);

            if(H<=a[n-1]){
                System.out.println(1);
                continue;
            }
            long count = (H/(a[n-1]+a[n-2]))*2;
            if(H%(a[n-1]+a[n-2])>0){
                count+=(H%(a[n-1]+a[n-2])<=a[n-1]?1:2);
            }
            System.out.println(count);


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

