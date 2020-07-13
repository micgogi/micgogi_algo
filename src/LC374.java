import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/13/2020  11:03 AM
 * Rahul Gogyani
 */
public class LC374 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();

    }
    /**
     * Forward declaration of guess API.
     * @param  n  your guess
     * @return 	     -1 if num is lower than the guess number
     *			      1 if num is higher than the guess number
     *               otherwise return 0
     * int guess(int num);
     */
    public static int guessNumber(int n) {
        int left = 1, right = n;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == 1) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
    public static int guess(int num){
        return 0;
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

