package LCOctChallenge;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 10/1/2020  12:38 PM
 * Rahul Gogyani
 */
public class LC933 {
   Queue<Integer> queue;
    public LC933(){
        this.queue = new LinkedList<>();
    }
    public int ping(int t){
        queue.add(t);
        while( t-queue.peek() > 3000){
            queue.poll();
        }

        return queue.size();
    }

    public static void main(String[] args) {
        LC933 lc933 = new LC933();
        System.out.println(lc933.ping(642));
        System.out.println(lc933.ping(1849));
        System.out.println(lc933.ping(4921));
        System.out.println(lc933.ping(5936));
        System.out.println(lc933.ping(5957));
    }
}

