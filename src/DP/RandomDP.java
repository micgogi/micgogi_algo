package DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/4/2020  7:10 PM
 * Rahul Gogyani
 */
public class RandomDP {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        long[] dp1 = new long[1<<n];
        long[] dp2 = new long[1<<n];
        Arrays.fill(dp1,1000000000000000000L);
        Arrays.fill(dp2,Long.MIN_VALUE);
        dp1[0] = 0;
        dp2[0] = 0;
        for(int i=0;i<(1<<n);i++){
            for(int j=0;j<n;j++){
                if((i&(1<<j))==0){
                    for(int k=j+1;k<n;k++){
                        if((i&(1<<k))==0){
                            int t = i+(1<<j)+(1<<k);
                            dp1[t] = Math.min(dp1[t],dp1[i]+(a[j]^a[k]));
                            dp2[t] = Math.max(dp2[t],dp2[i]+(a[j]^a[k]));
                        }

                    }
                    break;
                }
            }
        }
        System.out.println(dp1[(1<<n)-1]+" "+dp2[(1<<n)-1]);
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

