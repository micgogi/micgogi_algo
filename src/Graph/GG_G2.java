package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Micgogi
 * on 1/18/2020  5:42 PM
 * Micgogi
 */
public class GG_G2 {
    static class Graph{
        int v;
        LinkedList<Integer> adjList[];
        public Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            for (int i = 0; i <v ; i++) {
                adjList[i]= new LinkedList<>();
            }
        }
    }
    public static void addEdge(Graph g , int v, int w){
        g.adjList[v].add(w);
    }
    public static void bfs(int v,Graph g){
        boolean[] visited = new boolean[g.adjList.length];
        Queue<Integer> q = new LinkedList<>();
        visited[v]=true;
        q.add(v);
        while(!q.isEmpty()){
            v=q.poll();
            System.out.println(v+" ");
            Iterator<Integer> i = g.adjList[v].iterator();
            while (i.hasNext()){
                int n = i.next();
                if(!visited[n]){
                    visited[n]=true;
                    q.add(n);
                }
            }
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(4);
        addEdge(g,0, 1);
        addEdge(g,0, 2);
        addEdge(g,1, 2);
        addEdge(g,2, 0);
        addEdge(g,2, 3);
        addEdge(g,3, 3);
        bfs(2,g);
    }
}
