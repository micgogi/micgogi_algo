import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/14/2020  6:26 PM
 * Rahul Gogyani
 */
public class D1343 {
    static class Pair {
        int first;
        int second;

        public Pair(int x, int y) {
            this.first = x;
            this.second = y;
        }
    }

    public static void main(String args[]) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int a[] = new int[n + 1];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int pref[] = new int[2 * k + 2];
            int count[] = new int[2*k+1];
           // List<Pair> list = new ArrayList<>();
            for (int i = 0; i < n / 2; i++) {

                ++count[a[i]+a[n-i-1]];

            }
            for (int i = 0; i <n/2 ; i++) {
                ++pref[Math.min(a[i],a[n-i-1])+1];
                --pref[Math.max(a[i],a[n-i-1])+k+1];
            }
            for (int i = 1; i <=2*k ; i++) {
                pref[i] = pref[i]+pref[i-1];
            }
            int ans = Integer.MAX_VALUE;
            for (int i = 2; i <=2*k ; i++) {
                ans = Math.min(ans, pref[i]-count[i]+(n/2-pref[i])*2);
            }
            System.out.println(ans);

//            Map<Integer, Integer> map = new HashMap<>();
//            for (Pair pair : list) {
//                int left = pair.first + 1;
//                int right = pair.second + k;
//                map.putIfAbsent(left + right, 0);
//                map.put(left + right, map.get(left + right) + 1);
//                pref[left] += 1;
//                pref[right + 1] -= 1;
//            }
//            long sum = 0;
//            for (int i = 2; i <= 2 * k; i++) {
//                sum += pref[i];
//                pref[i] = sum;
//            }
//            long minChange = 0;
//            for (int i = 2; i <= 2 * k; i++) {
//                long count0 = map.getOrDefault(i,0);
//                long count1 = pref[i] - count0;
//                long count2 = (n / 2) - count1 - count0;
//                long totalChanges = 0 * count0 + 1 * count1 + 2 * count2;
//                minChange = Math.min(minChange, totalChanges);
//            }
//            System.out.println(minChange);


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

