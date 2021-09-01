package LCJan21Challenge;

import java.util.Arrays;
import java.util.HashMap;
import java.util.PriorityQueue;

/**
 * @author Micgogi
 * on 1/23/2021  5:13 PM
 * Rahul Gogyani
 */
public class LC1329 {
    public static void main(String args[]) {
        int[][] mat = {{65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65}};
        System.out.println(Arrays.deepToString(diagonalSort(mat)));
    }

    public static int[][] diagonalSort(int[][] mat) {
        HashMap<Integer, PriorityQueue<Integer>> map = new HashMap<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                map.putIfAbsent(i - j, new PriorityQueue<>());
                PriorityQueue pq = map.get(i - j);
                pq.add(mat[i][j]);
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = map.get(i - j).poll();
            }
        }
        return mat;
    }

}

