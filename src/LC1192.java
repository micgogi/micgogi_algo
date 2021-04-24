import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Micgogi
 * on 4/24/2021  4:35 PM
 * Rahul Gogyani
 */
public class LC1192 {
    public static void main(String args[]) {
        int n = 4;
        Integer[][] g = {{0, 1}, {1, 2}, {2, 0}, {1, 3}};
        List<List<Integer>> connections = Arrays.stream(g).map(Arrays::asList).collect(Collectors.toList());
        System.out.println(connections);
        System.out.println(criticalConnections(n, connections));

    }

    public static List<List<Integer>> criticalConnections(int n, List<List<Integer>> connections) {
        List<List<Integer>> bridges = new ArrayList<>();
        List<List<Integer>> graph = new ArrayList<>();
        boolean[] visited = new boolean[n];
        int[] ids = new int[n];
        int[] low = new int[n];
        int id = 0;
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (List<Integer> connection : connections) {
            int start = connection.get(0);
            int end = connection.get(1);
            graph.get(start).add(end);
            graph.get(end).add(start);
        }
        System.out.println(graph);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i, -1, graph, bridges, visited, ids, low, id);
            }
        }
        return bridges;
    }

    private static void dfs(int at, int parent, List<List<Integer>> graph, List<List<Integer>> bridges, boolean[] visited, int[] ids, int[] low, int id) {
        visited[at] = true;

        low[at] = ids[at] = ++id;

        System.out.println("Low->"+Arrays.toString(low));
        System.out.println("Ids->"+Arrays.toString(ids));
        for (Integer to : graph.get(at)) {
            if (to == parent) continue;
            if (!visited[to]) {
                dfs(to, at, graph, bridges, visited, ids, low, id);
                low[at] = Math.min(low[at], low[to]);
                if (ids[at] < low[to]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(at);
                    list.add(to);
                    bridges.add(list);
                }
            }else {
                low[at] = Math.min(low[at], ids[to]);
            }
        }
    }


}

