package LCFeb21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 2/16/2021  2:02 PM
 * Rahul Gogyani
 */
public class LC784 {
    public static void main(String args[]) {
        String s = "a65k78t75n73i84a65";
        System.out.println(letterCasePermutation(s));

    }

    public static List<String> letterCasePermutation(String S) {
        int n = S.length();
        List<String> ans = new ArrayList<>();
        rec(S, n, 0, ans, "");
        return ans;
    }

    public static void rec(String s, int n, int i, List<String> ans, String res) {
        if (i == n) {
            ans.add(res);
            return;
        }
        if (Character.isAlphabetic(s.charAt(i))) {
            char lowe = Character.toLowerCase(s.charAt(i));
            rec(s, n, i + 1, ans, res + lowe);
            char up = Character.toUpperCase(s.charAt(i));
            rec(s, n, i + 1, ans, res + up);
        } else {
            rec(s, n, i + 1, ans, res + s.charAt(i));
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

