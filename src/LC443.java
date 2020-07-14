import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/14/2020  10:20 AM
 * Rahul Gogyani
 */
public class LC443 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        char c[] ={'a','a','q','q','q','d','b','b','c','c'};
        int indexAns =0;
        int index =0;
        while (index<c.length){
            char curr = c[index];
            int count =0;
            while (index<c.length&&c[index]==curr){
                index++;
                count++;
            }
            c[indexAns++]=curr;
            if(count!=1){
                for (char d:Integer.toString(count).toCharArray()){
                    c[indexAns++]=d;
                }
            }

        }
        System.out.println(indexAns);
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

