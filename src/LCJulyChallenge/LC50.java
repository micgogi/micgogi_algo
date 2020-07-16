package LCJulyChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/16/2020  3:09 PM
 * Rahul Gogyani
 */
public class LC50 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();

        System.out.println(myPow(2,-4));
    }
    public static double myPow(double x, int m) {
        double temp=x;
        if(m==0)
            return 1;
        temp=myPow(x,m/2);
        if(m%2==0)
            return temp*temp;
        else
        {
            if(m > 0)
                return x*temp*temp;
            else
                return (temp*temp)/x;
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

