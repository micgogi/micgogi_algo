import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 6/15/2020  6:23 PM
 * Rahul Gogyani
 * problem: https://leetcode.com/problems/cheapest-flights-within-k-stops/
 * solution: https://www.youtube.com/watch?v=IQOG3w4abAg
 */
public class LC787 {
    public static void main(String[] args) {
        int [][] flights = {{0,1,100},{1,2,100},{0,2,500}};
        System.out.println(findCheapestPrice(3,flights,0,2,1));

    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int K) {
        Map<Integer, Map<Integer,Integer>> graph = new HashMap<>();
        for (int[]f :flights){
            if(!graph.containsKey(f[0])){
                graph.put(f[0], new HashMap<>());
            }
          graph.get(f[0]).put(f[1],f[2]);
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)-> Integer.compare(a[0],b[0]));
        pq.add(new int[]{0,src,K+1});
        while (!pq.isEmpty()){
            int[] top = pq.remove();
            int price = top[0];
            int city = top[1];
            int stops = top[2];
            if(city==dst)return price;
            if(stops>0){
                Map<Integer,Integer> adj = graph.getOrDefault(city,new HashMap<>());
                for ( int a: adj.keySet()){
                    pq.add(new int[]{price+adj.get(a),a,stops-1});
                }
            }
        }
        return -1;

    }
}
