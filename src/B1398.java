import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/16/2020  10:42 AM
 * Rahul Gogyani
 */
public class B1398 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            String s = sc.nextLine();
            List<Integer>  list= new ArrayList<>();
            for (int i = 0; i <s.length(); i++) {
                if(s.charAt(i)=='1') {
                    int j = i;
                    while (j + 1 < s.length() && s.charAt(j+1)=='1'){
                        j++;
                    }
                    list.add(j-i+1);
                    i = j;
                }
            }
            Collections.sort(list,Collections.reverseOrder());
           // System.out.println(list);
            int ans = 0;
            for (int i = 0; i <list.size() ; i+=2) {
                ans+=list.get(i);
            }
            System.out.println(ans);
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

