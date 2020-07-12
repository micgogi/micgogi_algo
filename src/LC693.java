import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/12/2020  3:22 PM
 * Rahul Gogyani
 */
public class LC693 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int n = sc.nextInt();
//        String s = Integer.toBinaryString(t);
//
//        boolean flag = false;
//        for (int i = 1; i <s.length() ; i++) {
//            if(s.charAt(i)!=s.charAt(i-1)){
//                flag = true;
//            }else{
//                flag= false;
//                break;
//            }
//        }
//        System.out.println(flag);
        n = n ^ (n>>1);
        System.out.println((n&n+1)==0);

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

