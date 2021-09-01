import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 2/28/2021  3:11 PM
 * Rahul Gogyani
 */
public class LC895 {
    HashMap<Integer, Integer> countMap;
    HashMap<Integer, Stack<Integer>> stackHashMap;
    int maxCount;

    public LC895() {
        this.countMap = new HashMap<>();
        this.stackHashMap = new HashMap<>();
        this.maxCount = 0;
    }

    public void push(int x) {

        countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        stackHashMap.putIfAbsent(countMap.get(x), new Stack<>());
        stackHashMap.get(countMap.get(x)).push(x);
        if (countMap.get(x) > maxCount) maxCount = countMap.get(x);
    }

    public int pop() {
        int x = stackHashMap.get(maxCount).pop();
        countMap.put(x, countMap.get(x) - 1);
        if (stackHashMap.get(maxCount).isEmpty()) {
            maxCount--;
        }
        return x;
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

