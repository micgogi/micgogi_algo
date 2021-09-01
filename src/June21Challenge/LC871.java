package June21Challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 6/12/2021  1:11 PM
 * Rahul Gogyani
 */
public class LC871 {
    public static void main(String args[]) {
        System.out.println(minRefuelStops(100,10,new int[][]{{10,60},{20,30},{30,30},{60,40}}));
    }

    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        int ans = 0;
        int currentFuel = startFuel;
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int[] stat : stations) {
            while (currentFuel < stat[0]) {
                if (pq.isEmpty()) return -1;
                currentFuel += pq.poll();
                ans++;
            }
            pq.add(stat[1]);
        }

        while (currentFuel < target) {
            if (pq.isEmpty()) return -1;
            currentFuel += pq.poll();
            ans++;
        }

        return ans;
    }
}

