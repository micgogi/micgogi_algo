
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;
import java.util.StringTokenizer;
import java.util.TreeMap;

/**
 * @author Micgogi
 * on 8/22/2020  2:49 PM
 * Rahul Gogyani
 */
public class LC497 {
    Random random;
    TreeMap<Integer, int[]> map;
    int area;

    public LC497(int[][] rects) {
        random = new Random();
        map = new TreeMap<>();
        area = 0;
        for (int[] r : rects) {
            int x1 = r[0], y1 = r[1], x2 = r[2], y2 = r[3];
            area += (x2 - x1 + 1) * (y2 - y1 + 1);
            map.put(area,r);
        }

    }

    public int[] pick() {
        int key = map.ceilingKey(random.nextInt(area)+1);
        int[] currentRec =  map.get(key);
        int x1 = currentRec[0];
        int y1 = currentRec[1];
        int x2 = currentRec[2];
        int y2 = currentRec[3];
        int lenght = x2-x1;
        int width = y2-y1;
        int x = x1+random.nextInt(lenght+1);
        int y = y1+random.nextInt(width+1);
        return new int[]{x,y};
    }

    public static void main(String args[]) {

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

