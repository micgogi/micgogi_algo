import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 9/1/2020  2:24 PM
 * Rahul Gogyani
 */
public class LC949 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int a[] = {1,2,3,4};
        System.out.println(largestTimeFromDigits(a));
    }
    public static String largestTimeFromDigits(int[] A) {
        String ans = "";
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <4 ; j++) {
                for (int k = 0; k <4 ; k++) {
                    if(i==j||j==k||k==i)continue;
                    String h = ""+A[i]+A[j];
                    String m = ""+A[k]+A[6-i-j-k];
                    String t = h+":"+m;
                    if(h.compareTo("24")<0&&m.compareTo("60")<0&&ans.compareTo(t)<0){
                        ans = t;
                    }
                }
            }
        }
        return ans;
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

