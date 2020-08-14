import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/14/2020  2:40 PM
 * Rahul Gogyani
 */
public class TESTTECH {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0) {
            String in = sc.nextLine();
            String s[] = in.split("");
            int[] array = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            long sum = array[0] + 3 * array[1] + 7 * array[2] + 9 * array[3] + array[4] + 3 * array[5] + 7 * array[6] + 9 * array[7] + array[8] + 3 * array[9] + array[10];
            if (sum % 10 == 0) {
                System.out.println("Y");
            } else {
                System.out.println("N");
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
    }

}

