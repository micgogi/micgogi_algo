import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  12:08 PM
 * Rahul Gogyani
 */
public class LC994Test {
    public static void main(String[] args) {
        System.out.println(new LC994Test().orangesRotting(new int[][]{{0,2}}));
    }

    public int orangesRotting(int[][] grid) {
        Queue<int[]> queue = new LinkedList<>();
        int step = 0;
        int totalOranges = 0;
        int[][] visited = new int[grid.length][grid[0].length];
        int[][] dir = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        int totalRotten = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new int[]{i, j});
                    visited[i][j] = 1;
                }
                if (grid[i][j] != 0) {
                    totalOranges++;
                }
            }
        }


        while (!queue.isEmpty()) {
            int size = queue.size();
            totalRotten += size;
            while (size-- != 0) {
                int[] pos = queue.poll();
                int r = pos[0];
                int c = pos[1];

                for (int[] d : dir) {
                    int newR = r + d[0];
                    int newC = c + d[1];
                    if (newR < 0 || newR >= grid.length || newC < 0 || newC >= grid[0].length || visited[newR][newC] == 1||grid[newR][newC]==2||grid[newR][newC]==0)
                        continue;
                    queue.add(new int[]{newR, newC});
                    grid[newR][newC]=2;
                    visited[newR][newC] = 1;
                }


            }
           if(queue.size()!=0) step++;
        }
        if(totalOranges==totalRotten)return step;
        return -1;

    }

}

