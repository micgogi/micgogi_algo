import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/12/2020  12:27 PM
 * Rahul Gogyani
 */
public class E1360 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int a[][] = new int[n][n];
            for (int i = 0; i <n ; i++) {
                String s = sc.nextLine();
                for (int j = 0; j <n ; j++) {
                    a[i][j] = Integer.parseInt(""+s.charAt(j));
                }
            }
            boolean ans = true;
            for (int i = n-2; i >=0 ; i--) {
                for (int j = n-2; j >=0 ; j--) {
                    if(a[i][j]==1&&a[i+1][j]==0&&a[i][j+1]==0){
                        ans=false;
                    }
                }
            }
            System.out.println(ans?"YES":"NO");
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
    }

}

