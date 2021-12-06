import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/6/2021  12:50 PM
 * Rahul Gogyani
 */
public class LC1481 {
    public static void main(String[] args) {
        System.out.println(new LC1481().findLeastNumOfUniqueInts(new int[]{4,3,1,1,3,3,2},3));
    }
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num:arr){
            map.putIfAbsent(num,0);
            map.put(num,map.get(num)+1);
        }
        PriorityQueue<int[] >pq = new PriorityQueue<>((a,b)->a[1]-b[1]);
        for (int key:map.keySet()){
            pq.add(new int[]{key,map.get(key)});
        }
        while(k!=0){
            if(!pq.isEmpty()){
                int [] ele = pq.peek();
                int key = ele[0];
                int frq = ele[1];
                if(k>=frq){
                    k-=frq;
                    pq.poll();
                    map.remove(key);
                }else{
                    frq-=k;
                    k=0;
                    map.put(key,frq);
                }
            }
        }
        return map.size();
    }
}

