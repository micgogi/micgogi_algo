package august21;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 8/20/2021  7:32 PM
 * Rahul Gogyani
 */
public class LC36 {
    public static void main(String args[]) {
        char[][] board = {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'},
                {'6' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};
        System.out.println(isValidSudoku(board));

    }

    public static boolean isValidSudoku(char[][] board) {
        int row = board.length;
        int col = board[0].length;
        HashSet<Character> rowHash[] = new HashSet[row];
        HashSet<Character> colHsh[] = new HashSet[col];
        HashSet<Character> box[] = new HashSet[row];
        for (int i = 0; i <row ; i++) {
            rowHash[i] = new HashSet<>();
            colHsh[i] = new HashSet<>();
            box[i] = new HashSet<>();
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (board[i][j] == '.') continue;
                if (rowHash[i].contains(board[i][j])) {
                    return false;
                }
                rowHash[i].add(board[i][j]);
                if (colHsh[j].contains(board[i][j])) {
                    return false;
                }
                colHsh[j].add(board[i][j]);
                if (box[i / 3 * 3 + j / 3].contains(board[i][j])) {
                    return false;
                }
                box[i / 3 * 3 + j / 3].add(board[i][j]);
            }
        }
        return true;

    }
}

