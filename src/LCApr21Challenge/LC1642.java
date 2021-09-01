package LCApr21Challenge;

import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 4/27/2021  9:38 AM
 * Rahul Gogyani
 */
public class LC1642 {
    public static void main(String args[]) {
        System.out.println(furthestBuilding(new int[]{4,2,7,6,9,14,12},5,1));
    }

    public static int furthestBuilding(int[] A, int bricks, int ladders) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < A.length - 1; i++) {
            int diff = A[i + 1] - A[i];
            if (diff > 0) {
                priorityQueue.add(diff);
            }
            if (priorityQueue.size() > ladders) {
                bricks -= priorityQueue.poll();
            }
            if(bricks<0){
                return i;
            }

        }
        return A.length - 1;
    }

}

