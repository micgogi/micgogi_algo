import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 1/21/2021  8:24 PM
 * Rahul Gogyani
 */
public class LC1673 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int k = 3;
        // int n = sc.nextInt();
        int[] a = {71, 18, 52, 29, 55, 73, 24, 42, 66, 8, 80, 2};
//        for (int i = 0; i < a.length; i++) {
//            a[i] = sc.nextInt();
//        }
        System.out.println(Arrays.toString(mostCompetitive(a, k)));
    }

    public static int[] mostCompetitive(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[k];
        for (int i = 0; i < nums.length; i++) {

            while (!stack.isEmpty() && nums[i] < nums[stack.peek()] && nums.length - i + stack.size() > k) {
                stack.pop();
            }
            if (stack.size() < k) {
                stack.push(i);
            }
        }
        for (int i = k - 1; i >= 0; i--) {
            res[i] = nums[stack.pop()];
        }
        return res;

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

