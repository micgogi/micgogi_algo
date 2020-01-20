package Graph;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Micgogi
 * on 1/20/2020  9:37 PM
 * Micgogi
 */
public class TOPOLOGICALSORT {
    static  class Graph{
        int v;
       LinkedList<Integer> adjList[];
        public Graph(int v){
            this.v =v;
            adjList = new LinkedList[v];
            for (int i = 0; i <v ; i++) {
                adjList[i]= new LinkedList<>();
            }
        }
        public  void addEdge(int v, int w){
            adjList[v].add(w);
        }

    }
    public static void topologicalSort(int v, Graph g){
        Stack<Integer> stack = new Stack();
        boolean visited[] = new boolean[v];
        for (int i = 0; i <v ; i++) {
            visited[i]=false;
        }
        for (int i = 0; i <v ; i++) {
            if(!visited[i])
                topologicalSort1(i,visited,stack,g);
        }
        while (!stack.isEmpty()) System.out.println(stack.pop());
    }

    private static void topologicalSort1(int i, boolean[] visited, Stack<Integer> stack,Graph g) {
        visited[i]=true;
        Integer a ;
        Iterator<Integer> iterator = g.adjList[i].iterator();
        while (iterator.hasNext()){
            a=iterator.next();
            if(!visited[a])topologicalSort1(a,visited,stack,g);
        }
        stack.push(new Integer(i));
    }

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(5,2);
        g.addEdge(5,0);
        g.addEdge(4,0);
        g.addEdge(4,1);
        g.addEdge(2,3);
        g.addEdge(3,1);
        topologicalSort(6,g);
    }
}
