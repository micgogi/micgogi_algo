import java.util.Vector;

/**
 * @author Micgogi
 * on 3/21/2020  6:25 PM
 * Rahul Gogyani
 */
public class HE1 {
    static void addEdge(Vector<Integer> adj[],
                        int u, int v)
    {
        adj[u].add(v);
        adj[v].add(u);
    }
    static void delEdge(Vector<Integer> adj[],
                        int u, int v)
    {
        for (int i = 0; i < adj[u].size(); i++)
        {
            if (adj[u].get(i) == v)
            {
                adj[u].remove(i);
                break;
            }
        }


        for (int i = 0; i < adj[v].size(); i++)
        {
            if (adj[v].get(i) == u)
            {
                adj[v].remove(i);
                break;
            }
        }
    }


    static void printGraph(Vector<Integer> adj[], int V)
    {
        for (int v = 0; v < V; ++v)
        {
            System.out.print("vertex " + v+ " ");
            for (Integer x : adj[v])
                System.out.print("-> " + x);
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
    public static void main(String[] args) {
        int V = 4;
        Vector<Integer> []adj = new Vector[V];
        for (int i = 0; i < V; i++)
            adj[i] = new Vector<Integer>();

        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);


       printGraph(adj, V);
      // delEdge(adj, 1, 2);
       printGraph(adj, V);
    }
}
