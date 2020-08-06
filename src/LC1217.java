import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/6/2020  4:01 PM
 * Rahul Gogyani
 */
public class LC1217 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        int a[] = new int[t];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(minCostToMoveChips(a));
    }

    public static int minCostToMoveChips(int[] chips) {
        int oddpos = 0;
        int evenpos = 0;
        for (int i = 0; i <chips.length ; i++) {
            if((chips[i]&1)==1)oddpos++;
            else evenpos++;
        }
        return Math.min(oddpos,evenpos);
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

