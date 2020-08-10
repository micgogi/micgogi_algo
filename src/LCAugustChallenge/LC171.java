package LCAugustChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/10/2020  3:00 PM
 * Rahul Gogyani
 */
public class LC171 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        //int t = sc.nextInt();
        String s = "KITAAN";
        int n = s.length();
        int e = 0;
        int t = n-1;
        for (int i = 0; i <s.length() ; i++) {
            int c = (int)Math.pow(26,t);
            int d = s.charAt(i)-'A'+1;
            e = e+ c*d;
            t--;

        }
        System.out.println(e);
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

