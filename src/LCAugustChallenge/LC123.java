package LCAugustChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/16/2020  1:15 PM
 * Rahul Gogyani
 */
public class LC123 {
    public static void main(String args[]) {
        FastReader sc = new FastReader();
      //  int t = sc.nextInt();
        int a[] = {1,2,4,2,5,7,2,4,9,0};
//        PriorityQueue<Integer> pq = new PriorityQueue<>((c,d)->d-c);
//        for (int i = 0; i <a.length;) {
//            int j = i+1;
//            while (j<a.length&&a[j]>=a[i]&&a[j]>=a[j-1]){
//                j++;
//            }
//            pq.add(a[j-1]-a[i]);
//            i=j;
//
//        }
//        int ans = 0;
//        int k = Math.min(pq.size(), 2);
//        while (k--!=0){
//            ans+=pq.poll();
//        }
       int buy1 = Integer.MAX_VALUE, buy2 = Integer.MAX_VALUE;
       int sell1 = 0, sell2 = 0;
        for (int i = 0; i < a.length; i++) {
            buy1 = Math.min(buy1,a[i]);
            sell1 = Math.max(sell1, a[i]-buy1);
            buy2 = Math.min(buy2, a[i]-sell1);
            sell2 = Math.max(sell2,a[i]-buy2);
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

