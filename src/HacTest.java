import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/30/2020  12:49 PM
 * Rahul Gogyani
 */
public class HacTest {


    public static void main(String args[]) throws IOException {
        FastReader sc = new FastReader();
        int t = sc.nextInt();


        while (t-- != 0) {
            String str = sc.nextLine();
            String result = "";
            char c = str.charAt(0);
            result = result + Character.toLowerCase(c);
            for (int i = 1; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (Character.isUpperCase(ch)) {
                    result = result + '_';
                    result = result + Character.toLowerCase(ch);
                } else {
                    result = result + ch;
                }
            }
            System.out.println(result);

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

