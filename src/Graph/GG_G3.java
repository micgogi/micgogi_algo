package Graph;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 1/18/2020  6:43 PM
 * Micgogi
 */
public class GG_G3 {
    static class Graph {
        int v;
        LinkedList<Integer> adjList[];

        public Graph(int v) {
            this.v = v;
            adjList = new LinkedList[v];
            for (int i = 0; i < adjList.length; i++) {
                adjList[i] = new LinkedList<>();
            }


        }
        public static void DfsU(Graph g, int i, boolean[] viited){
            viited[i]=true;
            System.out.println(i+" ");
            Iterator<Integer> interator = g.adjList[i].iterator();
            while (interator.hasNext()){
                int t = interator.next();
                if(!viited[t])
                    DfsU(g,t,viited);
            }
        }
        public static void dfs(Graph g , int v){
            boolean visited[] = new boolean[v];
            for (int i = 0; i <v ; i++) {
                if(!visited[i]){
                    DfsU(g,i,visited);
                }
            }
        }
        public static void addEdge(Graph g, int v, int w) {
            g.adjList[v].add(w);
        }

        public static void main(String[] args) {
            Graph g = new Graph(5);
            addEdge(g,0, 2);
            addEdge(g,1, 0);


            addEdge(g,2, 1);
            addEdge(g,0, 3);
            addEdge(g,1, 4);
            dfs(g,5);
        }
    }
}
