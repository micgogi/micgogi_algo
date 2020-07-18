import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * @author Micgogi
 * on 7/18/2020  3:28 PM
 * Rahul Gogyani
 */
public class LC207Pract {
    static HashMap<Integer, List<Integer>> adjList = new HashMap<>();
    public static void addEdge(int src, int dest){
        adjList.putIfAbsent(src, new ArrayList<>());
        List<Integer> list = adjList.get(src);
        list.add(dest);
        adjList.put(src,list);
    }
    public static void main(String args[]) {
        int n = 2;
        int a[][] = {{1,0}};
        System.out.println(canFinish(n,a));

    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] inDegree = new int[numCourses];
        for (int e[]:prerequisites){
            addEdge(e[1],e[0]);
            inDegree[e[0]]++;
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses ; i++) {
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        int count =0;
        while (!queue.isEmpty()){
            count++;
            int lem = queue.poll();
            if(adjList.containsKey(lem)) {
                for (int elements : adjList.get(lem)) {
                    if (--inDegree[elements] == 0) {
                        queue.add(elements);
                    }
                }
            }
        }
        System.out.println(count==numCourses);
        return count==numCourses;
    }
}

