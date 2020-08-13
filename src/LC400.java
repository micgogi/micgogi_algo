import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/13/2020  2:58 PM
 * Rahul Gogyani
 */
public class LC400 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        System.out.println(findnthdigit(14));

    }

    public static int findnthdigit(int n) {
        int len = 1;
        long count = 9;
        int start = 1;
        while (n > len * count) {
            n-=len* count;
            len++;
            count *=10;
            start *=10;
        }
        start+=(n-1)/len;
        String s = Integer.toString(start);
        return Character.getNumericValue(s.charAt((n-1)%len));
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

