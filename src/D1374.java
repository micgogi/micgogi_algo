import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/14/2020  9:56 AM
 * Rahul Gogyani
 */
public class D1374 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            Map<Long,Long> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                long x = sc.nextLong();
                x%=k;
                if(x==0)continue;
                map.putIfAbsent(k-x,0L);
                map.put(k-x,map.get(k-x)+1);
            }
            //System.out.println(map);
            long max =0;
            for (long c:map.keySet()){
                long x = c+(map.get(c)-1)*k;
                max = Math.max(x,max);
            }
            if(max>0){
                max++;
            }
            System.out.println(max);
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

