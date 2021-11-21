import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/21/2021  1:21 PM
 * Rahul Gogyani
 */
public class LC959 {
    public static void main(String args[]) {
        System.out.println(new LC959().regionsBySlashes(new String[]{"//", "/ "}));
    }

    public int regionsBySlashes(String[] grid) {
        int row = grid.length;
        int col = grid[0].length();
        boolean[][][] visited = new boolean[row][col][4];
        int region = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                for (int type = 0; type < 4; type++) {
                    if (!visited[i][j][type]) {
                        dfs(grid, i, j, type, visited);
                        region++;
                    }
                }
            }
        }
        return region;
    }

    public void dfs(String[] grid, int i, int j, int type, boolean[][][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length() || visited[i][j][type]) {
            return;
        }
        visited[i][j][type] = true;

        if (type == 0) {
            dfs(grid, i - 1, j, 2, visited);//up
        } else if (type == 1) {
            dfs(grid, i, j + 1, 3, visited);//right
        } else if (type == 2) {
            dfs(grid, i + 1, j, 0, visited);//down
        } else if (type == 3) {
            dfs(grid, i, j - 1, 1, visited);//left
        } else {

        }
        if (grid[i].charAt(j) != '/') {
            dfs(grid, i, j, type ^ 1, visited);
        }
        if (grid[i].charAt(j) != '\\') {
            dfs(grid, i, j, type ^ 3, visited);
        }


    }
}

