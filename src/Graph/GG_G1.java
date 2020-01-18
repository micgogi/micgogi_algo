package Graph;

import java.util.LinkedList;

/**
 * @author Micgogi
 * on 1/18/2020  5:16 PM
 * Micgogi
 */
public class GG_G1 {

   static  class Graph{
       int v;
       static  LinkedList<Integer> adjList[];
      Graph(int v){
          this.v = v;
        adjList = new LinkedList[v];
          for (int i = 0; i <v ; i++) {
              adjList[i]= new LinkedList<Integer>();
          }
      }

   }
   public static void addEdge(Graph g , int src, int dest){
       g.adjList[src].add(dest);
       g.adjList[dest].add(src);
   }
   public static void printGraph(Graph g){
       for (int i = 0; i < g.adjList.length; i++) {
           System.out.println(g.adjList[i].toString());
       }
   }
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        printGraph(graph);
    }
}
