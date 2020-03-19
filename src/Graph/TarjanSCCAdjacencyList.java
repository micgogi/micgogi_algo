/*
 *@author Rahul Gogyani

 *
 * 3:10 PM 3/19/2020
 */

import java.util.*;

public class TarjanSCCAdjacencyList {
    private int n;
    private List<List<Integer>> graph;
     private boolean solved;
     private int sccCount, id;
     private boolean[] onStack;
     private int[] ids, low;
     private Deque<Integer> stack;

     private static final int UNVISITED =-1;
     public TarjanSCCAdjacencyList(List<List<Integer>> graph) {
         if (graph == null) {
             throw new IllegalArgumentException("Graph cannot be null");
         }
         n = graph.size();
         this.graph = graph;
     }
     public int sccCount(){
         if(!solved) solve();
         return sccCount;
     }

     public int[] getSccs(){
         if(!solved)solve();
         return low;
     }

     public void solve(){
         if(solved ) return;

         ids = new int[n];
         low = new int[n];
         onStack = new boolean[n];
         stack = new ArrayDeque<>();
         Arrays.fill(ids, UNVISITED);
         for (int i = 0; i <n ; i++) {
             if(ids[i]==UNVISITED){
                 dfs(i);
             }
         }
         solved = true;
     }

     private  void dfs(int at){
         stack.push(at);
         onStack[at] = true;
         ids[at] = low[at] = id++;
         for (int to: graph.get(at)){
             if(ids[to]==UNVISITED){
                 dfs(to);
             }
             if(onStack[to]){
                 low[at] = Math.min(low[at],low[to]);
             }
         }

         if(ids[at]==low[at]){
             for (int node = stack.pop();; node=stack.pop()) {
                 onStack[node] = false;
                 low[node] = ids[at];
                 if(node==at) break;
             }
             sccCount++;
         }

     }
     public static List<List<Integer>> createGraph(int n){
         List<List<Integer>> graph = new ArrayList<>(n);
         for (int i = 0; i <n ; i++) {
             graph.add(new ArrayList<>());
         }
         return graph;
     }
     public static void addEdge(List<List<Integer>> graph, int from, int to){
         graph.get(from).add(to);

     }

    public static void main(String[] args) {
        int n =8;
        List<List<Integer>> graph = createGraph(n);
        addEdge(graph, 6, 0);
        addEdge(graph, 6, 2);
        addEdge(graph, 3, 4);
        addEdge(graph, 6, 4);
        addEdge(graph, 2, 0);
        addEdge(graph, 0, 1);
        addEdge(graph, 4, 5);
        addEdge(graph, 5, 6);
        addEdge(graph, 3, 7);
        addEdge(graph, 7, 5);
        addEdge(graph, 1, 2);
        addEdge(graph, 7, 3);
        addEdge(graph, 5, 0);

        TarjanSCCAdjacencyList tarjanSCCAdjacencyList =
                new TarjanSCCAdjacencyList(graph);
        int[] scss = tarjanSCCAdjacencyList.getSccs();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i <n ; i++) {
           if(!map.containsKey(scss[i])){
               map.put(scss[i], new ArrayList<>());
           }
           map.get(scss[i]).add(i);

        }

        System.out.println("Number of strongly connected graph: "+
        tarjanSCCAdjacencyList.sccCount);

        for (List<Integer> scc: map.values()){
            System.out.println("Noeds: "+scc+" form a strongly connected component" );
        }
    }



}
