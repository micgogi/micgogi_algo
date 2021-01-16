package LCJan21Challenge;/*
 *@author Rahul Gogyani

 *
 * 2:39 PM 3/17/2020
 */

import java.util.PriorityQueue;

public class LC215 {
    public static void main(String[] args) {
        int a[] = {3, 2, 1, 5, 6, 4};
        int j = 2;
        PriorityQueue<Integer> pq = new PriorityQueue<>();


        for (int i = 0; i < a.length; i++) {


            pq.add(a[i]);


        }
        int n = a.length - j;
        while (n-- != 0) {
            pq.remove();
        }
        System.out.println(pq.peek());

    }
}
