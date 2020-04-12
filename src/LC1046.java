import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 4/12/2020  2:14 PM
 * Rahul Gogyani
 */
public class LC1046 {
    public static void main(String[] args) {
        int c[] = {2,7,4,1,8,1};
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((a,b)->b-a);
        for(int a:c)
            priorityQueue.offer(a);
        while(priorityQueue.size()>1){
            priorityQueue.offer(priorityQueue.poll()-priorityQueue.poll());
        }
        System.out.println(priorityQueue.poll());


    }
}
