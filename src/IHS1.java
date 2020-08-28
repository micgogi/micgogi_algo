import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 8/24/2020  6:15 PM
 * Rahul Gogyani
 */
public class IHS1 {
    final public static void main(String[] args) {
        FastReader sc = new FastReader();
        int t = sc.nextInt();
        int time = 1;
        HashMap<Integer, Integer> map = new HashMap<>();
        PriorityQueue<Integer> pq = new PriorityQueue();
        PriorityQueue<Integer> pq1 = new PriorityQueue<>((a,b)->Integer.compare(b,a));
        ArrayList<Long> list = new ArrayList<>();
        while (t-- != 0) {
            int q = sc.nextInt();
            int n = sc.nextInt();
            if(q==1){
                map.put(time, n);
                pq.add(n);
                pq1.add(n);
                time++;
            }else if(q==2){
                int val = map.remove(n);
                pq.remove(val);
                pq1.remove(val);
            }else{
                int val = pq.peek();
                int val2 = pq1.peek();
                System.out.println(val);
                System.out.println(val2);
                long dist =Math.abs(val-n);
                long dist2 = Math.abs(val2-n);


                System.out.println();
                list.add(Math.max(dist,dist2));
            }

        }
        System.out.println(Arrays.toString(list.stream().mapToLong(i->i).toArray()));

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

        int[] readArray(int n) {
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt();
            return a;
        }

        int[][] read2DArray(int n) {
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }

        int[][] read2DArray(int n, int m) {
            int[][] a = new int[n][m];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    a[i][j] = nextInt();
                }
            }
            return a;
        }
    }

}

