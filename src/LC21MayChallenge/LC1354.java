package LC21MayChallenge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 5/9/2021  5:00 PM
 * Rahul Gogyani
 */
public class LC1354 {
    public static void main(String args[]) {
        System.out.println(isPossible(new int[]{9,3,5}));
    }
    public static boolean isPossible(int[] target) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        long total = 0;
        for(int a: target){
            total+=a;
            pq.add(a);
        }
       // System.out.println(pq);
        while(true){
            int a = pq.poll();
            total-=a;
            if(a==1||total==1)
                return true;
            if(a<total ||total==0 ||a%total==0)return false;
            a%=total;
            total+=a;
            pq.add(a);
        }

    }

    }

