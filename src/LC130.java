import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/17/2020  12:59 PM
 * Rahul Gogyani
 */
public class LC130 {
    public static void main(String[] args) {
        char[][] board = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}};
        solve(board);
        System.out.println(Arrays.deepToString(board));;
    }

    public static void solve(char[][] board) {
        int r = board.length;
        int c = board[0].length;
        for (int i = 0; i < r; i++) {
            if (board[i][0] == 'O') {
                dfs(board, i, 1);
            }
            if (board[i][c - 1] == 'O') {
                dfs(board, i, c - 2);
            }

        }
        for (int i = 0; i < c; i++) {
            if (board[0][i] == 'O') {
                dfs(board, 1, i);
            }
            if (board[r - 1][i] == 'O') {
                dfs(board, r - 2, i);
            }
        }
        for (int i = 1; i < r - 1; i++) {
            for (int j = 1; j < c - 1; j++) {
                if (board[i][j] == '*') board[i][j] = 'O';
                else if (board[i][j] == 'O') board[i][j] = 'X';
            }
        }
    }

    public static void dfs(char[][] board, int i, int j) {
        if (i <= 0 || j <= 0 || i >= board.length-1 || j >= board[0].length-1 || board[i][j] == 'X')
            return;
        if (board[i][j] == '*')
            return;
        if (board[i][j] == 'O')
            board[i][j] = '*';

        dfs(board, i + 1, j);
        dfs(board, i - 1, j);
        dfs(board, i, j + 1);
        dfs(board, i, j - 1);

    }
}
