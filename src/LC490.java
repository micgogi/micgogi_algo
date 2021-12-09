import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/9/2021  1:37 PM
 * Rahul Gogyani
 */
public class LC490 {
    public static void main(String args[]) {
        int[][] maze = {{0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 1, 0}, {1, 1, 0, 1, 1}, {0, 0, 0, 0, 0}};
        System.out.println(new LC490().hasPath(maze, new int[]{0, 4}, new int[]{1, 2}));

    }

    // static boolean found = false;

    public boolean hasPath(int[][] maze, int[] start, int[] destination) {
        //int[][] dir = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

        return dfs(maze, start[0], start[1], destination[0], destination[1]);

    }

    public boolean isValid(int rowm, int col, int[][] maze){
        return rowm>=0&&rowm<maze.length&&col>=0&&col<maze[0].length&&maze[rowm][col]==0;
    }
    public boolean dfs(int[][] maze, int si, int se, int ei, int ej) {
        if (si < 0 | si >= maze.length || se < 0 || se >= maze[0].length || maze[si][se] == 1 || maze[si][se] == 2)
            return false;
        if (si == ei && se == ej) {
            if(isValid(si+1,se,maze)||isValid(si,se+1,maze)||isValid(si-1,se,maze)||isValid(si,se-1,maze))return false;
            return true;
        }
        maze[si][se] = 2;
        if (dfs(maze, si, se + 1, ei, ej) ||
                dfs(maze, si + 1, se, ei, ej) ||
                dfs(maze, si, se - 1, ei, ej) ||
                dfs(maze, si - 1, se, ei, ej)) return true;

        maze[si][se] = 0;
        return false;
    }


}

