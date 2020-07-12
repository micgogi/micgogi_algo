import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/12/2020  4:54 PM
 * Rahul Gogyani
 */
public class LC719 {
    static class Pair{
        int first;
        int second;
        public Pair(int first, int second){
            this.first = first;
            this.second = second;
        }
    }
    public static void main(String args[]) {
        FastReader sc = new FastReader();
       int nums[] = {1,3,1};
       int k=2;
        System.out.println(smallestDistancePair(nums,k));

    }
    //TLE
    public static int smallestDistancePair(int[] nums, int k) {
        PriorityQueue<Pair> priorityQueue = new PriorityQueue<>((obj1,obj2)->(Math.abs(obj1.first-obj1.second)-Math.abs(obj2.first-obj2.second)));
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                priorityQueue.add(new Pair(nums[i],nums[j]));
            }
        }
        int ans =0;
        while (k--!=0){
            Pair pair = priorityQueue.poll();
            ans = Math.abs(pair.first-pair.second);
        }
        return ans;
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

