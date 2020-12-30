import java.util.Arrays;

/**
 * @author Micgogi
 * on 12/30/2020  3:41 PM
 * Rahul Gogyani
 */
public class LC289 {
    private static int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}, {1, 1}, {-1, -1}, {-1, 1}, {1, -1}};

    public static void main(String args[]) {
        int[][] board = {{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }

    public static void gameOfLife(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                int alive = 0;
                for (int[] d : dir) {
                    alive += isAlive(board, i + d[0], j + d[1]) ? 1 : 0;
                }
                if(board[i][j]==0){
                    if(alive ==3){
                        board[i][j] = 2;
                    }
                }else {
                    if(alive!=2 && alive!=3){
                        board[i][j] = 3;
                    }
                }

            }
        }
        for (int i = 0; i < board.length ; i++) {
            for (int j = 0; j < board[i].length ; j++) {
                if(board[i][j] ==2){
                    board[i][j] = 1;
                }
                else if(board[i][j]==3){
                    board[i][j] = 0;
                }
            }
        }
    }

    private static boolean isAlive(int[][] board, int r, int c) {
        return r >= 0 && r < board.length && c >= 0 && c < board[0].length && (board[r][c] == 1 || board[r][c] == 3);
    }
}

