import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/15/2021  1:01 PM
 * Rahul Gogyani
 */
public class A381 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
        int a[] =sc.readArray(n);
        a381(a,n);
    }

    public static void a381(int a[],int n) {
        int sereja =0;
        int dima =0;
        int i =0;
        int j = a.length-1;
        boolean turn =true;
        while(i<=j){
            int chooseNum =0;
            if(a[i]>a[j]){
                chooseNum = a[i];
                i++;
            }else{
                chooseNum = a[j];
                j--;
            }
            if(turn){
                sereja+=chooseNum;
                turn = false;
            }else{
                dima+=chooseNum;
                turn = true;
            }
        }
        System.out.println(sereja+" "+dima);
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

