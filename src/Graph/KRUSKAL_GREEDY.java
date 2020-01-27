package Graph;

import java.util.Arrays;

/**
 * @author Micgogi
 * on 1/25/2020  11:26 PM
 * Micgogi
 */
public class KRUSKAL_GREEDY {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        @Override
        public int compareTo(Edge o) {
            return this.weight - o.weight;
        }
    }

    class Subset {
        int parent, rank;

    }

    int V, E;
    Edge edge[];

    KRUSKAL_GREEDY(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];
        for (int i = 0; i < e; i++) {
            edge[i] = new Edge();
        }
    }

    int find(Subset subset[], int i) {
        if (subset[i].parent != i) {
            subset[i].parent = find(subset, subset[i].parent);
        }
        return subset[i].parent;
    }

    void union(Subset subset[], int x, int y) {
        int xroot = find(subset, x);
        int yroot = find(subset, y);
        if (subset[xroot].rank < subset[yroot].rank) {
            subset[xroot].parent = yroot;
        } else if (subset[xroot].rank > subset[yroot].rank) {
            subset[yroot].parent = xroot;
        } else {
            subset[yroot].parent = xroot;
            subset[xroot].rank++;

        }
    }

    void kruskal() {
        Edge result[] = new Edge[V];
        int e = 0;
        int i = 0;
        for (int j = 0; j < V; j++) {
            result[i] = new Edge();
        }
        Arrays.sort(edge);
        Subset subset[] = new Subset[V];
        for (int j = 0; j < V; j++) {
            subset[j] = new Subset();
        }
        for (int j = 0; j < V; j++) {
            subset[j].parent = j;
            subset[j].rank = 0;
        }
        i = 0;
        while (e < V - 1) {
            Edge nextEdge = new Edge();
            nextEdge = edge[i++];
            int x = find(subset, nextEdge.src);
            int y = find(subset, nextEdge.dest);
            if (x != y) {
                result[e++] = nextEdge;
                union(subset, x, y);
            }

        }
        for (int j = 0; j < e; j++) {
            System.out.println(result[j].src+"--->"+result[j].dest+"----"+result[j].weight);
        }

    }

    public static void main(String[] args) {
        int V = 4;  // Number of vertices in graph
        int E = 5;  // Number of edges in graph
        KRUSKAL_GREEDY graph = new KRUSKAL_GREEDY(V, E);


        graph.edge[0].src = 0;
        graph.edge[0].dest = 1;
        graph.edge[0].weight = 10;


        graph.edge[1].src = 0;
        graph.edge[1].dest = 2;
        graph.edge[1].weight = 6;


        graph.edge[2].src = 0;
        graph.edge[2].dest = 3;
        graph.edge[2].weight = 5;

        graph.edge[3].src = 1;
        graph.edge[3].dest = 3;
        graph.edge[3].weight = 15;


        graph.edge[4].src = 2;
        graph.edge[4].dest = 3;
        graph.edge[4].weight = 4;
        graph.kruskal();
    }

}
