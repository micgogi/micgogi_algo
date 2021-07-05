import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * @author Micgogi
 * on 7/5/2021  3:01 PM
 * Rahul Gogyani
 */
public class AccCodingQ2 {
    static String word = "hello";
    static char[][] c = {{'h', 'e', 'l', 'l'}, {'c', 't', 'h', 'o'}};

    public static void main(String args[]) {
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                dfs(c, i, j, c.length, c[0].length, new boolean[c.length][c[0].length], new StringBuilder());
            }
        }
        System.out.println(ans);

    }

    static int ans = 0;
    static int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}, {-1, -1}, {-1, 1}, {1, -1}, {1, 1}};

    public static void dfs(char c[][], int i, int j, int row, int col, boolean visited[][], StringBuilder newString) {

        if (i < 0 || j < 0 || i >= row || j >= col || visited[i][j]) return;
        newString.append(c[i][j]);
        visited[i][j] = true;
        if (newString.toString().equals(word)) {
            ans++;
            visited[i][j] = false;
            newString.deleteCharAt(newString.length() - 1);
            return;
        }
        if (newString.charAt(newString.length()-1)!=word.charAt(newString.length()-1)){
            visited[i][j] = false;
            newString.deleteCharAt(newString.length()-1);
            return;
        }
        if (newString.length() > word.length()) {
            visited[i][j] = false;
            newString.deleteCharAt(newString.length() - 1);
            return;
        }
        for (int[] d : dir) {
            int newI = i + d[0];
            int newJ = j + d[1];
            dfs(c, newI, newJ, row, col, visited, newString);

        }
        visited[i][j] = false;
        newString.deleteCharAt(newString.length() - 1);
    }
}

