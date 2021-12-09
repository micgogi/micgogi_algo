import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/9/2021  3:26 PM
 * Rahul Gogyani
 */
public class LC787Test {
    public static void main(String args[]) {
        System.out.println(new LC787Test().findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,1));
    }

    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        HashMap<Integer,HashMap<Integer,Integer>> map = new HashMap<>();
        for (int i = 0; i <flights.length ; i++) {
          int[] f = flights[i];
          if(!map.containsKey(f[0])){
              map.put(f[0],new HashMap<>());
          }
          map.get(f[0]).put(f[1],f[2]);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.add(new int[]{0,src,k+1});
        while (!pq.isEmpty()){
            int[] temp = pq.poll();
            int price = temp[0];
            int s = temp[1];
            int stops = temp[2];
            if(s==dst)return price;
            if(stops>0){
                HashMap<Integer,Integer> adj = map.getOrDefault(s,new HashMap<>());
                for (int key:adj.keySet()){
                    pq.add(new int[]{price+adj.get(key),key,stops-1});
                }
            }
        }
        return -1;
    }
}

