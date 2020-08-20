import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/20/2020  10:40 AM
 * Rahul Gogyani
 */
public class B1372 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            if((n&1)==0){
                int res = n/2;
                System.out.println(res+" "+res);
            }else {

                int res =1;
                for (int i = 2; i*i <=n ; i++) {
                      if(n%i==0){
                         res = Math.max(res, n/i);
                      }
                }
                System.out.println(res+" "+(n-res));
            }
        }
    }
//    public static int lcm(int a, int b){
//        return (a*b)/gcd(a,b);
//    }
//    public static int gcd(int a, int b){
//        if(a==0)return b;
//        return gcd(b%a,a);
//    }

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

