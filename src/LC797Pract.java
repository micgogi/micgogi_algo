import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/21/2021  10:28 AM
 * Rahul Gogyani
 */
public class LC797Pract {
    public static void main(String args[]) {
        int[][] graph = new int[][]{{1,2},{3},{3},{}};
        System.out.println(new LC797Pract().allPathsSourceTarget(graph));

    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        path.add(0);
        dfs(graph,0,path,ans);

        return ans;
    }

    public static void dfs(int[][] graph,int src,List<Integer> path,List<List<Integer>> ans){
        if(src==graph.length-1){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int next:graph[src]){
            path.add(next);
            dfs(graph,next,path,ans);
            path.remove(path.size()-1);
        }
    }


}

