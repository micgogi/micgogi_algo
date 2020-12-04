package LCDecChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2020  6:00 PM
 * Rahul Gogyani
 */
public class LC1492 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while(t--!=0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            System.out.println(kthFactor(n,k));


        }
    }
    public static int kthFactor(int n, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    pq.add(n / i);
                } else {
                    pq.add(n / i);
                    pq.add(i);
                }
            }
        }
        int i = 0;
        int ans = -1;
        if (k <=pq.size()) {
            while (i != k) {
                i++;
                ans = pq.poll();
            }
        }
        return  ans;
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

