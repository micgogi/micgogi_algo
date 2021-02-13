package LCFeb21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 2/13/2021  4:57 PM
 * Rahul Gogyani
 */
public class LC1091 {
    public static void main(String args[]) {
        int[][] grid = {{0,1},{1,0}};
        System.out.println(shortestPathBinaryMatrix(grid));
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int ans = 1;
        int n =grid.length;
        if(grid[0][0] == 1 || grid[n-1][n-1] == 1) return -1;
        Queue<int[]> queueu = new LinkedList<>();
        queueu.add(new int[]{0,0});
        grid[0][0] =1;

        while (!queueu.isEmpty()){
            int size = queueu.size();
            while (size-->0){
                int[] c = queueu.poll();
                int row = c[0];
                int col = c[1];
                if(row==n-1 && col==n-1)return ans;
                for(int i=row-1;i<=row+1;i++){
                    for(int j = col-1;j<=col+1;j++){
                        if(i==0&&j==0)continue;
                        if(i>=0 && i<n &&j>=0&&j<n&&grid[i][j]==0){
                            grid[i][j] =1;
                            queueu.add(new int[]{i,j});
                        }
                    }
                }
            }
            ans++;
        }
        return -1;
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

