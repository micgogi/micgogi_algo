package LCMarch21Challenge;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author Micgogi
 * on 7/22/2020  9:53 AM
 * Rahul Gogyani
 */
public class LC417 {
    public static void main(String args[]) {
        int[][] matrix = {{1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}};
        int[][] pacific = new int[matrix.length][matrix[0].length];
        int[][] atlantic = new int[matrix.length][matrix[0].length];

        for (int col = 0; col < matrix[0].length; col++) {
            dfs(matrix, 0, col, Integer.MIN_VALUE, pacific);
            dfs(matrix, matrix.length - 1, col, Integer.MIN_VALUE, atlantic);
        }
        for (int row = 0; row < matrix.length; row++) {
            dfs(matrix, row, 0, Integer.MIN_VALUE, pacific);
            dfs(matrix, row, matrix[0].length-1, Integer.MIN_VALUE, atlantic);
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int row = 0; row <matrix.length ; row++) {

            for (int col =0;col<matrix[0].length;col++){
                if(pacific[row][col]==1&&atlantic[row][col]==1){
                    LinkedList<Integer> list = new LinkedList<>();
                    list.add(row);
                    list.add(col);
                    result.add(list);
                }
            }
        }
        System.out.println(result);

    }

    public static void dfs(int matrix[][], int row, int col, int preval, int[][] ocean) {
        if (row < 0 || col < 0 || row >matrix.length-1 || col > matrix[0].length-1) {
            return;
        } else if (matrix[row][col] < preval) {
            return;

        } else if (ocean[row][col] == 1) {
            return;
        }
        ocean[row][col] = 1;
        dfs(matrix, row - 1, col, matrix[row][col], ocean);
        dfs(matrix, row + 1, col, matrix[row][col], ocean);
        dfs(matrix, row, col - 1, matrix[row][col], ocean);
        dfs(matrix, row, col + 1, matrix[row][col], ocean);


    }

}

