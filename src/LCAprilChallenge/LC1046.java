package LCAprilChallenge;

import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 5/1/2020  9:13 PM
 * Rahul Gogyani
 */
public class LC1046 {
    public int lastStoneWeight(int[] c) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a, b)->b-a);
        for(int a:c)
            priorityQueue.offer(a);
        while(priorityQueue.size()>1){
            priorityQueue.offer(priorityQueue.poll()-priorityQueue.poll());
        }
        return priorityQueue.poll();

    }
}
