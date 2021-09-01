package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/2/2021  2:49 PM
 * Rahul Gogyani
 */
public class LC630 {
    public static void main(String args[]) {
        System.out.println(scheduleCourse(new int[][]{{100, 200}, {200, 1300}, {1000, 1250}, {2000, 3200}}));
    }

    public static int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, (a, b) -> a[1] - b[1]);
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        int time =0;
        for (int[] course:courses){
            if(time+course[0]<=course[1]){
                pq.add(course[0]);
                time+=course[0];
            }else if(!pq.isEmpty() && pq.peek()>course[0]){
                time+=course[0]-pq.poll();
                pq.add(course[0]);
            }
        }

        return pq.size();
    }
}

