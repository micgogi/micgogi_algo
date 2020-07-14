package LCJulyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2020  12:53 PM
 * Rahul Gogyani
 */
public class LC1344 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int hour =1;
        int min = 57;
        double minAngle = min*6;
        double hourAngle = hour*30;
        if(hourAngle==360)hourAngle=0;
        hourAngle = hourAngle+(1.0*min/60)*30;
        System.out.println(hourAngle);
        System.out.println(Math.abs(hourAngle-minAngle));
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

