package Graph;

import java.util.LinkedList;

/**
 * @author Micgogi
 * on 2/17/2020  9:32 PM
 * Micgogi
 * Time Complexity of this method is same as time complexity of DFS traversal which is O(V+E).
 */
public class DetectCycle {
    static int v;
    static LinkedList<Integer>[] adjList;

    public DetectCycle(int v) {
        this.v = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adjList[i] = new LinkedList();
        }
    }

    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    boolean isCycleUtil(int i, boolean[] visited, boolean[] recStack) {
        if (recStack[i]) return true;
        if (visited[i]) return false;

        visited[i] = true;
        recStack[i] = true;
        LinkedList<Integer> l = adjList[i];
        for (Integer ii : l) {
            if (isCycleUtil(ii, visited, recStack)) return true;
        }
        recStack[i] = false;
        return false;

    }

    boolean isCycle() {
        boolean visited[] = new boolean[v];
        boolean recStack[] = new boolean[v];
        for (int i = 0; i < v; i++) {
            if (isCycleUtil(i, visited, recStack)) {
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        DetectCycle g = new DetectCycle(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        System.out.println(g.isCycle());
    }
}
