import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/21/2021  9:49 AM
 * Rahul Gogyani
 */
public class LC1971 {
    static HashMap<Integer, List<Integer>> map;
    public static void main(String args[]) {
        map = new HashMap<>();
        int[][] edges = new int[][]{{1, 2}, {1, 3}, {2, 3}};
        int n = 3;


        System.out.println(validPath(n, 1, 3, edges));

    }

    public static boolean validPath(int n, int strat, int end, int[][] edges) {
        if(strat==end)return true;
        for(int[] edge: edges) {
            addEdge(edge[0], edge[1]);
        }
        return dfs(n, strat, end, map, new boolean[n]);

    }
    public static boolean dfs(int n, int strat, int end, HashMap<Integer, List<Integer>> map,boolean[] visisted) {
            visisted[strat]= true;
            for(int i: map.get(strat)) {
                if(i==end)return true;
                if(!visisted[i])dfs(n, i, end, map, visisted);

            }
            return false;

    }

    public static void addEdge(int u,int v){
        map.computeIfAbsent(u,k->new ArrayList<>()).add(v);
        map.computeIfAbsent(v,k->new ArrayList<>()).add(u);
    }



}

