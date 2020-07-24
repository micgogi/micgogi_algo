import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/24/2020  3:52 PM
 * Rahul Gogyani
 */
public class LC785 {
    public static void main(String args[]) {
        int graph[][] = {{1,3},{0,2},{1,3},{0,2}};
        System.out.println(isBipartite(graph));

    }
    public static boolean isBipartite(int[][] graph) {
        int len = graph.length;
        int[] colors = new int[len];
        for (int i = 0; i <len ; i++) {
            if(colors[i]==1 || colors[i]==-1){
                continue;
            }
            Queue<Integer> queue = new LinkedList<>();
            queue.add(i);
            colors[i] = 1;
            while (!queue.isEmpty()){
                int cur = queue.poll();
                for (int next: graph[cur]){
                    if(colors[next]==0){
                        colors[next] = -colors[cur];
                        queue.add(next);
                    }
                    if(colors[next]==colors[cur])return false;
                }
            }
        }
        return true;
    }

}

