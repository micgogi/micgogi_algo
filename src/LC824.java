import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/19/2020  12:37 PM
 * Rahul Gogyani
 */
public class LC824 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        // int t = sc.nextInt();
        System.out.println(toGoatLatin("The quick brown fox jumped over the lazy dog"));

    }

    public static String toGoatLatin(String S) {
        S = S.trim();
        String s[] = S.split(" ");
        Set<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length; i++) {
            StringBuilder word = new StringBuilder(s[i]);
            char ch = word.charAt(0);
            int j = i + 1;
            if (set.contains(ch)) {
                sb.append(s[i]);
            } else {
                char newChar = word.charAt(0);
                word.deleteCharAt(0);

                sb.append(word.toString()).append(newChar);
            }
            sb.append("ma");
            while (j-- != 0) {
                sb.append("a");
            }
            sb.append(i == s.length - 1 ? "" : " ");

        }
        return sb.toString();

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

