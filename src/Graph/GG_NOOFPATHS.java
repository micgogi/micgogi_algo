package Graph;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 2/10/2020  11:10 PM
 * Micgogi
 */
public class GG_NOOFPATHS {
    int V;
    LinkedList<Integer> adj[];
    public GG_NOOFPATHS(int v){
        this.V = v;
        adj = new LinkedList[v];
        for (int i = 0; i <v ; i++) {
            adj[i]=new LinkedList<>();
        }
    }
    void addEdge(int v, int w){
        adj[v].add(w);
    }
    int countPathUtil(int s,int d, boolean visited[], int pathCount){
        visited[s]=true;
        if(s==d)pathCount++;
        else{
            Iterator<Integer> i = adj[s].iterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    pathCount=countPathUtil(n,d,visited,pathCount);
                }
            }
        }
        visited[s]=false;
        return pathCount;
    }
    int countPath(int s, int d){
        boolean visited[] = new boolean[V];
        Arrays.fill(visited,false);
        int pathCount=0;
        pathCount=countPathUtil(s,d,visited,pathCount);
        return pathCount;

    }
    public static void main(String[] args) {
    GG_NOOFPATHS graph = new GG_NOOFPATHS(4);
    graph.addEdge(0,1);
    graph.addEdge(0,2);
    graph.addEdge(0,3);
    graph.addEdge(2,0);
    graph.addEdge(2,1);
    graph.addEdge(1,3);
        System.out.println(graph.countPath(2,3));
    }
}
