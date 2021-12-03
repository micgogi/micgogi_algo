import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 12/3/2021  10:17 PM
 * Rahul Gogyani
 */
public class LC79Test1 {
    public static void main(String args[]) {
     char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
     String s = "ABCCED";
        System.out.println(new LC79Test1().exist(board,s));

    }
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j <board[i].length ; j++) {
                if(dfs(board,i,j,0,word))return true;
            }
        }

        return false;
    }
    int[][] dir = {{0,1},{1,0},{-1,0},{0,-1}};

    public boolean dfs(char[][] board,int i, int j,int index,String word){
        if(index==word.length())return true;
        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=word.charAt(index))return false;
        board[i][j]= '#';
        for (int d[] :dir){
            if(dfs(board,i+d[0],j+d[1],index+1,word))return true;
        }
        board[i][j] = word.charAt(index);
        return false;
    }


}

