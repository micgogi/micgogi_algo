import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/23/2021  12:02 PM
 * Rahul Gogyani
 */
public class Bipartite {
    int[] parent;

    public static void main(String[] args) {
        Bipartite bipartite = new Bipartite();
        System.out.println(bipartite.isBipartite(new int[][]{{1,3},{0,2},{1,3},{0,2}}));
    }
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        parent = new int[n];
        for (int i = 0; i <n ; i++) {
            parent[i] = i;
        }
        for(int i=0;i<graph.length;i++){
            for (int j = 0; j <graph[i].length ; j++) {
                if(find(i)==find(graph[i][j])){
                        return false;
                }
                union(graph[i][0],graph[i][j]);

            }
        }
        return true;
    }

    private int find(int x) {
        while(parent[x]!=x){
            x=parent[x];
        }
        return x;
    }

    private void union(int x, int y) {
        int parent1 = find(x);
        int parent2 = find(y);
        parent[parent1] = parent2;

    }
}

