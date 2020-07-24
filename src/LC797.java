import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Queue;

/**
 * @author Micgogi
 * on 7/24/2020  12:55 PM
 * Rahul Gogyani
 */
public class LC797 {



    public static void main(String args[]) {
        int [][] graph =  {{1,2},{3},{3},{}};
       List<Integer> path = new ArrayList<>();
       List<List<Integer>> ans = new ArrayList<>();
       path.add(0);
       dfs(graph,0,ans,path);
        System.out.println(ans);


    }
    public static void dfs(int[][] graph, int curr, List<List<Integer>> ans, List<Integer> path){
        if(curr == graph.length-1){
            ans.add(new ArrayList<>(path));
            return;
        }
        for (int nextnode:graph[curr]){
            path.add(nextnode);
            dfs(graph,nextnode,ans,path);
            path.remove(path.size()-1);
        }
    }


}

