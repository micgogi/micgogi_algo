import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/16/2020  11:47 AM
 * Rahul Gogyani
 */
public class C1398 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.nextLine();
            //  int a[] = Arrays.stream(s).mapToInt(Integer::parseInt).toArray();
            long count = 0;
//            for (int i = 0; i < n; i++) {
//                int sum =0;
//                for (int j = i; j <n ; j++) {
//                    sum+=a[j];
//                    if(sum==(j-i+1)){
//                        count++;
//                    }
//                }
//            }
            int prefsum[] = new int[n];
            prefsum[0] = s.charAt(0) - '0';
            for (int i = 1; i < n; i++) {
                prefsum[i] = prefsum[i - 1] + s.charAt(i) - '0';
            }
            System.out.println(Arrays.toString(prefsum));
            HashMap<Integer, Long> map = new HashMap<>();
            map.put(0, 1L);
            for (int i = 0; i <n ; i++) {
                int x = prefsum[i] - (i+1);
                count+=map.getOrDefault(x,0L);
                map.put(x,map.getOrDefault(x,0L)+1);
            }

            System.out.println(count);
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

