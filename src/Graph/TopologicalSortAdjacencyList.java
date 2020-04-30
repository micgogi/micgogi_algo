package Graph;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author Micgogi
 * on 4/30/2020  3:59 PM
 * Rahul Gogyani
 */
public class TopologicalSortAdjacencyList {
    static class Edge {
        int from, to, weight;

        public Edge(int f, int t, int w) {
            this.from = f;
            this.to = t;
            this.weight = w;

        }
    }

    private static int[] topologicalSort(Map<Integer, List<Edge>> graph, int numNodes) {
        int[] ordering = new int[numNodes];
        boolean[] visited = new boolean[numNodes];
        int i = numNodes - 1;
        for (int at = 0; at < numNodes; at++) {
            if (!visited[at]) {
                i = dfs(i, at, visited, ordering, graph);
            }
        }
        return ordering;
    }

    private static int dfs(int i, int at, boolean[] visited, int[] ordering, Map<Integer, List<Edge>> graph) {
        visited[at] = true;
        List<Edge> edges = graph.get(at);
        if (edges != null) {
            for (Edge edge : edges) {
                if (!visited[edge.to]) {
                    i = dfs(i, edge.to, visited, ordering, graph);
                }
            }
        }
        ordering[i] = at;
        return i - 1;
    }

    public static Integer[] dagShortestPath(Map<Integer, List<Edge>> graph, int start, int numNodes) {
        int[] topsort = topologicalSort(graph, numNodes);
        Integer[] dist = new Integer[numNodes];
        dist[start] = 0;
        for (int i = 0; i < numNodes; i++) {
            int nodeIndex = topsort[i];
            if (dist[nodeIndex] != null) {
                List<Edge> adjacentEdges = graph.get(nodeIndex);
                if (adjacentEdges != null) {
                    for (Edge edge : adjacentEdges) {
                        int newDist = dist[nodeIndex] + edge.weight;
                        if (dist[edge.to] == null) dist[edge.to] = newDist;
                        else dist[edge.to] = Math.min(dist[edge.to], newDist);
                    }
                }
            }
        }
        return dist;
    }

    public static void main(String[] args) {
        final int N = 7;
        Map<Integer, List<Edge>> graph = new HashMap<>();
        for (int i = 0; i < N; i++) graph.put(i, new ArrayList<>());
        graph.get(0).add(new Edge(0, 1, 3));
        graph.get(0).add(new Edge(0, 2, 2));
        graph.get(0).add(new Edge(0, 5, 3));
        graph.get(1).add(new Edge(1, 3, 1));
        graph.get(1).add(new Edge(1, 2, 6));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 10));
        graph.get(3).add(new Edge(3, 4, 5));
        graph.get(5).add(new Edge(5, 4, 7));
        int[] ordering = topologicalSort(graph, N);
        System.out.println(Arrays.toString(ordering));
        Integer[] dists = dagShortestPath(graph, 0, N);
        System.out.println(dists[4]);
        System.out.println(dists[6]);
    }
}
