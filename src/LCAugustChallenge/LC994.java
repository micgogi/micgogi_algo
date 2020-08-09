package LCAugustChallenge;/*https://leetcode.com/problems/rotting-oranges/
 *@author Rahul Gogyani
 *
 * 12:21 PM 2/7/2020
 */

import java.util.LinkedList;
import java.util.Queue;

public class LC994 {
    public static int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        if (freshOranges == 0) return 0;
        int time = 0;
        int[][] d = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!queue.isEmpty()) {
            time++;
            int size = queue.size();
            while (size-- != 0) {
                int co[] = queue.poll();
                for (int dir[] : d) {
                    int x = co[0] + dir[0];
                    int y = co[1] + dir[1];
                    if (x < 0 || y < 0 || x >= row || y >= col || grid[x][y] == 0 || grid[x][y] == 2) {
                        continue;
                    }
                    grid[x][y] = 2;

                    queue.offer(new int[]{x, y});
                    freshOranges--;
                }
            }
        }
        return freshOranges == 0 ? time - 1 : -1;
    }

    public static void main(String[] args) {
        int a[][] = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(orangesRotting(a));


    }
}
