package july21challenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/11/2021  2:24 PM
 * Rahul Gogyani
 */
public class LC295 {
    public static void main(String args[]){

        LC295 lc = new LC295();
        lc.addNum(1);
        System.out.println(lc.findMedian());
        lc.addNum(2);
        System.out.println(lc.findMedian());
        lc.addNum(3);
        System.out.println(lc.findMedian());
        lc.addNum(4);
        System.out.println(lc.findMedian());
    }


    PriorityQueue<Integer> minHeap = null;
    PriorityQueue<Integer> maxHeap = null;

    public LC295() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>((a, b) -> b - a);

    }

    public void addNum(int num) {
        minHeap.offer(num);
        maxHeap.offer(minHeap.poll());

        if (minHeap.size() < maxHeap.size()) {
            minHeap.offer(maxHeap.poll());
        }
    }

    public double findMedian() {
        if (minHeap.size() > maxHeap.size()) {
            return minHeap.peek();
        } else {
            return (minHeap.peek() + maxHeap.peek()) / 2.0;
        }
    }
}

