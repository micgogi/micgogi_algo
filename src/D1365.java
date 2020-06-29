import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author Micgogi
 * on 6/29/2020  4:33 PM
 * Rahul Gogyani
 */
public class D1365 {
    static int di[] = {-1, 1, 0, 0};
    static int dj[] = {0, 0, -1, 1};


    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            while (t-- != 0) {
                String s[] = br.readLine().split(" ");
                boolean ans = true;
                int row = Integer.parseInt(s[0]);
                int col = Integer.parseInt(s[1]);
                char c[][] = new char[row][col];
                for (int i = 0; i < row; i++) {
                    String s1 = br.readLine();
                    for (int j = 0; j < col; j++) {
                        c[i][j] = s1.charAt(j);
                    }

                }
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (c[i][j] == 'B') {
                            for (int d = 0; d < 4; d++) {
                                int ni = i + di[d];
                                int nj = j + dj[d];
                                if (ni >= 0 && ni < row && nj >= 0 && nj < col) {
                                    if (c[ni][nj] == 'G') {
                                        ans = false;
                                    } else if (c[ni][nj] != 'B') {
                                        c[ni][nj] = '#';
                                    }
                             }
                            }
                        }
                    }


                }
                boolean visited[][] = new boolean[row][col];
                dfs(row - 1, col - 1, c, visited);
                for (int i = 0; i < row; i++) {
                    for (int j = 0; j < col; j++) {
                        if (c[i][j] == 'G' && !visited[i][j]) {
                            ans = false;
                        }
                    }
                }
                System.out.println(ans ? "Yes" : "No");
            }
        } catch (Exception e) {

        }
    }

    public static void dfs(int i, int j, char c[][], boolean visited[][]) {
        if (c[i][j] != '#')
            visited[i][j] = true;
        else
            return;
        for (int d = 0; d < 4; d++) {
            int ni = i + di[d], nj = j + dj[d];
            if (ni >= 0 && ni < c.length && nj >= 0 && nj < c[0].length && c[ni][nj] != '#' && !visited[ni][nj]) {
                visited[ni][nj] = true;
                dfs(ni, nj, c, visited);
            }
        }
    }
}
