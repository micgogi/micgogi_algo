package LCApr21Challenge;

import java.util.HashMap;

/**
 * @author Micgogi
 * on 4/17/2021  5:40 PM
 * Rahul Gogyani
 */
public class LC1074 {
    public static void main(String args[]) {
        int[][] matrix = {{0, 1, 0}, {1, 1, 1}, {0, 1, 0}};
        System.out.println(numSubmatrixSumTarget(matrix, 0));
    }

    public static int numSubmatrixSumTarget(int[][] matrix, int target) {
        int r = matrix.length;
        int c = matrix[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < c; j++) {
                map.clear();
                map.put(0, 1);
                int curSum = 0;
                for (int k = 0; k < r; k++) {
                    curSum += matrix[k][j] - (i > 0 ? matrix[k][i - 1] : 0);
                    res += map.getOrDefault(curSum - target, 0);
                    map.put(curSum, map.getOrDefault(curSum, 0) + 1);
                }
            }
        }
        return res;
    }

}

