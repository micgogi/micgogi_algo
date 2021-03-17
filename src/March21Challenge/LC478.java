package March21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 3/17/2021  8:11 PM
 * Rahul Gogyani
 */
public class LC478 {
    public static void main(String args[]) {
        LC478 lc478 = new LC478(1, 0, 0);
        System.out.println(Arrays.toString(lc478.randPoint()));
        System.out.println(Arrays.toString(lc478.randPoint()));
        System.out.println(Arrays.toString(lc478.randPoint()));
        System.out.println(Arrays.toString(lc478.randPoint()));
    }

    double rad;
    double x;
    double y;


    public LC478(double radius, double x_center, double y_center) {
        this.rad = radius;
        this.x = x_center;
        this.y = y_center;

    }

    public double[] randPoint() {

        double r = rad * Math.sqrt(Math.random());
        double theta = Math.random()*2*Math.PI;
        return new double[]{x + r * Math.cos(theta), y + r * Math.sin(theta)};
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

