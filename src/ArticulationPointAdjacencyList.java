/*
 *@author Rahul Gogyani

 *
 * 11:09 AM 3/18/2020
 */

import java.util.ArrayList;
import java.util.List;

public class ArticulationPointAdjacencyList {
    private int n, id, rootNodeOutcomingEdgeCount;
    private boolean solved;
    private int[] low, ids;
    private boolean[] visited, isArticulationPoint;
    private List<List<Integer>> graph;


    public ArticulationPointAdjacencyList(List<List<Integer>> graph, int n){
        if(graph==null||n<=0||graph.size()!=n)throw new IllegalArgumentException();

        this.graph = graph;
        this.n = n;
    }
    public boolean[] findArticulationPoints(){
        if(solved ) return isArticulationPoint;
        id=0;
        low = new int[n];
        ids = new int[n];
        visited = new boolean[n];
        isArticulationPoint = new boolean[n];

        for (int i = 0; i <n ; i++) {
            if(!visited[i]){
                rootNodeOutcomingEdgeCount =0;
             dfs(i,i,-1);
             isArticulationPoint[i]=rootNodeOutcomingEdgeCount>1;


            }
        }

        solved = true;
        return isArticulationPoint;

    }

    private void dfs(int root, int at, int parent){
        if(parent==root) rootNodeOutcomingEdgeCount++;

        visited[at]=true;
        low[at]=ids[at]=id++;


        List<Integer> edges = graph.get(at);
        for (Integer to:edges){
            if(to==parent)continue;
            if(!visited[to]){
                dfs(root,to,at);
                low[at]=Math.min(low[at],low[to]);
                if(ids[at]<=low[to]){
                    isArticulationPoint[at]=true;
                }
            }else{
                low[at]=Math.min(low[at],ids[to]);
            }
        }
    }
    public static List<List<Integer>> createGraph(int n){
        List<List<Integer>> graph = new ArrayList<>(n);
        for (int i = 0; i <n ; i++) {
            graph.add(new ArrayList<>());
        }
        return  graph;
    }
    public static void addEdge(List<List<Integer>> graph, int from , int to){
        graph.get(from).add(to);
        graph.get(to).add(from);
    }

    public static void main(String[] args) {
        int n= 9;
        List<List<Integer>> graph = createGraph(n);
        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,1,2);
        addEdge(graph,2,3);
        addEdge(graph,3,4);
        addEdge(graph,2,5);
        addEdge(graph,5,6);
        addEdge(graph,6,7);
        addEdge(graph,7,8);
        addEdge(graph,8,5);

        ArticulationPointAdjacencyList solver = new ArticulationPointAdjacencyList(graph,n);
        boolean[] isArticulationPoint = solver.findArticulationPoints();
        for (int i = 0; i <n ; i++) {
            if(isArticulationPoint[i]){
                System.out.println("Node Articulation is "+i);
            }
        }
    }
}
