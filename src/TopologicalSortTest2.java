import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Micgogi
 * on 4/30/2020  3:24 PM
 * Rahul Gogyani
 */
public class TopologicalSortTest2 {
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
        public void addEdge(int s, int d){
            adjList[s].add(d);
        }
    }

    public static void topologicalSort(int v, Graph g){
        boolean visited[] = new boolean[v];
        Stack<Integer> stack= new Stack();
        for (int i = 0; i <v ; i++) {
            if(!visited[i]){
                dfs(i,g,stack,visited );
            }

        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }

    private static void dfs(int i, Graph g, Stack<Integer> stack, boolean[] visited) {

        visited[i] = true;
        Iterator<Integer> iterator = g.adjList[i].iterator();
        Integer a =0;
        while(iterator.hasNext()){
           a = iterator.next();
            if(!visited[a]){
                dfs(a,g,stack,visited);
            }
        }
        stack.push(new Integer(i));
    }


    public static void main(String[] args) {
  Graph g = new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,3);
        g.addEdge(2,3);

        topologicalSort(0,g);


    }
}
