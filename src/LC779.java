import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/26/2020  11:31 AM
 * Rahul Gogyani
 */
public class LC779 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int N = sc.nextInt();
        int K = sc.nextInt();
        System.out.println(kthGrammar(N,K));


    }

    public static int kthGrammar(int N, int K) {
        if(N==1) return 0;
        if(K%2==0)return kthGrammar(N-1,K/2)==0?1:0;
        else return kthGrammar(N-1,(K+1)/2)==0?0:1;
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

