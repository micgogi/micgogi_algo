import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  3:40 PM
 * Rahul Gogyani
 */
public class LC1353 {
    public static void main(String[] args) {
        System.out.println(new LC1353().maxEvents(new int[][]{{1,2},{2,3},{3,4},{1,2}}));
    }

    public int maxEvents(int[][] events) {
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int i = 0, res = 0, n= events.length;
        for (int d = 1; d <= 100000; d++) {
            while (!pq.isEmpty() && pq.peek()<d){
                pq.poll();
            }
            while (i<n && events[i][0]==d){
                pq.offer(events[i++][1]);
            }
            if(!pq.isEmpty()){
                pq.poll();
                ++res;
            }
        }
        return res;
    }
}

