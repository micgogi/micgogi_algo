package july21challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/7/2021  1:21 PM
 * Rahul Gogyani
 */


public class LC378 {
    public static void main(String args[]) {

        int k = 2;
        int a[][] = {
                {1, 2},
                {1, 3}};
        System.out.println(kthSmallest(a, k));

    }

    public static int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                priorityQueue.add(matrix[i][j]);
            }
        }
        int ans = matrix[0][0];
        while (k-- != 0) {
            ans = priorityQueue.poll();
        }
        return ans;
    }


}




