package LCMayChallenge;

import java.util.*;

/**
 * @author Micgogi
 * on 5/27/2020  12:52 PM
 * Rahul Gogyani
 */
public class LC886 {
    public static void main(String[] args) {
        int a[][] = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        int n = a.length;
        List<List<Integer>> graph = new ArrayList<>(n + 1);
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] d : a) {
            graph.get(d[0]).add(d[1]);
            graph.get(d[1]).add(d[0]);
        }
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[n + 1];
        Arrays.fill(visited, -1);
        for (int i = 1; i <= n; i++) {
            if (visited[i] == -1) {
                visited[i] = 0;
                queue.offer(i);
                while (!queue.isEmpty()) {
                    int b = queue.poll();
                    for (int v : graph.get(b)) {
                        if (visited[v] == -1) {
                            visited[v] = visited[b] == 0 ? 1 : 0;
                            queue.offer(v);
                        } else if (visited[v] == visited[b]) {
                            System.out.println(false);
                            return;
                        }
                    }
                }
            }


        }
    }
}
