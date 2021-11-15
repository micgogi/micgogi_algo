import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/15/2021  11:51 AM
 * Rahul Gogyani
 */
public class A339 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        String s = sc.next();
        System.out.println(a339(s));
    }

    public static String a339(String s){
        int[] count = new int[4];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)=='1')count[1]++;
            else if(s.charAt(i)=='2')count[2]++;
            else if(s.charAt(i)=='3')count[3]++;
        }
        StringBuilder ans = new StringBuilder();

            while (count[1]!=0){
                ans.append("1+");
                count[1]--;
            }
            while (count[2]!=0){
                ans.append("2+");
                count[2]--;
            }
            while (count[3]!=0){
                ans.append("3+");
                count[3]--;
            }


        if(ans.charAt(ans.length()-1)=='+')ans.deleteCharAt(ans.length()-1);
        return ans.toString();
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

