package LCFeb21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
  * @author Micgogi
  * on 2/12/2021  1:51 PM
  * Rahul Gogyani
  */public class LC1342 {
    public int numberOfSteps (int num) {
        int count =0;
        while(num!=0){
            if(num%2==0){
                num/=2;
            }else{
                num--;
            }
            count++;
        }
        return count;
    }
    public static void main(String args[]){
     FastReader sc = new FastReader();
        int t = sc.nextInt();
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
			int[] a=new int[n];
			for (int i=0; i<n; i++) a[i]=nextInt();
			return a;
		}
		  int[][] read2DArray(int n){
            int[][] a = new int[n][n];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <n ; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
        int[][] read2DArray(int n, int m){
            int[][] a = new int[n][m];
            for (int i = 0; i <n ; i++) {
                for (int j = 0; j <m ; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

