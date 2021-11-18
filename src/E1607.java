import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/18/2021  9:54 AM
 * Rahul Gogyani
 */
public class E1607 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String s = sc.nextLine();
            int imin = 0, imax = 0, jmin = 0, jmax = 0, i = 0, j = 0;
            for (int k = 0; k < s.length(); k++) {
                if (s.charAt(k) == 'L') {
                    j--;
                } else if (s.charAt(k) == 'R') {
                    j++;
                } else if (s.charAt(k) == 'U') {
                    i--;
                } else {
                    i++;
                }
                if(Math.max(i,imax)-Math.min(i,imin)>=n||Math.max(j,jmax)-Math.min(j,jmin)>=m){
                    break;
                }
                imin = Math.min(i,imin);
                imax = Math.max(i,imax);
                jmin = Math.min(j,jmin);
                jmax =Math.max(j,jmax);

            }
            i= 1-imin;
            j= 1-jmin;
            System.out.println(i+" "+j);

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

