import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/12/2020  12:42 PM
 * Rahul Gogyani
 */
public class LC190 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t =sc.nextInt();
        System.out.println(reverse(t));

    }


    public static int reverse(int n){
    if(n==0)return 0;
    int rs =0;
        for (int i = 0; i <32 ; i++) {
            rs<<=1;
            if((n&1)==1)rs++;
            n>>=1;
        }
        return rs;


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

