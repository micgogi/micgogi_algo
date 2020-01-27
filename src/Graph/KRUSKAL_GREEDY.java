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
        edge = new Edge[v];
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
        for (int j = 0; j <V ; j++) {
            result[i]=new Edge();
        }
        Arrays.sort(edge);
        Subset subset[] = new Subset[V];
        for (int j = 0; j <V ; j++) {
            subset[j] = new Subset();
        }

    }

}
