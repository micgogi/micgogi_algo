package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Micgogi
 * on 4/30/2020  12:18 PM
 * Rahul Gogyani
 */
public class TopologicalSortTest {
    static class Graph{
        int v;
        LinkedList<Integer> adjList[];
        public Graph(int v){
            this.v = v;
            adjList = new LinkedList[v];
            for (int i = 0; i <v ; i++) {
                adjList[i] = new LinkedList<>();
            }
        }
        public  void addEdge(int s, int d){
            adjList[s].add(d);
        }
    }

    public static void topologicalSort(int v, Graph g){
        Stack<Integer> stack  = new Stack<>();
        boolean visited[] = new boolean[v];
        for (int i = 0; i <v ; i++) {
            if(!visited[i]){
                dfs(i,visited,stack,g);
            }

        }

    }
    public static void dfs(int i, boolean visited[], Stack<Integer> stack, Graph g){
        visited[i]=true;
        Integer a;
        Iterator<Integer> iterator = g.adjList[i].iterator();
        while(iterator.hasNext()){
            a=iterator.next();
            if(!visited[a]){
                dfs(a,visited,stack,g);
            }
        }
        stack.push( new Integer(i));
    }

}
