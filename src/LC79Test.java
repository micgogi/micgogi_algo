import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 11/20/2021  6:03 PM
 * Rahul Gogyani
 */
public class LC79Test {
    public static void main(String[] args) {
        LC79Test lc79Test = new LC79Test();
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "ABCCED";
        System.out.println(lc79Test.exist(board,word));
    }

    public boolean exist(char[][] board, String word) {
        int[][] dir = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(dfs(board,i,j,word,dir,0)){
                    return true;

                }
            }
        }
    return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int[][] dir, int index) {
        if(index==word.length())return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(index))return false;
        board[i][j]='*';
        for (int k = 0; k <dir.length ; k++) {
            if(dfs(board,i+dir[k][0],j+dir[k][1],word,dir,index+1))return true;
        }
        board[i][j]=word.charAt(index);
        return false;

    }


}

