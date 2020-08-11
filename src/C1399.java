import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/11/2020  10:57 AM
 * Rahul Gogyani
 */
public class C1399 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t--!=0){
            int n = sc.nextInt();
            int a[] = new int[n];
            for (int i = 0; i <n ; i++) {
                a[i] = sc.nextInt();
            }
            Map<Integer,Integer> map = new HashMap<>();
            for (int i = 0; i < n ; i++) {
                map.putIfAbsent(a[i],0);
                map.put(a[i],map.get(a[i])+1);
            }
            int max = 0;
            for (int i = 2; i <=2*n ; i++) {
                int total = 0;
                for(int j : map.keySet()){
                    int other = i-j;
                    if(other>=1&&map.containsKey(other)){
                        total+=Math.min(map.get(j),map.get(other));
                    }

                }
                total/=2;
                max = Math.max(max,total);
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

