

/**
 * @author Micgogi
 * on 12/19/2020  7:16 PM
 * Rahul Gogyani
 */
public class LC1463 {
    public static void main(String args[]) {
        int[][] grid = {{65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65},
                {65, 78, 75, 73, 84, 65}};
        System.out.println(cherryPickup(grid));
    }

    private static int cherryPickup(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[][][] dp = new int[row][col][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < col; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        return traverse(0, 0, col - 1, dp, grid);

    }

    private static int traverse(int row, int col1, int col2, int[][][] dp, int[][] grid) {
        if (col1 < 0 || col1 >= grid[0].length || col2 < 0 || col2 >= grid[0].length) return 0;

        if (dp[row][col1][col2] != -1) return dp[row][col1][col2];

        int res = 0;
        res += grid[row][col1];
        if (col1 != col2) res += grid[row][col2];
        if (row != grid.length - 1) {
            int max = 0;
            for (int i = -1; i <= 1; i++) {
                for (int j = -1; j <= 1; j++) {
                    max = Math.max(max, traverse(row + 1, col1 + i, col2 + j, dp, grid));
                }

            }
            res += max;
        }

        return dp[row][col1][col2] = res;
    }
}

