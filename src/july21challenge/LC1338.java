package july21challenge;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 7/6/2021  6:35 PM
 * Rahul Gogyani
 */
public class LC1338 {
    public static void main(String args[]) {
        System.out.println(minSetSize(new int[]{3, 3, 3, 3, 5, 5, 5, 2, 2, 7}));
    }

    public static int minSetSize(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        Map<Integer, Integer> count = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {

            count.put(arr[i], count.getOrDefault(arr[i], 0) + 1);

        }
        for (int key : count.keySet()) {
            pq.add(count.get(key));
        }
        int ans = 0;
        int size = arr.length;
        while (size > arr.length / 2) {
            ans++;
            size -= pq.poll();

        }
        return ans;
    }
}

