package Graph;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author Micgogi
 * on 3/16/2020  11:09 PM
 * Rahul Gogyani
 */
public class FloydWarshallAllPairShortestPath {
    class NegativeCycleException extends RuntimeException {

    }

    private static final int INF = 100000;

    public int[][] allPairShortestPath(int[][] distanceMAtrix) {
        int distance[][] = new int[distanceMAtrix.length][distanceMAtrix.length];
        int path[][] = new int[distanceMAtrix.length][distanceMAtrix.length];
        for (int i = 0; i < distanceMAtrix.length; i++) {
            for (int j = 0; j < distanceMAtrix[i].length; j++) {
                distance[i][j] = distanceMAtrix[i][j];
                if (distanceMAtrix[i][j] != INF && i != j) {
                    path[i][j] = i;
                } else {
                    path[i][j] = -1;
                }
            }
        }

        for (int k = 0; k < distanceMAtrix.length; k++) {
            for (int i = 0; i < distanceMAtrix.length; i++) {
                for (int j = 0; j < distanceMAtrix.length; j++) {
                    if (distance[i][k] == INF || distance[k][j] == INF) {
                        continue;
                    }
                    if (distance[i][j] > distance[i][k] + distance[k][j]) {
                        distance[i][j] = distance[i][k] + distance[k][j];
                        path[i][j] = path[k][j];
                    }
                }
            }
        }

        for (int i = 0; i < distance.length; i++) {
            if (distance[i][i] < 0) {
                throw new NegativeCycleException();
            }
        }
        printPath(path, 3, 2);
        return distance;
    }

    public void printPath(int[][] path, int start, int end) {
        if (start < 0 || end < 0 || start >= path.length || end >= path.length) {
            throw new IllegalArgumentException();
        }
        System.out.println("Path between " + start + " " + end);
        Deque<Integer> stack = new LinkedList<>();
        stack.add(end);
        while (true) {
            end = path[start][end];
            if (end == -1) return;
            stack.addFirst(end);
            if (end == start) break;

        }
        while (!stack.isEmpty()) {
            System.out.print(stack.pollFirst() + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int [][] graph = {
                {0,3,6,15},
                {INF, 0,-2, INF},
                {INF, INF, 0,2},
                {1, INF, INF,0}};
        FloydWarshallAllPairShortestPath floydWarshallAllPairShortestPath = new FloydWarshallAllPairShortestPath();
        int[][] distance = floydWarshallAllPairShortestPath.allPairShortestPath(graph);
        System.out.println("minimum distance matrix");
        for (int i = 0; i <distance.length ; i++) {
            for (int j = 0; j <distance.length ; j++) {
                System.out.print(distance[i][j]+" ");
            }
            System.out.println();
            
        }
    }
}
