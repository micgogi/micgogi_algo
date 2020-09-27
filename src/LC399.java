

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 9/27/2020  12:55 PM
 * Rahul Gogyani
 */
public class LC399 {
    public static void main(String args[]) {
        String[][] equ = {{"a", "b"}, {"b", "c"}};
        List<List<String>> equations = new ArrayList<>();
        for (String[] eq : equ) {
            equations.add(Arrays.asList(eq));
        }
        double[] values = {2.0, 3.0};
        String[][] q = {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};
        List<List<String>> queries = new ArrayList<>();
        for (String[] qu : q) {
            queries.add(Arrays.asList(qu));
        }
        Map<String, Map<String, Double>> graph = buildGraph(equations, values);
        System.out.println(graph);
        double[] res = new double[q.length];
        for (int i = 0; i < q.length ; i++) {
            res[i] = getPathweight(q[i][0],q[i][1],new HashSet<>(),graph);
        }
        System.out.println(Arrays.toString(res));
    }

    public static double getPathweight(String start, String end, Set<String> visited, Map<String, Map<String, Double>> graph) {
        if (!graph.containsKey(start))
            return -1.0;
        if (graph.get(start).containsKey(end))
            return graph.get(start).get(end);
        visited.add(start);
        for (Map.Entry<String, Double> neighbour : graph.get(start).entrySet()) {
            if (!visited.contains(neighbour.getKey())) {
                double productWeight = getPathweight(neighbour.getKey(), end, visited, graph);
                if (productWeight != -1.0) {
                    return neighbour.getValue() * productWeight;
                }
            }
        }
        return -1.0;
    }

    public static Map<String, Map<String, Double>> buildGraph(List<List<String>> equations, double[] values) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        String src, dest;
        for (int i = 0; i < equations.size(); i++) {
            src = equations.get(i).get(0);
            dest = equations.get(i).get(1);
            graph.putIfAbsent(src, new HashMap<>());
            graph.get(src).put(dest, values[i]);
            graph.putIfAbsent(dest, new HashMap<>());
            graph.get(dest).put(src, 1 / values[i]);
        }
        return graph;
    }
}

