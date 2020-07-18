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
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
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

    public static void main(String[] args) {
        Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);

        topologicalSort(4,g);

    }

}
