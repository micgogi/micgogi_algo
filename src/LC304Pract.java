import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/17/2020  11:16 AM
 * Rahul Gogyani
 */
public class LC304Pract {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
       int a[][] = {{3,0,1,4,2},
               {5,6,3,2,1},
               {1,2,0,1,5},
               {4,1,0,1,7},
               {1,0,3,0,5}};
       int sum[][] = new int[a.length+1][a[0].length+1];
        for (int i = 1; i <=a.length ; i++) {
            for (int j = 1; j <=a[0].length ; j++) {
                sum[i][j] = sum[i-1][j]+sum[i][j-1]-sum[i-1][j-1]+a[i-1][j-1];
            }
        }
        System.out.println(Arrays.deepToString(sum));
        System.out.println(sumRegion(2,1,4,3,sum));


    }
    public static int sumRegion(int r1, int c1, int r2, int c2, int sum[][]){
        r1++;c1++;r2++;c2++;
        return sum[r2][c2]-sum[r1-1][c2]-sum[r2][c1-1]+sum[r1-1][c1-1];

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

