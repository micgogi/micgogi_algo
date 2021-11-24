import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 11/24/2021  12:22 PM
 * Rahul Gogyani
 */
public class LC399Test {
    public static void main(String[] args) {
        LC399Test lc399Test = new LC399Test();
        System.out.println(Arrays.toString(lc399Test.calcEquation(Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "c")), new double[]{2.0, 3.0},
                Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("b", "a"), Arrays.asList("a", "e"), Arrays.asList("a", "a"), Arrays.asList("x", "x")))));

    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graoh = buildGraph(equations, values);
        double[] ans = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            ans[i] = dfs(queries.get(i).get(0), queries.get(i).get(1), graoh, new HashSet<>());
        }
        return ans;

    }

    public double dfs(String start, String end, Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (!graph.containsKey(start)) return -1.0;
        if (graph.get(start).containsKey(end)) return graph.get(start).get(end);
        visited.add(start);
        for (String key : graph.get(start).keySet()) {
            if (!visited.contains(key)) {
                double product = dfs(key, end, graph, visited);
                if (product != -1.0) {
                    return graph.get(start).get(key) * product;
                }
            }
        }
        return -1.0;


    }


    public Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            String x = equations.get(i).get(0);
            String y = equations.get(i).get(1);
            graph.putIfAbsent(x, new HashMap<>());
            graph.get(x).put(y, values[i]);
            graph.putIfAbsent(y, new HashMap<>());
            graph.get(y).put(x, 1 / values[i]);
        }
        return graph;

    }
}

