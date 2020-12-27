import java.util.*;

/**
 * @author Micgogi
 * on 12/27/2020  3:25 PM
 * Rahul Gogyani
 */
public class LC1345 {
    public static void main(String args[]) {
        int[] arr = {65, 78, 75, 73, 84, 65};
        System.out.println(minJumps(arr));

    }

    public static int minJumps(int[] arr) {
        int n = arr.length;
        if (n <= 1) return 0;
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 0; i < n; i++) {
            graph.computeIfAbsent(arr[i], v -> new LinkedList<>()).add(i);
        }
        System.out.println(graph);
        boolean[] visited = new boolean[n];
        visited[0] = true;
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(0);
        int step = 0;
        while (!queue.isEmpty()) {
            for (int size = queue.size(); size > 0; size--) {
                int index = queue.poll();
                if (index == n - 1) return step;
                List<Integer> next = graph.get(arr[index]);
                next.add(index - 1);
                next.add(index + 1);
                for (int j : next) {
                    if (j >= 0 && j < n && !visited[j]) {
                        visited[j] = true;
                        queue.offer(j);
                    }
                }
                next.clear();
            }
            step++;
        }
        return 0;
    }
}

