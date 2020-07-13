import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/13/2020  2:59 PM
 * Rahul Gogyani
 */
public class B1380 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            String st= sc.nextLine();
            int r=0,p=0,s=0;
            for (int i = 0; i <st.length() ; i++) {
                char c = st.charAt(i);
                if(c=='R'){
                    r++;
                }
                if(c=='P'){
                    p++;
                }
                if(c=='S'){
                    s++;
                }
            }
            char c = 'R';
            if(r>=s&&r>=p){
                c = 'P';
            }
            else if(p>=r&&p>=s){
                c='S';
            }else{
                c='R';
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i <st.length() ; i++) {
                sb.append(c);
            }
            System.out.println(sb.toString());
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

