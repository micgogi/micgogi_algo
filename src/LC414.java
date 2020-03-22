/*
 *@author Rahul Gogyani

 *
 * 2:39 PM 3/17/2020
 */

import java.util.HashSet;
import java.util.PriorityQueue;

public class LC414 {
    public static void main(String[] args) {
        int a[] = {1,2,2,5,3,5};
       int j =3;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashSet<Integer> hs = new HashSet<>();
        hs.add(a[0]);
        pq.add(a[0]);
        for (int i = 0; i <a.length ; i++) {
            if(!hs.contains(a[i])){
                hs.add(a[i]);
                pq.add(a[i]);
                if(pq.size()>j){
                    hs.remove(pq.remove());
                }
            }
        }
        if(pq.size()==j) System.out.println(pq.peek());
        else{
            while(pq.size()!=1){
                pq.remove();
            }
            System.out.println(pq.peek());
        }
    }
}
