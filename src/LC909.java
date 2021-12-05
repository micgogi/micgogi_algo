import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/5/2021  11:39 AM
 * Rahul Gogyani
 */
public class LC909 {
    public static void main(String[] args) {
        System.out.println(new LC909().snakesAndLadders(new int[][]{{-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 35, -1, -1, 13, -1}, {-1, -1, -1, -1, -1, -1}, {-1, 15, -1, -1, -1, -1}}));

    }

    public int snakesAndLadders(int[][] board) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[][] visited = new boolean[board.length][board[0].length];
        int n = board.length;
        int step = 0;
        queue.add(1);
        visited[n-1][0] = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- != 0) {
                int x = queue.poll();
                if (x == n * n) return step;
                for (int i = 1; i <= 6; i++) {
                    int newX = x + i;
                    int[] pos = findCord(newX, n);
                    int r = pos[0];
                    int c = pos[1];
                    if (r<0||r>n||c<0||c>=n||visited[r][c]) continue;

                    visited[r][c] = true;
                    if (board[r][c] == -1) {
                        queue.add(newX);
                    } else {
                        queue.add(board[r][c]);
                    }
                }
            }
            step++;
        }

        return -1;
    }

    public int[] findCord(int element, int n) {
        int r = n - (element - 1) / n - 1;
        int c = (element - 1) % n;
        if (r % 2 == n % 2) return new int[]{r, n - 1 - c};
        else return new int[]{r, c};
    }

}

