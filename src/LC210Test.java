import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 12/4/2021  11:14 AM
 * Rahul Gogyani
 */
public class LC210Test {
    Map<Integer, List<Integer>> graph = new HashMap<>();

    public static void main(String args[]) {
        System.out.println(Arrays.toString(new LC210Test().findOrder(4, new int[][]{{1, 0}, {2, 0}, {3, 1}, {3, 2}})));

    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] ans = new int[numCourses];
        int[] inDeg = new int[numCourses];
        for (int[] edge : prerequisites) {
            addEdge(edge[1], edge[0]);
            inDeg[edge[0]]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < inDeg.length; i++) {
            if (inDeg[i] == 0) q.add(i);
        }
        int j = 0;
        while (!q.isEmpty()) {
            int src = q.poll();
            ans[j++] = src;
            if (graph.get(src) != null) {
                List<Integer> list = graph.get(src);
                for (int i = 0; i < list.size(); i++) {
                    inDeg[list.get(i)]--;
                    if (inDeg[list.get(i)] == 0) {
                        q.add(list.get(i));
                    }
                }
            }
        }
        return j == numCourses ? ans : new int[0];
    }

    public void addEdge(int src, int dest) {
        graph.putIfAbsent(src, new ArrayList<>());
        graph.get(src).add(dest);
    }


}

