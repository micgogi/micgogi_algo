package LCMarch21Challenge;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 3/24/2021  8:25 PM
 * Rahul Gogyani
 */
public class LC870 {
    public static void main(String args[]) {
        System.out.println(Arrays.toString(advantageShuffle(new int[]{2,7,11,15}, new int[]{1,10,4,11})));
    }

    public static int[] advantageShuffle(int[] A, int[] B) {
        Arrays.sort(A);
        int[] res = new int[A.length];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = 0; i < B.length; i++) {
            pq.add(new int[]{B[i], i});
        }

        int left = 0;
        int right = A.length - 1;
        while (!pq.isEmpty()) {
            int[] curr = pq.poll();
            int val = curr[0];
            int index = curr[1];
            if (A[right] > val) res[index] = A[right--];
            else res[index] = A[left++];
        }
        return res;
    }
}

