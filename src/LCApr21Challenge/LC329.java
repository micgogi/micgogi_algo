package LCApr21Challenge;

/**
 * @author Micgogi
 * on 4/10/2021  12:42 PM
 * Rahul Gogyani
 */
public class LC329 {
    public static void main(String args[]) {
        int[][] mat = {{9, 9, 4}, {6, 6, 8}, {2, 1, 1}};
        int row = mat.length;
        int col = mat[0].length;
        int[][] check = new int[row][col];
        int ans = 1;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                ans = Math.max(ans, dfs(mat, i, j, row, col, check));
            }
        }
        System.out.println(ans);
    }

    static int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public static int dfs(int[][] mat, int i, int j, int row, int col, int[][] check) {
        if (check[i][j] != 0) return check[i][j];
        int max = 1;
        for (int[] d : dir) {
            int x = i + d[0];
            int y = j + d[1];
            if (x < 0 || x >= row || y < 0 || y >= col || mat[x][y] <= mat[i][j]) continue;

            max = Math.max(max, 1 + dfs(mat, x, y, row, col, check));
        }
        check[i][j] = max;
        return max;
    }
}

