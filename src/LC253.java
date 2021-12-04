import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/4/2021  11:49 AM
 * Rahul Gogyani
 */
public class LC253 {
    public static void main(String args[]) {
        System.out.println(new LC253().minMeetingRooms(new int[][]{{2,15},{36,45},{9,29},{16,23},{4,9}}));
    }

    public int minMeetingRooms(int[][] intervals) {
        if(intervals.length==0)return 0;
        if(intervals.length==1)return 1;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[1]-b[1]);

        pq.add(intervals[0]);
        for (int i = 1; i <intervals.length ; i++) {
            int[] inter= pq.poll();
            int[] current = intervals[i];

            if(current[0]<inter[1]){
                pq.add(current);
            }else{
                inter[1] = current[1];
            }
            pq.add(inter);
        }

       // System.out.println(pq.size());
        return pq.size();
    }
}

