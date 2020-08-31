import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/25/2020  12:15 PM
 * Rahul Gogyani
 */
public class IHS2 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        //  System.out.println(calFactor(t));
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int[] dp = new int[INF];
            for (int i = n; i <=m ; i++) {
                dp[i] = -1;
            }
            //usingdp
            int op = pathOptimized(n, m,dp);

            if (op >= INF) {
                System.out.println(-1);
            } else {
                System.out.println(op);
            }
//            int op1 = path(n,m);
//            if (op1 >= INF) {
//                System.out.println(-1);
//            } else {
//                System.out.println(op1);
//            }

        }
//        while (t--!=0){
//            int n = sc.nextInt();
//            int strat = n;
//            int m = sc.nextInt();
//           if(n%2==0&&m%2==0){
//               long total =0;
//                while (n<m){
//                    int div = n/2;
//                    if(div%2==1){
//                        int newdiv =caldiv(n, div);
//                        total+=(n/newdiv);
//                        n = n+newdiv;
//                    }else{
//                        total+=(n/div);
//                        n= n+div;
//                    }
//                }
//               System.out.println(strat);
//               System.out.println(m);
//               System.out.println(n);
//               System.out.println(total+(n-m));
//           }else{
//               System.out.println(-1);
//           }
//
//        }

    }

    final static int INF = 100007;

    //optimized O(n*sqrt(n))



    public static int pathOptimized(int cur, int m, int[] dp) {
        if (cur > m) {
            return INF;
        }
        if (cur == m) {
            return 0;
        }
        if (dp[cur] != -1) {
            return dp[cur];
        }
        int op = INF;
        for (int i = 2; i * i <= cur; i++) {
            if (cur % i == 0) {
                if (i % 2 == 0) {
                    op = Math.min(op, cur / i + pathOptimized(cur + i, m,dp));
                }
                if ((cur / i) != i && (cur / i) % 2 == 0) {
                    op = Math.min(op, cur / (cur / i) + pathOptimized(cur + (cur / i), m,dp));
                }
            }
        }
        return dp[cur] = op;
    }

    //O(2^n)
    public static int path(int cur, int m) {
        if (cur > m)
            return INF;
        if (cur == m) {
            return 0;
        }
        int op = INF;
        for (int i = 2; i * i <= cur; i++) {
            if (cur % i == 0) {
                if (i % 2 == 0) {
                    op = Math.min(op, cur / i + path(cur + i, m));
                }
                if ((cur / i) != i && (cur / i) % 2 == 0) {
                    op = Math.min(op, cur / (cur / i) + path(cur + (cur / i), m));
                }
            }
        }
        return op;

    }


    private static int caldiv(int n, int div) {
        for (int i = div - 1; i >= 2; i -= 2) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
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

