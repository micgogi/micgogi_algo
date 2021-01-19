package LCJan21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 1/19/2021  3:55 PM
 * Rahul Gogyani
 */
public class LC5 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            System.out.println(longestPalindrome(sc.next()));
        }
    }
    public static String longestPalindrome(String str) {
        int n = str.length();
        if(n==0)return str;
        boolean table[][] = new boolean[n][n];
        int maxLength=1;
        for (int i = 0; i <n ; i++) {
            table[i][i]=true;
        }
        int start=0;
        for (int i = 0; i <n-1 ; i++) {
            if(str.charAt(i)==str.charAt(i+1)){
                table[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }
        for (int k = 3; k <=n; k++) {
            for (int i = 0; i < n-k+1; i++) {
                int j = i+k-1;
                if(table[i+1][j-1]&& str.charAt(i)==str.charAt(j)){
                    table[i][j]=true;
                    if(k>maxLength){
                        start = i;
                        maxLength=k;
                    }
                }
            }

        }
        return str.substring(start,start+maxLength);
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

