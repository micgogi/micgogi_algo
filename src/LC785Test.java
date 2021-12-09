import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/9/2021  3:02 PM
 * Rahul Gogyani
 */
public class LC785Test {
    public static void main(String args[]) {

    }
    int[] parent;
    public boolean isBipratite(int[][] graph){
        int n = graph.length;
        parent = new int[n];
        for (int i = 0; i <n ; i++) {
            parent[i] = i;
        }
        for (int i = 0; i <graph.length ; i++) {
            for (int j = 0; j <graph[i].length ; j++) {
                if(find(i)==find(graph[i][j]))return false;
                union(graph[i][0],graph[i][j]);
            }
        }
        return true;
    }
    public void union(int x1, int x2){
        int parent1 = find(x1);
        int parent2 = find(x2);
        parent[parent1] = parent2;
    }
    public int find(int x){
        while (x!=parent[x]){
            x=parent[x];
        }
        return x;
    }

}

