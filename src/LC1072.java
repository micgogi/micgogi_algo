import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/21/2020  4:35 PM
 * Rahul Gogyani
 */
public class LC1072 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[][] = {{0,0,0,0},{0,1,0,0},{1,0,1,1}};
        System.out.println(maxEqualRowsAfterFlips(a));
    }
    public static int maxEqualRowsAfterFlips(int[][] matrix) {
        HashMap<String,Integer> map = new HashMap<>();
        for (int row[]:matrix) {
            StringBuilder sb1 = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            for(int ele: row){
                sb1.append(ele);
                sb2.append(1-ele);
            }
            String s1 = sb1.toString();
            String s2 = sb2.toString();
            map.put(s1,map.getOrDefault(s1,0)+1);
            map.put(s2,map.getOrDefault(s2,0)+1);
        }
        int ans = 0;
        for(int val:map.values()){
            ans = Math.max(ans,val);
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

