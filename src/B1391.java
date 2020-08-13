import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  10:16 AM
 * Rahul Gogyani
 */
public class B1391 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int row = sc.nextInt();
            int col = sc.nextInt();
            char c[][] = new char[row][col];
            for (int i = 0; i < row; i++) {
                String s = sc.nextLine();
                for (int j = 0; j < col; j++) {
                    c[i][j] = s.charAt(j);
                }
            }
            int count = 0;
            for (int i = 0; i < row; i++) {
                if (c[i][col - 1] == 'R') {
                    count++;
                }
            }
            for (int i = 0; i < col; i++) {
                if (c[row - 1][i] == 'D') {
                    count++;
                }
            }

            System.out.println(count);

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
    }

}

