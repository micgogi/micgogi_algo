import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 1/26/2021  3:48 PM
 * Rahul Gogyani
 */
public class LC1631 {
    public static void main(String args[]) {
        int[][] mat = {{1, 2, 2}, {3, 8, 2}, {5, 3, 5}};
        System.out.println(minimumEffortPath(mat));
    }

    static int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};

    public static int minimumEffortPath(int[][] heights) {
        int left = 0;
        int right = (int) 1e9 + 2;
        int row = heights.length;
        int col = heights[0].length;
        int[][] vis;

        while (left < right) {
            int mid = (left + right) / 2;
            vis = new int[105][105];
            valid(0, 0, mid, heights, vis);
            if (vis[row - 1][col - 1] == 1) {
                right = mid;
            } else {
                left = mid + 1;
            }

        }
        return left;
    }

    public static void valid(int x, int y, int mid, int[][] heigth, int[][] vis) {
        if (vis[x][y] == 0) {
            vis[x][y] = 1;
            int row = heigth.length;
            int col = heigth[0].length;
            for (int i = 0; i < 4; i++) {
                int X = x + dir[i][0];
                int Y = y + dir[i][1];
                if (X < 0 || X >= row || Y < 0 || Y >= col) continue;
                if (Math.abs(heigth[x][y] - heigth[X][Y]) <= mid) {
                    valid(X, Y, mid, heigth, vis);
                }
            }

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

