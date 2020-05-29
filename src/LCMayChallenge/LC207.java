package LCMayChallenge;

import java.util.LinkedList;

/**
 * @author Micgogi
 * on 5/29/2020  2:03 PM
 * Rahul Gogyani
 */
public class LC207 {
    static int v;
    static LinkedList<Integer>[] adjList;




    static void addEdge(int v, int w) {
        adjList[v].add(w);
    }
   static boolean isCycleUtil(int i, boolean[] visited, boolean[] recStack) {
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

    static boolean isCycle() {
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
        int numCourses = 2 ;
        v=numCourses;
        int[][] prerequisites = {{1,0},{0,1}};
        adjList = new LinkedList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            adjList[i] = new LinkedList();
        }
        for (int i = 0; i <prerequisites.length ; i++) {
            addEdge(prerequisites[i][0],prerequisites[i][1]);
        }
        System.out.println(isCycle());

    }
}
