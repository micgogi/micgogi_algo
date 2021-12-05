import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  5:29 PM
 * Rahul Gogyani
 */
public class LC1167 {
    public static void main(String[] args) {
        System.out.println(new LC1167().connectSticks(new int[]{1,8,3,5}));
    }
    public int connectSticks(int[] sticks) {
        if(sticks.length==0)return 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int cost =0;
        for (int i = 0; i <sticks.length ; i++) {
            pq.add(sticks[i]);
        }
        while (pq.size()>1){
            int first = pq.poll();
            int second = pq.poll();
            pq.add(first+second);
            cost+=(first+second);
        }
        return cost;
    }
}

